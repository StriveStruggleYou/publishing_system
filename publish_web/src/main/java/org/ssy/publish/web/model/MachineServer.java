package org.ssy.publish.web.model;

import javax.persistence.*;

@Table(name = "machine_server")
public class MachineServer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  /**
   * 机器名称
   */
  @Column(name = "ms_name", columnDefinition = "机器名称")
  private String msName;

  /**
   * 机器备注
   */
  @Column(name = "ms_desc", columnDefinition = "机器描述")
  private String msDesc;

  /**
   * 内网IP列表
   */
  @Column(name = "ms_intranet_list", columnDefinition = "内网IP列表")
  private String msIntranetList;

  /**
   * 外网IP列表
   */
  @Column(name = "ms_outernet_list", columnDefinition = "外网IP列表")
  private String msOuternetList;

  /**
   * 机器类型
   */
  @Column(name = "ms_type",columnDefinition = "机器类型")
  private Integer msType;

  /**
   * 端口使用列表
   */
  @Column(name = "ms_port_list",columnDefinition = "端口使用列表")
  private String msPortList;

  /**
   * 开发端口
   */
  @Column(name = "ms_open_port_list",columnDefinition = "开发端口")
  private String msOpenPortList;

  @Column(name = "is_initialization",columnDefinition = "是否初始化过")
  private Integer isInitialization;

  @Column(name = "connect_ms_id",columnDefinition = "连接机器Id")
  private Integer connectMsId;

  /**
   * @return id
   */
  public Integer getId() {
    return id;
  }

  /**
   * @param id
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 获取机器名称
   *
   * @return ms_name - 机器名称
   */
  public String getMsName() {
    return msName;
  }

  /**
   * 设置机器名称
   *
   * @param msName 机器名称
   */
  public void setMsName(String msName) {
    this.msName = msName;
  }

  /**
   * 获取机器备注
   *
   * @return ms_desc - 机器备注
   */
  public String getMsDesc() {
    return msDesc;
  }

  /**
   * 设置机器备注
   *
   * @param msDesc 机器备注
   */
  public void setMsDesc(String msDesc) {
    this.msDesc = msDesc;
  }

  /**
   * 获取内网IP列表
   *
   * @return ms_intranet_list - 内网IP列表
   */
  public String getMsIntranetList() {
    return msIntranetList;
  }

  /**
   * 设置内网IP列表
   *
   * @param msIntranetList 内网IP列表
   */
  public void setMsIntranetList(String msIntranetList) {
    this.msIntranetList = msIntranetList;
  }

  /**
   * 获取外网IP列表
   *
   * @return ms_outernet_list - 外网IP列表
   */
  public String getMsOuternetList() {
    return msOuternetList;
  }

  /**
   * 设置外网IP列表
   *
   * @param msOuternetList 外网IP列表
   */
  public void setMsOuternetList(String msOuternetList) {
    this.msOuternetList = msOuternetList;
  }

  /**
   * 获取机器类型
   *
   * @return ms_type - 机器类型
   */
  public Integer getMsType() {
    return msType;
  }

  /**
   * 设置机器类型
   *
   * @param msType 机器类型
   */
  public void setMsType(Integer msType) {
    this.msType = msType;
  }

  /**
   * 获取端口使用列表
   *
   * @return ms_port_list - 端口使用列表
   */
  public String getMsPortList() {
    return msPortList;
  }

  /**
   * 设置端口使用列表
   *
   * @param msPortList 端口使用列表
   */
  public void setMsPortList(String msPortList) {
    this.msPortList = msPortList;
  }

  /**
   * 获取开发端口
   *
   * @return ms_open_port_list - 开发端口
   */
  public String getMsOpenPortList() {
    return msOpenPortList;
  }

  /**
   * 设置开发端口
   *
   * @param msOpenPortList 开发端口
   */
  public void setMsOpenPortList(String msOpenPortList) {
    this.msOpenPortList = msOpenPortList;
  }

  /**
   * @return is_initialization
   */
  public Integer getIsInitialization() {
    return isInitialization;
  }

  /**
   * @param isInitialization
   */
  public void setIsInitialization(Integer isInitialization) {
    this.isInitialization = isInitialization;
  }

  /**
   * @return connect_ms_id
   */
  public Integer getConnectMsId() {
    return connectMsId;
  }

  /**
   * @param connectMsId
   */
  public void setConnectMsId(Integer connectMsId) {
    this.connectMsId = connectMsId;
  }
}