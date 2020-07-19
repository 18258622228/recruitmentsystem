package com.igeek.rs.entity;

import java.io.Serializable;

/**
 * (Personinfo)实体类
 *
 * @author makejava
 * @since 2020-07-15 14:55:55
 */
public class Personinfo implements Serializable {
    private static final long serialVersionUID = -23601949692465919L;
    
    private Integer id;
    
    private Integer userid;
    
    private Integer jobid;
    
    private Integer companyid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    @Override
    public String toString() {
        return "Personinfo{" +
                "id=" + id +
                ", userid=" + userid +
                ", jobid=" + jobid +
                ", companyid=" + companyid +
                '}';
    }
}