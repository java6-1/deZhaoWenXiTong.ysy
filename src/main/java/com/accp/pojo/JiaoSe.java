package com.accp.pojo;

import java.util.ArrayList;
import java.util.List;

public class JiaoSe {
    private Integer jiaoseid;

    private String biaoshi;

    private String jiaosename;
    private List<CaiDan> listCaiDan = new ArrayList<CaiDan>();
   

	public List<CaiDan> getListCaiDan() {
		return listCaiDan;
	}

	public void setListCaiDan(List<CaiDan> listCaiDan) {
		this.listCaiDan = listCaiDan;
	}

	public Integer getJiaoseid() {
        return jiaoseid;
    }

    public void setJiaoseid(Integer jiaoseid) {
        this.jiaoseid = jiaoseid;
    }

    public String getBiaoshi() {
        return biaoshi;
    }

    public void setBiaoshi(String biaoshi) {
        this.biaoshi = biaoshi == null ? null : biaoshi.trim();
    }

    public String getJiaosename() {
        return jiaosename;
    }

    public void setJiaosename(String jiaosename) {
        this.jiaosename = jiaosename == null ? null : jiaosename.trim();
    }
}