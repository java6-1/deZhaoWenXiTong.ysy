package com.accp.pojo;

public class Xj {
    private Integer xjid;

    private String xjname;

    private Long xjtime;

    private double xjfei;

    private Integer bz2;

    private Integer bz3;

    public Integer getXjid() {
        return xjid;
    }

    public void setXjid(Integer xjid) {
        this.xjid = xjid;
    }

    public String getXjname() {
        return xjname;
    }

    public void setXjname(String xjname) {
        this.xjname = xjname == null ? null : xjname.trim();
    }

    public Long getXjtime() {
        return xjtime;
    }

    public void setXjtime(Long xjtime) {
        this.xjtime = xjtime;
    }



    public double getXjfei() {
		return xjfei;
	}

	public void setXjfei(double xjfei) {
		this.xjfei = xjfei;
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