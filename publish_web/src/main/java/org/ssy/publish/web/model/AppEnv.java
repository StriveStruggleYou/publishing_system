package org.ssy.publish.web.model;

import javax.persistence.*;

@Table(name = "app_env")
public class AppEnv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "app_id")
    private Integer appId;

    @Column(name = "env_type")
    private Integer envType;

    @Column(name = "jump_ms_id")
    private Integer jumpMsId;

    @Column(name = "pack_ms_id")
    private Integer packMsId;

    /**
     * 可能是一个机器集群
     */
    @Column(name = "publish_ms_list")
    private String publishMsList;

    @Column(name = "publish_ms_port")
    private String publishMsPort;

    @Column(name = "rollback_ms_id")
    private Integer rollbackMsId;

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
     * @return app_id
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * @param appId
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * @return env_type
     */
    public Integer getEnvType() {
        return envType;
    }

    /**
     * @param envType
     */
    public void setEnvType(Integer envType) {
        this.envType = envType;
    }

    /**
     * @return jump_ms_id
     */
    public Integer getJumpMsId() {
        return jumpMsId;
    }

    /**
     * @param jumpMsId
     */
    public void setJumpMsId(Integer jumpMsId) {
        this.jumpMsId = jumpMsId;
    }

    /**
     * @return pack_ms_id
     */
    public Integer getPackMsId() {
        return packMsId;
    }

    /**
     * @param packMsId
     */
    public void setPackMsId(Integer packMsId) {
        this.packMsId = packMsId;
    }

    /**
     * 获取可能是一个机器集群
     *
     * @return publish_ms_list - 可能是一个机器集群
     */
    public String getPublishMsList() {
        return publishMsList;
    }

    /**
     * 设置可能是一个机器集群
     *
     * @param publishMsList 可能是一个机器集群
     */
    public void setPublishMsList(String publishMsList) {
        this.publishMsList = publishMsList;
    }

    /**
     * @return publish_ms_port
     */
    public String getPublishMsPort() {
        return publishMsPort;
    }

    /**
     * @param publishMsPort
     */
    public void setPublishMsPort(String publishMsPort) {
        this.publishMsPort = publishMsPort;
    }

    /**
     * @return rollback_ms_id
     */
    public Integer getRollbackMsId() {
        return rollbackMsId;
    }

    /**
     * @param rollbackMsId
     */
    public void setRollbackMsId(Integer rollbackMsId) {
        this.rollbackMsId = rollbackMsId;
    }
}