package org.ssy.publish.web.model;

import javax.persistence.*;

public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "app_name")
    private String appName;

    @Column(name = "app_desc")
    private String appDesc;

    @Column(name = "app_port_list")
    private Integer appPortList;

    @Column(name = "project_id")
    private Integer projectId;

    /**
     * git项目地址
     */
    @Column(name = "project_name")
    private String projectName;

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
     * @return app_name
     */
    public String getAppName() {
        return appName;
    }

    /**
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * @return app_desc
     */
    public String getAppDesc() {
        return appDesc;
    }

    /**
     * @param appDesc
     */
    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc;
    }

    /**
     * @return app_port_list
     */
    public Integer getAppPortList() {
        return appPortList;
    }

    /**
     * @param appPortList
     */
    public void setAppPortList(Integer appPortList) {
        this.appPortList = appPortList;
    }

    /**
     * @return project_id
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * @param projectId
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取git项目地址
     *
     * @return project_name - git项目地址
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置git项目地址
     *
     * @param projectName git项目地址
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}