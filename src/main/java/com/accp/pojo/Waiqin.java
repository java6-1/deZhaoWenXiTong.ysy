package com.accp.pojo;

public class Waiqin {
    private Integer waiqinid;

    private Integer bzid;

    private String jiescph;

    private String waiqinpp;

    private Integer waiqinlc;

    private String waiqinbm;

    private Integer zt;

    private Integer bz1;

    private Integer bz2;

    private Integer bz3;
    
    private String bzname;
    
    

    public String getBzname() {
		return bzname;
	}

	public void setBzname(String bzname) {
		this.bzname = bzname;
	}

	public Integer getWaiqinid() {
        return waiqinid;
    }

    public void setWaiqinid(Integer waiqinid) {
        this.waiqinid = waiqinid;
    }

    public Integer getBzid() {
        return bzid;
    }

    public void setBzid(Integer bzid) {
        this.bzid = bzid;
    }

    public String getJiescph() {
        return jiescph;
    }

    public void setJiescph(String jiescph) {
        this.jiescph = jiescph == null ? null : jiescph.trim();
    }

    public String getWaiqinpp() {
        return waiqinpp;
    }

    public void setWaiqinpp(String waiqinpp) {
        this.waiqinpp = waiqinpp == null ? null : waiqinpp.trim();
    }

    public Integer getWaiqinlc() {
        return waiqinlc;
    }

    public void setWaiqinlc(Integer waiqinlc) {
        this.waiqinlc = waiqinlc;
    }

    public String getWaiqinbm() {
        return waiqinbm;
    }

    public void setWaiqinbm(String waiqinbm) {
        this.waiqinbm = waiqinbm == null ? null : waiqinbm.trim();
    }

    public Integer getZt() {
        return zt;
    }

    public void setZt(Integer zt) {
        this.zt = zt;
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