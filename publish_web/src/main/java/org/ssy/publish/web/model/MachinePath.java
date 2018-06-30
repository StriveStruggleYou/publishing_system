package org.ssy.publish.web.model;

import javax.persistence.*;

@Table(name = "machine_path")
public class MachinePath {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  /**
   * 路径key
   */
  @Column(name = "ms_path_name", columnDefinition = "机器路径名称")
  private String msPathName;

  /**
   * 机器实际路径
   */
  @Column(name = "ms_path", columnDefinition = "机器实际路径")
  private String msPath;

  /**
   * 路径描述
   */
  @Column(name = "ms_desc", columnDefinition = "机器描述")
  private String msDesc;

  /**
   * 属于哪种机器类型
   */
  @Column(name = "ms_type", columnDefinition = "机器类型")
  private Integer msType;

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
   * 获取路径key
   *
   * @return ms_path_name - 路径key
   */
  public String getMsPathName() {
    return msPathName;
  }

  /**
   * 设置路径key
   *
   * @param msPathName 路径key
   */
  public void setMsPathName(String msPathName) {
    this.msPathName = msPathName;
  }

  /**
   * 获取机器实际路径
   *
   * @return ms_path - 机器实际路径
   */
  public String getMsPath() {
    return msPath;
  }

  /**
   * 设置机器实际路径
   *
   * @param msPath 机器实际路径
   */
  public void setMsPath(String msPath) {
    this.msPath = msPath;
  }

  /**
   * 获取路径描述
   *
   * @return ms_desc - 路径描述
   */
  public String getMsDesc() {
    return msDesc;
  }

  /**
   * 设置路径描述
   *
   * @param msDesc 路径描述
   */
  public void setMsDesc(String msDesc) {
    this.msDesc = msDesc;
  }

  /**
   * 获取属于哪种机器类型
   *
   * @return ms_type - 属于哪种机器类型
   */
  public Integer getMsType() {
    return msType;
  }

  /**
   * 设置属于哪种机器类型
   *
   * @param msType 属于哪种机器类型
   */
  public void setMsType(Integer msType) {
    this.msType = msType;
  }
}