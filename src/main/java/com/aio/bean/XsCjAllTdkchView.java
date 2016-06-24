package com.aio.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "MODIFIED_XS_CJ_ALL_TDKCH_VIEW")
public class XsCjAllTdkchView {

	private XsCjAlltdkchViewPk id;

	private String kcsxdm;

	private String kcsxmc;

	private BigDecimal kccj;

	private Double xf;

	private String kssj;

	private String ywkcm;

	private String ywkcsxmc;

	private String zwksxq;

	private String ywksxq;

	private String cjlrfsdm;

	private BigDecimal djcj;

	private String xsZwcj;

	private String xsYwcj;

	@Id
	public XsCjAlltdkchViewPk getId() {
		return id;
	}

	public void setId(XsCjAlltdkchViewPk id) {
		this.id = id;
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
	public BigDecimal getKccj() {
		return kccj;
	}

	public void setKccj(BigDecimal kccj) {
		this.kccj = kccj;
	}

	@Column(name = "xf")
	public Double getXf() {
		return xf;
	}

	public void setXf(Double xf) {
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

	@Column(name = "cjlrfsdm")
	public String getCjlrfsdm() {
		return cjlrfsdm;
	}

	public void setCjlrfsdm(String cjlrfsdm) {
		this.cjlrfsdm = cjlrfsdm;
	}

	@Column(name = "djcj")
	public BigDecimal getDjcj() {
		return djcj;
	}

	public void setDjcj(BigDecimal djcj) {
		this.djcj = djcj;
	}

	@Transient
	public String getXsZwcj() {
		return xsZwcj;
	}

	public void setXsZwcj(String xsZwcj) {
		this.xsZwcj = xsZwcj;
	}

	@Transient
	public String getXsYwcj() {
		return xsYwcj;
	}

	public void setXsYwcj(String xsYwcj) {
		this.xsYwcj = xsYwcj;
	}

}
