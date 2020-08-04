package com.accp.pojo;

import java.util.Date;

public class HuiYuang {
    private Integer huiyuanid;

    private String phone;

    private String huiyuanname;

    private String huiyuanpwd;

    private Date ri;

    private String jifen;

    public Integer getHuiyuanid() {
        return huiyuanid;
    }

    public void setHuiyuanid(Integer huiyuanid) {
        this.huiyuanid = huiyuanid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getHuiyuanname() {
        return huiyuanname;
    }

    public void setHuiyuanname(String huiyuanname) {
        this.huiyuanname = huiyuanname == null ? null : huiyuanname.trim();
    }

    public String getHuiyuanpwd() {
        return huiyuanpwd;
    }

    public void setHuiyuanpwd(String huiyuanpwd) {
        this.huiyuanpwd = huiyuanpwd == null ? null : huiyuanpwd.trim();
    }

    public Date getRi() {
        return ri;
    }

    public void setRi(Date ri) {
        this.ri = ri;
    }

    public String getJifen() {
        return jifen;
    }

    public void setJifen(String jifen) {
        this.jifen = jifen == null ? null : jifen.trim();
    }
}