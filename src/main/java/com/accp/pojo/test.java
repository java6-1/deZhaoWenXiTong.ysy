package com.accp.pojo;

import java.util.Date;

public class test {
    private Integer stuno;

    private String stuname;

    private String stupwd;

    private String stusex;

    private Date studate;

    private Boolean wq;

    public Integer getStuno() {
        return stuno;
    }

    public void setStuno(Integer stuno) {
        this.stuno = stuno;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public String getStupwd() {
        return stupwd;
    }

    public void setStupwd(String stupwd) {
        this.stupwd = stupwd == null ? null : stupwd.trim();
    }

    public String getStusex() {
        return stusex;
    }

    public void setStusex(String stusex) {
        this.stusex = stusex == null ? null : stusex.trim();
    }

    public Date getStudate() {
        return studate;
    }

    public void setStudate(Date studate) {
        this.studate = studate;
    }

    public Boolean getWq() {
        return wq;
    }

    public void setWq(Boolean wq) {
        this.wq = wq;
    }
}