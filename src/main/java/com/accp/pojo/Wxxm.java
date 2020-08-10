package com.accp.pojo;

public class Wxxm {
    private Integer wxxmid;

    private Integer wxtypeid;

    private String wxxmname;

    private Integer bz1;

    private Integer bz2;

    private Integer bz3;

    private Double bzjia;
    
    private Double hyjia;
    
    private Double vipjia;
    
    private Double xyjia;
    
    private String wxtypeName;
    
    
    public String getWxtypeName() {
		return wxtypeName;
	}

	public void setWxtypeName(String wxtypeName) {
		this.wxtypeName = wxtypeName;
	}

	public Double getBzjia() {
		return bzjia;
	}

	public void setBzjia(Double bzjia) {
		this.bzjia = bzjia;
	}

	public Double getHyjia() {
		return hyjia;
	}

	public void setHyjia(Double hyjia) {
		this.hyjia = hyjia;
	}

	public Double getVipjia() {
		return vipjia;
	}

	public void setVipjia(Double vipjia) {
		this.vipjia = vipjia;
	}

	public Double getXyjia() {
		return xyjia;
	}

	public void setXyjia(Double xyjia) {
		this.xyjia = xyjia;
	}

	public Integer getWxxmid() {
        return wxxmid;
    }

    public void setWxxmid(Integer wxxmid) {
        this.wxxmid = wxxmid;
    }

    public Integer getWxtypeid() {
        return wxtypeid;
    }

    public void setWxtypeid(Integer wxtypeid) {
        this.wxtypeid = wxtypeid;
    }

    public String getWxxmname() {
        return wxxmname;
    }

    public void setWxxmname(String wxxmname) {
        this.wxxmname = wxxmname == null ? null : wxxmname.trim();
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