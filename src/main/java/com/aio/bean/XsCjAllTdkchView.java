package com.aio.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "MODIFIED_XS_CJ_ALL_TDKCH_VIEW")
public class XsCjAllTdkchView {

	// private XsCjAlltdkchViewPk id;
	private String xh;

	private String kch;

	private String kcm;
	
	private String zxjxjhh;

	private String kcsxdm;

	private String kcsxmc;

	private String kccj;

	private String xf;

	private String kssj;

	private String ywkcm;

	private String ywkcsxmc;

	private String zwksxq;

	private String ywksxq;

	private String cjlrfsdm;

	private String djm;

	private String ywdjm;

	@Id
	public String getXh() {
		return xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	@Column(name = "kch")
	public String getKch() {
		return kch;
	}

	public void setKch(String kch) {
		this.kch = kch;
	}

	@Column(name = "kcm")
	public String getKcm() {
		return kcm;
	}
    
	public void setKcm(String kcm) {
		this.kcm = kcm;
	}
   
	@Column(name = "zxjxjhh")
	public String getZxjxjhh() {
		return zxjxjhh;
	}

	public void setZxjxjhh(String zxjxjhh) {
		this.zxjxjhh = zxjxjhh;
	}

	@Column(name = "kcsxdm")
	public String getKcsxdm() {
		return kcsxdm;
	}

	public void setKcsxdm(String kcsxdm) {
		this.kcsxdm = kcsxdm;
	}

	@Column(name = "kcsxmc")
	public String getKcsxmc() {
		return kcsxmc;
	}

	public void setKcsxmc(String kcsxmc) {
		this.kcsxmc = kcsxmc;
	}

	@Column(name = "kccj")
	public String getKccj() {
		return kccj;
	}

	public void setKccj(String kccj) {
		this.kccj = kccj;
	}

	@Column(name = "xf")
	public String getXf() {
		return xf;
	}

	public void setXf(String xf) {
		this.xf = xf;
	}

	@Column(name = "kssj")
	public String getKssj() {
		return kssj;
	}

	public void setKssj(String kssj) {
		this.kssj = kssj;
	}

	@Column(name = "ywkcm")
	public String getYwkcm() {
		return ywkcm;
	}

	public void setYwkcm(String ywkcm) {
		this.ywkcm = ywkcm;
	}

	@Column(name = "ywkcsxmc")
	public String getYwkcsxmc() {
		return ywkcsxmc;
	}

	public void setYwkcsxmc(String ywkcsxmc) {
		this.ywkcsxmc = ywkcsxmc;
	}

	@Column(name = "cjlrfsdm")
	public String getCjlrfsdm() {
		return cjlrfsdm;
	}

	public void setCjlrfsdm(String cjlrfsdm) {
		this.cjlrfsdm = cjlrfsdm;
	}

	@Column(name = "djm")
	public String getDjm() {
		return djm;
	}

	public void setDjm(String djm) {
		this.djm = djm;
	}

	@Column(name = "ywdjm")
	public String getYwdjm() {
		return ywdjm;
	}

	public void setYwdjm(String ywdjm) {
		this.ywdjm = ywdjm;
	}

	@Transient
	public String getZwksxq() {
		return zwksxq;
	}

	public void setZwksxq(String zwksxq) {
		this.zwksxq = zwksxq;
	}

	@Transient
	public String getYwksxq() {
		return ywksxq;
	}

	public void setYwksxq(String ywksxq) {
		this.ywksxq = ywksxq;
	}

}
