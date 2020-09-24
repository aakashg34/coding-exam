package com.hsbc.controller;
import java.time.LocalDate;
import java.util.*;

import com.hsbc.model.beans.FoodItems;
import com.hsbc.model.beans.Items;

public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		
		//this do-while loop is working untill 7 is pressed
		
		do {
			System.out.println("*****************************************************************************************");
			System.out.println("1: Add Food Items 2: Add Apprel Items  3:Add Electronics Items  4: Display top 3 Food Items 5: Display top 3 Apparel 6:Display top 3 Electronics Items 7:Exit");
			System.out.println("*****************************************************************************************");
			option = scanner.nextInt();
			
			/*
			 * 
			 * 
			 * Person has the option to choose which type of item he needs to add
			 * 
			 * Once the person selects an option the service and DAO layer for that 
			 * option only will get in use
			 * 
			 * 
			 */
			switch(option) {
				case 1:	/*
						*firstly the user has to enter the required details accordiing 
						*the fields
						*/
				
						System.out.println("Enter the Item code");
						int itemCode = scanner.nextInt();
						System.out.println("Enter the Item name");
						String itemName = scanner.next();
						System.out.println("Enter the unit price");
						int unitPrice = scanner.nextInt();
						System.out.println("Enter the quantity");
						int quantity = scanner.nextInt();
						System.out.println("Enter the date of manufacture");
						LocalDate dateOfManufacture = LocalDate.now();
						System.out.println("Enter the date of expiry");
						LocalDate dateOfExpiry = LocalDate.parse(scanner.next());
						System.out.println("Is it vegetarian?");
						String vegetarian = scanner.next();
						Items item = new FoodItems(itemCode, itemName, unitPrice, quantity, dateOfManufacture, dateOfExpiry, vegetarian);
						FoodItem createdItem = service.storeItem();
						//Items item = new FoodItems(itemCode, itemName, unitPrice, quantity);
						
						break;
				case 2: 
						break;
				case 3: 
					break;
				case 4: 
					break;
				case 5: 
					break;
				case 6: 
					break;
				case 7: 
					
					break;
				
			}
		}while()
		
	}

}
