package com.hsbc.model.dao;

import java.util.ArrayList;

import com.hsbc.model.beans.Apparel;

public class ApparelBackedDao implements ApparelDao {

	ArrayList<Apparel> apparelList = new ArrayList<Apparel>();
	@Override
	//This method is for adding the apparels in the list
	public Apparel store(Apparel apparel) {
		// TODO Auto-generated method stub
		apparelList.add(apparel);
		return apparel;
	}

}
