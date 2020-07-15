package com.igeek.rs.entity;

import java.io.Serializable;
import java.util.Date;

public class CompanyUser implements Serializable {
    private static final long serialVersionUID = 713507511618643705L;

    private Integer id;
    private String companyname;
    private String password;
    private String email;
    private String phone;
    private Date date;

    public CompanyUser(Integer id, String companyname, String password, String email, String phone, Date date) {
        this.id = id;
        this.companyname = companyname;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.date = date;
    }

    public CompanyUser() {
    }

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

    @Override
    public String toString() {
        return "CompanyUser{" +
                "id=" + id +
                ", companyname='" + companyname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", date=" + date +
                '}';
    }
}

