package com.xoriannt.product.entity;

import java.time.LocalDateTime;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	
	private LocalDateTime date;

	@EmbeddedId
	private CompositPkDemo pkDemo;

	public CompositPkDemo getPkDemo() {
		return pkDemo;
	}

	public void setPkDemo(CompositPkDemo pkDemo) {
		this.pkDemo = pkDemo;
	}

	
	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

}
