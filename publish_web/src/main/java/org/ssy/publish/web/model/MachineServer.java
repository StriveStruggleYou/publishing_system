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
    private String msName;

    /**
     * 机器备注
     */
    @Column(name = "ms_desc")
    private String msDesc;

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
     * 是否初始化过
     */
    @Column(name = "is_initialization")
    private Integer isInitialization;

    /**
     * 连接服务器id
     */
    @Column(name = "connect_ms_id")
    private Integer connectMsId;

    /**
     * 集群Id
     */
    @Column(name = "ms_cluster_id")
    private Integer msClusterId;

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
     * 获取是否初始化过
     *
     * @return is_initialization - 是否初始化过
     */
    public Integer getIsInitialization() {
        return isInitialization;
    }

    /**
     * 设置是否初始化过
     *
     * @param isInitialization 是否初始化过
     */
    public void setIsInitialization(Integer isInitialization) {
        this.isInitialization = isInitialization;
    }

    /**
     * 获取连接服务器id
     *
     * @return connect_ms_id - 连接服务器id
     */
    public Integer getConnectMsId() {
        return connectMsId;
    }

    /**
     * 设置连接服务器id
     *
     * @param connectMsId 连接服务器id
     */
    public void setConnectMsId(Integer connectMsId) {
        this.connectMsId = connectMsId;
    }

    /**
     * 获取集群Id
     *
     * @return ms_cluster_id - 集群Id
     */
    public Integer getMsClusterId() {
        return msClusterId;
    }

    /**
     * 设置集群Id
     *
     * @param msClusterId 集群Id
     */
    public void setMsClusterId(Integer msClusterId) {
        this.msClusterId = msClusterId;
    }
}