package com.FractionalKnapsack;

import java.util.ArrayList;
import java.util.List;

public class FractionalKnapsackMain {
	public static void main(String[] args) {
		//Create Array of Objects
		List<Item>items = new ArrayList<>();
		int [] value = {6,2,1,8,3,5};
		int [] weight = {6,10,3,5,1,3};
		int capacity =10;
		
		//Add the user input data in Knapsack
		for(int i = 0; i<value.length;i++) {
			items.add(new Item(i+1, value[i], weight[i]));
		}
				
		//Send the data for further processing
		FractionalKnapsack.knapSack(items, capacity);
	}

}
