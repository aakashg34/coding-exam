package com.hsbc.model.dao;

import java.util.ArrayList;

import com.hsbc.model.beans.FoodItems;


public class FoodItemBackedDao implements FoodItemDao {

	ArrayList<FoodItems> itemList = new ArrayList<FoodItems>();
	@Override
	public FoodItems store(FoodItems item) {
		// TODO Auto-generated method stub
		itemList.add(item);
		return item;
	}

}
