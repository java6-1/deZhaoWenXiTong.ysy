package com.accp.pojo;

public class Weixiusp {
    private Integer weixiuspid;

    private Integer weixiujlid;

    private String weixiuspname;

    private Double weixiuspbzpice;
    private Integer weixiuspsum;
    
    

    public Integer getWeixiuspsum() {
		return weixiuspsum;
	}

	public void setWeixiuspsum(Integer weixiuspsum) {
		this.weixiuspsum = weixiuspsum;
	}

	public Integer getWeixiuspid() {
        return weixiuspid;
    }

    public void setWeixiuspid(Integer weixiuspid) {
        this.weixiuspid = weixiuspid;
    }

    public Integer getWeixiujlid() {
        return weixiujlid;
    }

    public void setWeixiujlid(Integer weixiujlid) {
        this.weixiujlid = weixiujlid;
    }

    public String getWeixiuspname() {
        return weixiuspname;
    }

    public void setWeixiuspname(String weixiuspname) {
        this.weixiuspname = weixiuspname == null ? null : weixiuspname.trim();
    }

    public Double getWeixiuspbzpice() {
        return weixiuspbzpice;
    }

    public void setWeixiuspbzpice(Double weixiuspbzpice) {
        this.weixiuspbzpice = weixiuspbzpice;
    }

    
    
	public Weixiusp() {
		super();
	}

	public Weixiusp(Integer weixiujlid, String weixiuspname, Double weixiuspbzpice) {
		super();
		this.weixiujlid = weixiujlid;
		this.weixiuspname = weixiuspname;
		this.weixiuspbzpice = weixiuspbzpice;
	}

	
    
    
}