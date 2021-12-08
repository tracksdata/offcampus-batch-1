package com.xoriannt.product.entity;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "user")
public class User {

	private String userName;

	@EmbeddedId
	private CompositPkDemo pk;

	public CompositPkDemo getPk() {
		return pk;
	}

	public void setPk(CompositPkDemo pk) {
		this.pk = pk;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
