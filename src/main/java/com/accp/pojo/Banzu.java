package com.accp.pojo;


public class Banzu {
    private Integer bzid;

    private String bzname;

    private Integer bz1;

    private Integer bz2;

    private Integer bzz3;

    public Integer getBzid() {
        return bzid;
    }

    public void setBzid(Integer bzid) {
        this.bzid = bzid;
    }

    public String getBzname() {
        return bzname;
    }

    public void setBzname(String bzname) {
        this.bzname = bzname == null ? null : bzname.trim();
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

    public Integer getBzz3() {
        return bzz3;
    }

    public void setBzz3(Integer bzz3) {
        this.bzz3 = bzz3;
    }
}