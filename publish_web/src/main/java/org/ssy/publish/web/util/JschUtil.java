package org.ssy.publish.web.util;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import net.sf.expectit.Expect;
import org.apache.log4j.Logger;
import org.ssy.publish.web.core.Result;

public class JschUtil {

  JSch jsch = null;

  private Session session;

  private Channel channel;

  Expect expect = null;

  StringBuffer result = null;

  Logger log = Logger.getLogger(JschUtil.class);


  public JschUtil() {
    jsch=new JSch();


  }


  Result


}
