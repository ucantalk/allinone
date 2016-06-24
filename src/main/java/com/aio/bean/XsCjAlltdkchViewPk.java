package com.aio.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class XsCjAlltdkchViewPk implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3774390200672033339L;

	private String xh;

	private String zxjxjhh;

	private String kch;

	private String kcm;

	public XsCjAlltdkchViewPk() {
	}

	public XsCjAlltdkchViewPk(String xh, String zxjxjhh, String kch, String kcm, String kcsxdm, String kcsxmc,
			BigDecimal kccj, Double xf, String ywkcm, String ywkcsxmc, String zwksxq, String ywksxq) {
		this.xh = xh;
		this.zxjxjhh = zxjxjhh;
		this.kch = kch;
		this.kcm = kcm;
	}

	@Column(name = "xh")
	public String getXh() {
		return this.xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	@Column(name = "zxjxjhh")
	public String getZxjxjhh() {
		return zxjxjhh;
	}

	public void setZxjxjhh(String zxjxjhh) {
		this.zxjxjhh = zxjxjhh;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof XsCjAlltdkchViewPk))
			return false;
		XsCjAlltdkchViewPk castOther = (XsCjAlltdkchViewPk) other;

		return ((this.getXh() == castOther.getXh())
				|| (this.getXh() != null && castOther.getXh() != null && this.getXh().equals(castOther.getXh())))
				&& ((this.getZxjxjhh() == castOther.getZxjxjhh()) || (this.getZxjxjhh() != null
						&& castOther.getZxjxjhh() != null && this.getZxjxjhh().equals(castOther.getZxjxjhh())))
				&& ((this.getKch() == castOther.getKch()) || (this.getKch() != null && castOther.getKch() != null
						&& this.getKch().equals(castOther.getKch())))
				&& ((this.getKcm() == castOther.getKcm()) || (this.getKcm() != null && castOther.getKcm() != null
						&& this.getKcm().equals(castOther.getKcm())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getXh() == null ? 0 : this.getXh().hashCode());
		result = 37 * result + (getZxjxjhh() == null ? 0 : this.getZxjxjhh().hashCode());
		result = 37 * result + (getKch() == null ? 0 : this.getKch().hashCode());
		result = 37 * result + (getKcm() == null ? 0 : this.getKcm().hashCode());
		return result;
	}

}