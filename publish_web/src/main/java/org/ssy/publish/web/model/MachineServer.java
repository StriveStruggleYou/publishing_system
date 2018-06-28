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
    @Column(name = "ms_name")
    private Integer msName;

    /**
     * 机器备注
     */
    @Column(name = "ms_desc")
    private Integer msDesc;

    /**
     * 内网IP列表
     */
    @Column(name = "ms_intranet_list")
    private String msIntranetList;

    /**
     * 外网IP列表
     */
    @Column(name = "ms_outernet_list")
    private String msOuternetList;

    /**
     * 机器类型
     */
    @Column(name = "ms_type")
    private Integer msType;

    /**
     * 端口使用列表
     */
    @Column(name = "ms_port_list")
    private String msPortList;

    /**
     * 开发端口
     */
    @Column(name = "ms_open_port_list")
    private String msOpenPortList;

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
    public Integer getMsName() {
        return msName;
    }

    /**
     * 设置机器名称
     *
     * @param msName 机器名称
     */
    public void setMsName(Integer msName) {
        this.msName = msName;
    }

    /**
     * 获取机器备注
     *
     * @return ms_desc - 机器备注
     */
    public Integer getMsDesc() {
        return msDesc;
    }

    /**
     * 设置机器备注
     *
     * @param msDesc 机器备注
     */
    public void setMsDesc(Integer msDesc) {
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
}