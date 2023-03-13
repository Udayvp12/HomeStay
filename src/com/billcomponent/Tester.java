package com.billcomponent;

public class Tester {

	public static void main(String[] args) {
		RoomDetails customer1 = new RoomDetails("Uday", "Cottage", 2, 10);
		System.out.println("Bill ID : " + customer1.getBillId());
		System.out.println("Customer Name : " + customer1.getCustomerName());
		System.out.println("No of days of Stay : " + customer1.getnoOfDayOfStay());
		System.out.println("Total Bill : " + customer1.calculateBill());
		
		RoomDetails customer2 = new RoomDetails("Mahesh", "Deluxe", 0, 3);
		System.out.println("Bill ID : " + customer2.getBillId());
		System.out.println("Customer Name : " + customer2.getCustomerName());
		System.out.println("No of Days of Stay : " + customer2.getnoOfDayOfStay());
		System.out.println("Total Bill : " + customer2.calculateBill());
		
		RoomDetails customer3 = new RoomDetails("Krishna_Kumar", "Premium", 3, 3);
		System.out.println("Bill ID : " + customer3.getBillId());
		System.out.println("Customer Name : " + customer3.getCustomerName());
		System.out.println("No of Days of Stay : " + customer3.getnoOfDayOfStay());
		System.out.println("Total Bill : " + customer3.calculateBill());
		
		RoomDetails customer4 = new RoomDetails("Aman", "Cottage", 2, 14);
		System.out.println("Bill ID : " + customer4.getBillId());
		System.out.println("Customer Name : " + customer4.getCustomerName());
		System.out.println("No of Days of Stay : " + customer4.getnoOfDayOfStay());
		System.out.println("Total Bill : " + customer4.calculateBill());
	}

}
