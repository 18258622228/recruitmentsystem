package com.igeek.rs.entity;

import java.io.Serializable;

/**
 * (Companyjob)实体类
 *
 * @author makejava
 * @since 2020-07-15 14:54:56
 */
public class Companyjob implements Serializable {
    private static final long serialVersionUID = 309320142238868080L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 公司名
    */
    private String companyname;
    /**
    * 工作简介
    */
    private String jobsummary;
    /**
    * 工作要求
    */
    private String require;
    /**
    * 工作种类
    */
    private String jobtype;
    /**
    * 工作经验
    */
    private String jobexperience;
    /**
    * 学历要求
    */
    private String education;
    /**
    * 企业用户id
    */
    private Integer companyid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getJobsummary() {
        return jobsummary;
    }

    public void setJobsummary(String jobsummary) {
        this.jobsummary = jobsummary;
    }

    public String getRequire() {
        return require;
    }

    public void setRequire(String require) {
        this.require = require;
    }

    public String getJobtype() {
        return jobtype;
    }

    public void setJobtype(String jobtype) {
        this.jobtype = jobtype;
    }

    public String getJobexperience() {
        return jobexperience;
    }

    public void setJobexperience(String jobexperience) {
        this.jobexperience = jobexperience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    @Override
    public String toString() {
        return "Companyjob{" +
                "id=" + id +
                ", companyname='" + companyname + '\'' +
                ", jobsummary='" + jobsummary + '\'' +
                ", require='" + require + '\'' +
                ", jobtype='" + jobtype + '\'' +
                ", jobexperience='" + jobexperience + '\'' +
                ", education='" + education + '\'' +
                ", companyid=" + companyid +
                '}';
    }
}