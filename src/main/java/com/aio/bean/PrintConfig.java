package com.aio.bean;

import javax.persistence.Column;
import javax.persistence.Id;

public class PrintConfig {

	private String id;

	private String tray1totle;

	private String tray1remain;

	private String tray2totle;

	private String tray2remain;

	@Id
	@Column(name = "id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "tray1_totle")
	public String getTray1totle() {
		return tray1totle;
	}

	public void setTray1totle(String tray1totle) {
		this.tray1totle = tray1totle;
	}

	@Column(name = "tray1_remain")
	public String getTray1remain() {
		return tray1remain;
	}

	public void setTray1remain(String tray1remain) {
		this.tray1remain = tray1remain;
	}

	@Column(name = "tray2_totle")
	public String getTray2totle() {
		return tray2totle;
	}

	public void setTray2totle(String tray2totle) {
		this.tray2totle = tray2totle;
	}

	@Column(name = "tray2_remain")
	public String getTray2remain() {
		return tray2remain;
	}

	public void setTray2remain(String tray2remain) {
		this.tray2remain = tray2remain;
	}

}
