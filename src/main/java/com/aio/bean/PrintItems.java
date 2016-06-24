package com.aio.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "print_items")
public class PrintItems {

	private String item;

	private String describe;

	private String freetimes;

	private String onoff;

	@Id
	@Column(name = "item")
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Column(name = "describe")
	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	@Column(name = "freetimes")
	public String getFreetimes() {
		return freetimes;
	}

	public void setFreetimes(String freetimes) {
		this.freetimes = freetimes;
	}

	@Column(name = "on_off")
	public String getOnoff() {
		return onoff;
	}

	public void setOnoff(String onoff) {
		this.onoff = onoff;
	}

}
