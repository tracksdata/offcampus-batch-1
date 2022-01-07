package com.xoriant.ecart.model;

public class Product {

	private int productId;
	private String productTitle;
	private double productPrice;
	private int productQty;
	private String productImage;
	private String productDesc;
	private String productKeywords;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductKeywords() {
		return productKeywords;
	}

	public void setProductKeywords(String productKeywords) {
		this.productKeywords = productKeywords;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productTitle=" + productTitle + ", productPrice=" + productPrice
				+ ", productQty=" + productQty + ", productImage=" + productImage + ", productDesc=" + productDesc
				+ ", productKeywords=" + productKeywords + "]";
	}

}
