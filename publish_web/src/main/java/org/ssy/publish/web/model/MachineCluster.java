package org.ssy.publish.web.model;

import javax.persistence.*;

@Table(name = "machine_cluster")
public class MachineCluster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 集群名称
     */
    @Column(name = "cluster_name")
    private String clusterName;

    /**
     * 集群描述
     */
    @Column(name = "cluster_desc")
    private String clusterDesc;

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
     * 获取集群名称
     *
     * @return cluster_name - 集群名称
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * 设置集群名称
     *
     * @param clusterName 集群名称
     */
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * 获取集群描述
     *
     * @return cluster_desc - 集群描述
     */
    public String getClusterDesc() {
        return clusterDesc;
    }

    /**
     * 设置集群描述
     *
     * @param clusterDesc 集群描述
     */
    public void setClusterDesc(String clusterDesc) {
        this.clusterDesc = clusterDesc;
    }
}