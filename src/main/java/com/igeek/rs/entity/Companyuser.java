package com.igeek.rs.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Companyuser)实体类
 *
 * @author makejava
 * @since 2020-07-15 14:54:12
 */
public class Companyuser implements Serializable {
    private static final long serialVersionUID = 112661966370149977L;
    /**
    * 主键id
    */
    private Integer id;
    /**
    * 密码
    */
    private String password;
    /**
    * 邮箱
    */
    private String email;
    /**
    * 电话
    */
    private String phone;
    /**
    * 注册日期
    */
    private Date date;
    /**
    * 公司名称
    */
    private String companyname;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    @Override
    public String toString() {
        return "Companyuser{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", date=" + date +
                ", companyname='" + companyname + '\'' +
                '}';
    }
}