package com.hsbc.model.dao;

import java.util.ArrayList;

import com.hsbc.model.beans.Electronics;

public class ElectronicsBackedDao implements ElectronicsDao {

	ArrayList<Electronics> electronicsList = new ArrayList<Electronics>();
	@Override
	public Electronics store(Electronics electronics) {
		// TODO Auto-generated method stub
		electronicsList.add(electronics);
		return electronics;
	}

}
