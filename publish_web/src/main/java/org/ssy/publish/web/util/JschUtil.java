package org.ssy.publish.web.util;

import static net.sf.expectit.matcher.Matchers.contains;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.sf.expectit.Expect;
import net.sf.expectit.ExpectBuilder;
import org.apache.log4j.Logger;
import org.ssy.publish.web.core.Result;
import org.ssy.publish.web.core.ResultCode;

public class JschUtil {

    JSch jsch = null;

    //单独使用session 是有一些优化空间的，连接时间可以节约一到两秒的时间
    private Session session;

    private Channel channel;

    Expect expect = null;

    StringBuffer result;

    private String terminator;

    public String newline;

    Logger log = Logger.getLogger(JschUtil.class);


    public JschUtil() {
        jsch = new JSch();
        terminator = "]$ ";
        newline = "\r\n";
        result = new StringBuffer();
    }


    public int init(String host) {
        return init("admin", host);
    }

    private int init(String userName, String host) {
        try {
            session = jsch.getSession(userName, host, 22);
            String privateKey = "~/.ssh/id_rsa";
            jsch.addIdentity(privateKey);
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.connect();
            channel = session.openChannel("shell");
            channel.connect(1000);
            expect = new ExpectBuilder()
                    .withOutput(channel.getOutputStream())
                    .withInputs(channel.getInputStream(), channel.getExtInputStream())
                    .withCharset(Charset.forName("UTF-8"))
                    .withTimeout(10, TimeUnit.MINUTES)
                    .withEchoInput(new AppendableAdapter())
                    .withExceptionOnFailure()
                    .build();
        } catch (Exception e) {
            log.error("init error", e);
            return 1;
        }
        return 0;
    }


    public void close() {
        channel.disconnect();
        session.disconnect();

    }

    public Result runShell(String shellPath) {
        Result result = new Result();

        result.setCode(ResultCode.SUCCESS);
        String deployCmd = "sh " + shellPath;
        try {
            expect.sendLine(deployCmd);
            Integer temps = 0;
            int pan = 0;
            while (true) {
                Thread.sleep(100);
                String text = result.toString();
                if (temps.equals(text.length())) {
                    pan += 1;
                    temps = text.length();
                    if (pan >= 100 && text.endsWith(terminator)) {
                        break;
                    } else if (pan >= 100) {
                        expect.expect(contains("$")).getInput();
                    }
                } else {
                    //存入日志
                    temps = text.length();
                    pan = 0;
                }
            }
        } catch (Exception e) {
            log.error("runShell error", e);
            result.setCode(ResultCode.FAIL);
        }
        return result;
    }


    public Result runShellCmd(String shellCmd) {
        Result code = new Result();

        code.setCode(ResultCode.SUCCESS);
        try {
            expect.sendLine(shellCmd);
            Integer temps = 0;
            int pan = 0;
            while (true) {
                Thread.sleep(100);
                String text = result.toString();
                if (temps.equals(text.length())) {
                    pan += 1;
                    temps = text.length();
                    if (pan >= 10 && text.endsWith(terminator)) {
                        break;
                    } else if (pan >= 10) {
                        expect.expect(contains("$")).getInput();
                    }
                } else {
                    //存入日志
                    temps = text.length();
                    pan = 0;
                }
            }
        } catch (Exception e) {
            log.error("runShell error", e);
            code.setCode(ResultCode.FAIL);
        }
        return code;
    }


    class AppendableAdapter implements Appendable {

        @Override
        public Appendable append(CharSequence csq) throws IOException {
            result.append(csq);
            return this;
        }

        @Override
        public Appendable append(CharSequence csq, int start, int end) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override
        public Appendable append(char c) throws IOException {
            throw new UnsupportedOperationException();
        }

    }

    public String getResult() {
        return result.toString();
    }
    


}
