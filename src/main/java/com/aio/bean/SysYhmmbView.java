package com.aio.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MODIFIED_SYS_YHMMB_VIEW")
public class SysYhmmbView {
	/**
	 * 
	 */

	private String id;

	private String mm;

	private String yhlbdm;

	private String yhlbsm;

	@Id
	@Column(name = "zjh")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column
	public String getMm() {
		return mm;
	}

	public void setMm(String mm) {
		this.mm = mm;
	}

	@Column
	public String getYhlbdm() {
		return yhlbdm;
	}

	public void setYhlbdm(String yhlbdm) {
		this.yhlbdm = yhlbdm;
	}

	@Column
	public String getYhlbsm() {
		return yhlbsm;
	}

	public void setYhlbsm(String yhlbsm) {
		this.yhlbsm = yhlbsm;
	}
}
