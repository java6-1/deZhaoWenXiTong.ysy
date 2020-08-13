package com.accp.pojo;

public class CaiDan {
    private Integer caidanid;

    private String menuname;

    private String pageurl;

    private Integer caidanidfu;

    private Integer dengji;

    private String controlleraction;
    private CaiDan fuCaiDan;//夫菜单对象用于映射
    private String caozuo;//权限
    public String getCaozuo() {
		return caozuo;
	}

	public void setCaozuo(String caozuo) {
		this.caozuo = caozuo;
	}

	public CaiDan getFuCaiDan() {
		return fuCaiDan;
	}

	public void setFuCaiDan(CaiDan fuCaiDan) {
		this.fuCaiDan = fuCaiDan;
	}

	public Integer getCaidanid() {
        return caidanid;
    }

    public void setCaidanid(Integer caidanid) {
        this.caidanid = caidanid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getPageurl() {
        return pageurl;
    }

    public void setPageurl(String pageurl) {
        this.pageurl = pageurl == null ? null : pageurl.trim();
    }

    public Integer getCaidanidfu() {
        return caidanidfu;
    }

    public void setCaidanidfu(Integer caidanidfu) {
        this.caidanidfu = caidanidfu;
    }

    public Integer getDengji() {
        return dengji;
    }

    public void setDengji(Integer dengji) {
        this.dengji = dengji;
    }

    public String getControlleraction() {
        return controlleraction;
    }

    public void setControlleraction(String controlleraction) {
        this.controlleraction = controlleraction == null ? null : controlleraction.trim();
    }
}