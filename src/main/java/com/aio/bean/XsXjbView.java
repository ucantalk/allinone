package com.aio.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "MODIFIED_XS_XJB_VIEW")
public class XsXjbView {

	private String xh;

	private String xb;

	private String xm;

	private String ywxm;

	private String ywxb;

	private String rxrq;

	private String byrq;

	private String xsm;

	private String xsh;

	private String ywxsm;

	private String zym;

	private String ywzym;

	private String bjh;

	private String sfyxj;

	@Id
	@Column(name = "xh")
	public String getXh() {
		return xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	@Column(name = "xb")
	public String getXb() {
		return xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	@Column(name = "xm")
	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	@Column(name = "ywxm")
	public String getYwxm() {
		return ywxm;
	}

	public void setYwxm(String ywxm) {
		this.ywxm = ywxm;
	}

	@Transient
	public String getYwxb() {
		return ywxb;
	}

	public void setYwxb(String ywxb) {
		this.ywxb = ywxb;
	}

	@Column(name = "rxrq")
	public String getRxrq() {
		return rxrq;
	}

	public void setRxrq(String rxrq) {
		this.rxrq = rxrq;
	}

	@Column(name = "byrq")
	public String getByrq() {
		return byrq;
	}

	public void setByrq(String byrq) {
		this.byrq = byrq;
	}

	@Column(name = "xsm")
	public String getXsm() {
		return xsm;
	}

	public void setXsm(String xsm) {
		this.xsm = xsm;
	}

	public String getXsh() {
		return xsh;
	}

	public void setXsh(String xsh) {
		this.xsh = xsh;
	}

	@Column(name = "ywxsm")
	public String getYwxsm() {
		return ywxsm;
	}

	public void setYwxsm(String ywxsm) {
		this.ywxsm = ywxsm;
	}

	@Column(name = "zym")
	public String getZym() {
		return zym;
	}

	public void setZym(String zym) {
		this.zym = zym;
	}

	@Column(name = "ywzym")
	public String getYwzym() {
		return ywzym;
	}

	public void setYwzym(String ywzym) {
		this.ywzym = ywzym;
	}

	@Column(name = "bjh")
	public String getBjh() {
		return bjh;
	}

	public void setBjh(String bjh) {
		this.bjh = bjh;
	}

	@Column(name = "sfyxj")
	public String getSfyxj() {
		return sfyxj;
	}

	public void setSfyxj(String sfyxj) {
		this.sfyxj = sfyxj;
	}

}
