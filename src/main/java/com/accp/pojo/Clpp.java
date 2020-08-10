package com.accp.pojo;


public class Clpp {
    private Integer clppid;

    private String clppname;

    private String clppszm;

    private Integer bz1;

    private Integer bz2;

    private Integer bz3;

    public Integer getClppid() {
        return clppid;
    }

    public void setClppid(Integer clppid) {
        this.clppid = clppid;
    }

    public String getClppname() {
        return clppname;
    }

    public void setClppname(String clppname) {
        this.clppname = clppname == null ? null : clppname.trim();
    }

    public String getClppszm() {
        return clppszm;
    }

    public void setClppszm(String clppszm) {
        this.clppszm = clppszm == null ? null : clppszm.trim();
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