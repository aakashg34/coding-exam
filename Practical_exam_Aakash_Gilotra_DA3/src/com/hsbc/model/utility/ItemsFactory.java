package com.hsbc.model.utility;

import com.hsbc.model.dao.FoodItemBackedDao;
import com.hsbc.mode.business.*;
public class ItemsFactory {
	public static Object getInstance(Type type) {
		Object obj = null;
		switch(type) {
		case DAOFOOD : 
			obj = new FoodItemBackedDao();
				break;
		case DAOAPPAREL : 
			obj = new FoodItemBackedDao();
				break;
		case DAOELECTRONICS : 
			obj = new FoodItemBackedDao();
				break;
		case SERVICEITEM :
			obj = new FoodItemImpl();
			break;
		case SERVICEELECTRONIC :
			obj = new ElectronicItemImpl();
			break;
		case SERVICEAPPAREL :
			obj = new ApparelItemImpl();
			break;
		}
		return obj;
	}

}
