package com.hsbc.model.beans;

import java.time.LocalDate;

public class FoodItems extends Items{

	private LocalDate dateOfManufacture;
	private LocalDate dateOfExpiry;
	private String vegetarian;
	public FoodItems(int itemCode, String itemName, double unitPrice, int quantity, LocalDate dateOfManufacture,
			LocalDate dateOfExpiry, String vegetarian) {
		super(itemCode, itemName, unitPrice, quantity);
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.vegetarian = vegetarian;
	}
	
	public FoodItems(int itemCode, String itemName, double unitPrice, int quantity) {
		super(itemCode, itemName, unitPrice, quantity);
		// TODO Auto-generated constructor stub
	}

	public LocalDate getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(LocalDate dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	public LocalDate getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(LocalDate dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public String getVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(String vegetarian) {
		this.vegetarian = vegetarian;
	}
	
	
	
}
