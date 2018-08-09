package org.ssy.publish.web.enums;

public enum InitMachineEnum {

  INIT_JUMP_MACHINE(1, "跳板机"),

  INIT_STORE_MACHINE(2, "存储机"),

  INIT_PACK_MACHINE(3, "打包机"),

  INIT_DEPLOY_MACHINE(4, "应用发布机"),

  INIT_MIDDLEWARE_MACHINE(5, "中间件机器");

  InitMachineEnum(int code, String desc) {
    this.code = code;
    this.desc = desc;
  }

  private int code;

  private String desc;

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }
}
