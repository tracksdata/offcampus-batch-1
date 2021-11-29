package com;

public class Item {

	private int itemId;
	private String itemName;
	private double price;
	private boolean isVeg;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int itemId, String itemName, double price, boolean isVeg) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.isVeg = isVeg;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isVeg() {
		return isVeg;
	}

	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}

	@Override
	public String toString() {
		return "Menu [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + ", isVeg=" + isVeg + "]";
	}

}
