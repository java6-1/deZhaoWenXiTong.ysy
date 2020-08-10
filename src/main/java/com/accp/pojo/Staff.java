package com.accp.pojo;

import java.util.Date;

public class Staff {
	private JiaoSe jiaose;
    public JiaoSe getJiaose() {
		return jiaose;
	}

	public void setJiaose(JiaoSe jiaose) {
		this.jiaose = jiaose;
	}

	private Integer staffid;

    private Integer postid;

    private Integer bzid;

    private Integer xjid;

    private Integer qxid;

    private String staffname;

    private Integer staffsex;

    private String staffaccount;

    private String staffpawss;

    private String tstore;

    private Integer sectionid;

    private String position;

    private String education;

    private String edtype;

    private String school;

    private String specialty;

    private String sfid;

    private String yhdz;

    private String xjdz;

    private String staff;

    private Date entrytime;

    private String dimissiontime;

    private String cause;

    private Integer state;

    private Integer bz1;

    private Integer bz2;

    private Integer bz3;
    
    private String sectionname;
    
    private String sectionbh;
    
    private double xjfei;
    
    
    
    public double getXjfei() {
		return xjfei;
	}

	public void setXjfei(double xjfei) {
		this.xjfei = xjfei;
	}

	private Xj xj;
    
    
    public Xj getXj() {
		return xj;
	}

	public void setXj(Xj xj) {
		this.xj = xj;
	}
    public String getSectionbh() {
		return sectionbh;
	}

	public void setSectionbh(String sectionbh) {
		this.sectionbh = sectionbh;
	}

	public String getSectionname() {
		return sectionname;
	}

	public void setSectionname(String sectionname) {
		this.sectionname = sectionname;
	}

	public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public Integer getBzid() {
        return bzid;
    }

    public void setBzid(Integer bzid) {
        this.bzid = bzid;
    }

    public Integer getXjid() {
        return xjid;
    }

    public void setXjid(Integer xjid) {
        this.xjid = xjid;
    }

    public Integer getQxid() {
        return qxid;
    }

    public void setQxid(Integer qxid) {
        this.qxid = qxid;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }

    public Integer getStaffsex() {
        return staffsex;
    }

    public void setStaffsex(Integer staffsex) {
        this.staffsex = staffsex;
    }

    public String getStaffaccount() {
        return staffaccount;
    }

    public void setStaffaccount(String staffaccount) {
        this.staffaccount = staffaccount == null ? null : staffaccount.trim();
    }

    public String getStaffpawss() {
        return staffpawss;
    }

    public void setStaffpawss(String staffpawss) {
        this.staffpawss = staffpawss == null ? null : staffpawss.trim();
    }

    public String getTstore() {
        return tstore;
    }

    public void setTstore(String tstore) {
        this.tstore = tstore == null ? null : tstore.trim();
    }

    public Integer getSectionid() {
        return sectionid;
    }

    public void setSectionid(Integer sectionid) {
        this.sectionid = sectionid;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getEdtype() {
        return edtype;
    }

    public void setEdtype(String edtype) {
        this.edtype = edtype == null ? null : edtype.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty == null ? null : specialty.trim();
    }

    public String getSfid() {
        return sfid;
    }

    public void setSfid(String sfid) {
        this.sfid = sfid == null ? null : sfid.trim();
    }

    public String getYhdz() {
        return yhdz;
    }

    public void setYhdz(String yhdz) {
        this.yhdz = yhdz == null ? null : yhdz.trim();
    }

    public String getXjdz() {
        return xjdz;
    }

    public void setXjdz(String xjdz) {
        this.xjdz = xjdz == null ? null : xjdz.trim();
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff == null ? null : staff.trim();
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public String getDimissiontime() {
        return dimissiontime;
    }

    public void setDimissiontime(String dimissiontime) {
        this.dimissiontime = dimissiontime == null ? null : dimissiontime.trim();
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

	@Override
	public String toString() {
		return "Staff [staffid=" + staffid + ", postid=" + postid + ", bzid=" + bzid + ", xjid=" + xjid + ", qxid="
				+ qxid + ", staffname=" + staffname + ", staffsex=" + staffsex + ", staffaccount=" + staffaccount
				+ ", staffpawss=" + staffpawss + ", tstore=" + tstore + ", sectionid=" + sectionid + ", position="
				+ position + ", education=" + education + ", edtype=" + edtype + ", school=" + school + ", specialty="
				+ specialty + ", sfid=" + sfid + ", yhdz=" + yhdz + ", xjdz=" + xjdz + ", staff=" + staff
				+ ", entrytime=" + entrytime + ", dimissiontime=" + dimissiontime + ", cause=" + cause + ", state="
				+ state + ", bz1=" + bz1 + ", bz2=" + bz2 + ", bz3=" + bz3 + ", sectionname=" + sectionname
				+ ", sectionbh=" + sectionbh + ", xjfei=" + xjfei + ", xj=" + xj + "]";
	}

	
    
    
}