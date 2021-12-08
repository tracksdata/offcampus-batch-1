package com.xoriannt.product.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CompositPkDemo  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int transactionId;
	private int userId;

	public CompositPkDemo() {
		// TODO Auto-generated constructor stub
	}

	public CompositPkDemo(int transactionId, int userId) {
		super();
		this.transactionId = transactionId;
		this.userId = userId;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
