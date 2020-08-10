package com.accp.pojo;

public class JiaoSeGongNeng {
    private Integer gjid;

    private Integer jiaoseid;

    private Integer caidanid;

    private String caozuo;

    public Integer getGjid() {
        return gjid;
    }

    public void setGjid(Integer gjid) {
        this.gjid = gjid;
    }

    public Integer getJiaoseid() {
        return jiaoseid;
    }

    public void setJiaoseid(Integer jiaoseid) {
        this.jiaoseid = jiaoseid;
    }

    public Integer getCaidanid() {
        return caidanid;
    }

    public void setCaidanid(Integer caidanid) {
        this.caidanid = caidanid;
    }

    public String getCaozuo() {
        return caozuo;
    }

    public void setCaozuo(String caozuo) {
        this.caozuo = caozuo == null ? null : caozuo.trim();
    }
}