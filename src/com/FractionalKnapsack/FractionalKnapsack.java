package com.FractionalKnapsack;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FractionalKnapsack {
	
	static void knapSack(List<Item> items ,int capacity) {
		
		Comparator<Item> ratioComparator = new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				if(o1.getRatio() > o2.getRatio()) return 1;
				return -1;
			}
		};
		
		Collections.sort(items,ratioComparator);
		
		int usedCapacity = 0;
		double totalValue = 0;
		for(Item item:items) {
			if(usedCapacity+item.getWeight() <= capacity) {
				usedCapacity += item.getWeight();
				System.out.println("Taken :"+item);
				totalValue += item.getValue(); 
			}else {
				int usedWeight = capacity - usedCapacity;
				double value = item.getRatio() * usedWeight;
				System.out.println("Taken: "+"item index = " + item.getIndex() + ",obtained value = " + value + ",used weight = " + usedWeight + ", ratio = " + item.getRatio()
				+ "]");
				usedCapacity += usedWeight;
				totalValue += value;
			}
			if(usedCapacity == capacity) break;
		}
		
		System.out.println("\nTotal value obtained: "+ totalValue);
	}

}
