package com.accp.pojo;


public class Chexing {
    private Integer chexingid;

    private Integer clppid;

    private String fdjpp;

    private String khclpp;

    private String chexingname;

    private Long chexingpice;

    private String chexingfdjname;

    @Override
	public String toString() {
		return "Chexing [chexingid=" + chexingid + ", clppid=" + clppid + ", fdjpp=" + fdjpp + ", khclpp=" + khclpp
				+ ", chexingname=" + chexingname + ", chexingpice=" + chexingpice + ", chexingfdjname=" + chexingfdjname
				+ ", bz1=" + bz1 + ", bz2=" + bz2 + ", bz3=" + bz3 + "]";
	}

	private Integer bz1;

    private Integer bz2;

    private Integer bz3;

    public Integer getChexingid() {
        return chexingid;
    }

    public void setChexingid(Integer chexingid) {
        this.chexingid = chexingid;
    }

    public Integer getClppid() {
        return clppid;
    }

    public void setClppid(Integer clppid) {
        this.clppid = clppid;
    }

    public String getFdjpp() {
        return fdjpp;
    }

    public void setFdjpp(String fdjpp) {
        this.fdjpp = fdjpp == null ? null : fdjpp.trim();
    }

    public String getKhclpp() {
        return khclpp;
    }

    public void setKhclpp(String khclpp) {
        this.khclpp = khclpp == null ? null : khclpp.trim();
    }

    public String getChexingname() {
        return chexingname;
    }

    public void setChexingname(String chexingname) {
        this.chexingname = chexingname == null ? null : chexingname.trim();
    }

    public Long getChexingpice() {
        return chexingpice;
    }

    public void setChexingpice(Long chexingpice) {
        this.chexingpice = chexingpice;
    }

    public String getChexingfdjname() {
        return chexingfdjname;
    }

    public void setChexingfdjname(String chexingfdjname) {
        this.chexingfdjname = chexingfdjname == null ? null : chexingfdjname.trim();
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