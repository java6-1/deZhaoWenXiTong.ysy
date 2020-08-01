package com.accp.pojo;

import java.util.Date;

public class Khcl {
    private Integer khclid;

    private Integer kehuid;

    private String jiescph;

    private String khclpp;

    private String khcljsy;

    private String khcldh;
    
    private Date khclsr;

    private Date khcljcr;

    private Double khcllc;

    private Date khclrq;

    private Integer bz1;

    private Integer bz2;

    private Integer bz3;

    public Integer getKhclid() {
        return khclid;
    }

    public void setKhclid(Integer khclid) {
        this.khclid = khclid;
    }

    public Integer getKehuid() {
        return kehuid;
    }

    public void setKehuid(Integer kehuid) {
        this.kehuid = kehuid;
    }

    public String getJiescph() {
        return jiescph;
    }

    public void setJiescph(String jiescph) {
        this.jiescph = jiescph == null ? null : jiescph.trim();
    }

    public String getKhclpp() {
        return khclpp;
    }

    public void setKhclpp(String khclpp) {
        this.khclpp = khclpp == null ? null : khclpp.trim();
    }

    public String getKhcljsy() {
        return khcljsy;
    }

    public void setKhcljsy(String khcljsy) {
        this.khcljsy = khcljsy == null ? null : khcljsy.trim();
    }

    public String getKhcldh() {
        return khcldh;
    }

    public void setKhcldh(String khcldh) {
        this.khcldh = khcldh == null ? null : khcldh.trim();
    }

    public Date getKhclsr() {
        return khclsr;
    }

    public void setKhclsr(Date khclsr) {
        this.khclsr = khclsr;
    }

    public Date getKhcljcr() {
        return khcljcr;
    }

    public void setKhcljcr(Date khcljcr) {
        this.khcljcr = khcljcr;
    }

    public Double getKhcllc() {
        return khcllc;
    }

    public void setKhcllc(Double khcllc) {
        this.khcllc = khcllc;
    }

    public Date getKhclrq() {
        return khclrq;
    }

    public void setKhclrq(Date khclrq) {
        this.khclrq = khclrq;
    }

    public Integer getBz1() {
        return bz1;
    }

    public void setBz1(Integer bz1) {
        this.bz1 = bz1;
    }

    public Integer getBz2() {
        return bz2;
    }

    public void setBz2(Integer bz2) {
        this.bz2 = bz2;
    }

    public Integer getBz3() {
        return bz3;
    }

    public void setBz3(Integer bz3) {
        this.bz3 = bz3;
    }
}