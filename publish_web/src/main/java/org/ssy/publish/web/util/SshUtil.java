package org.ssy.publish.web.util;

import java.util.ArrayList;
import java.util.List;
import org.ssy.publish.web.core.Result;
import org.ssy.publish.web.core.ResultCode;

public class SshUtil {

    public List<String> listSshRsaPub(String host) {
        List<String> pubList = new ArrayList<>();
        JschUtil jschUtil = new JschUtil();
        jschUtil.init(host);
        jschUtil.runShellCmd("cat /home/admin/.ssh/authorized_keys");
        jschUtil.close();
        String keyList = jschUtil.result.toString();
        String[] key = keyList.split(jschUtil.newline);
        for (int i = 0; i < key.length; i++) {
            if (key[i].startsWith("ssh-rsa")) {
                pubList.add(key[i]);
            }
        }
        return pubList;
    }

    public Result addSshRsaPub(String host, String rsaPub) {
        Result result = new Result();
        JschUtil jschUtil = new JschUtil();
        jschUtil.init(host);
        jschUtil.runShellCmd("echo " + rsaPub + " >> /home/admin/.ssh/authorized_keys");
        jschUtil.close();
        result.setCode(ResultCode.SUCCESS);
        return result;
    }


    public Result removeSshRsaPub(String host, String rsaPub) {
        Result result = new Result();
        StringBuffer sb = new StringBuffer();
        char charPub[] = rsaPub.toCharArray();
        //目前只能手动转行成可以识别的字符
        for (int i = 0; i < rsaPub.length(); i++) {
            if (charPub[i] == '/') {
                sb.append("\\").append(charPub[i]);
            } else {
                sb.append(charPub[i]);
            }
        }
        JschUtil jschUtil = new JschUtil();
        jschUtil.init(host);
        jschUtil.runShellCmd("sed -i '/" + sb.toString() + "/d' /home/admin/.ssh/authorized_keys");
        jschUtil.close();
        result.setCode(ResultCode.SUCCESS);
        return result;
    }


}
