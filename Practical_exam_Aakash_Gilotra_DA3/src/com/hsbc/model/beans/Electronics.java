package com.hsbc.model.beans;

public class Electronics extends Items {
	private int warrranty;

	public Electronics(int itemCode, String itemName, double unitPrice, int quantity, int warrranty) {
		super(itemCode, itemName, unitPrice, quantity);
		this.warrranty = warrranty;
	}

	public int getWarrranty() {
		return warrranty;
	}

	public void setWarrranty(int warrranty) {
		this.warrranty = warrranty;
	}
	
}
