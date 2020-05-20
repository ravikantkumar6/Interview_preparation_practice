package com.memory3;

public class Main {
	
	public static void main(String...s) {
		CustomerRecords records = new CustomerRecords();
		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));
		
		records.getCustomers().clear();
		for(Customer next:records.getCustomers().values()) {
			System.out.println(next);
			}
	}

}
