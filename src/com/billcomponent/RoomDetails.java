package com.billcomponent;

public class RoomDetails implements RoomBillComponent {
	int billId;
	String customerName;
	String typeOfRoom;
	int noOfExtraPersons;
	int noOfDayOfStay;
	static int couter=101;
	
	
	
	public RoomDetails(String customerName, String typeOfRoom, int noOfExtraPersons, int noOfDayOfStay) {
		this.customerName = customerName;
		this.typeOfRoom = typeOfRoom;
		this.noOfExtraPersons = noOfExtraPersons;
		this.noOfDayOfStay = noOfDayOfStay;
		
	}
	
	private boolean validateNoOfDaysOfStay() {
		if(noOfDayOfStay>15 || noOfDayOfStay<1) {
			return false;
		}
		return true;
	}
	private boolean validateNoOfExtraPersons() {
		if(noOfExtraPersons<0 || noOfExtraPersons>2) {
			System.out.println("The max no of extra people is 2.");
			return false;
		}
		return true;
	}
	
	private boolean validateTypeOfRoom() {
		if(typeOfRoom == "Standard" || typeOfRoom == "Deluxe" || typeOfRoom == "Cottage") {
			return true;
		}
		System.out.println("Wrong choice is selected.");
		return false;
	}

	public int getBillId() {
		return billId;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public String getTypeOfRoom() {
		return typeOfRoom;
	}
	
	public int getNoOfExtraPersons() {
		return noOfExtraPersons;
	}
	
	public int getnoOfDayOfStay() {
		return noOfDayOfStay;
	}

	public static int getCouter() {
		return couter;
	}

	
	@Override
	public float calculateBill() {
		int baseRoomFare=0;
		
		if(validateNoOfDaysOfStay() && validateNoOfExtraPersons() && validateTypeOfRoom()) {
			switch(typeOfRoom) {
			case "Standard" :
				baseRoomFare=2500;
				break;
			case "Deluxe" :
				baseRoomFare=3500;
				break;
			case "Cottage" :
				baseRoomFare=5500;
			}
		}else {
			System.out.println("You can't get booking. You exceeded extra person limit or Invalid in some input.");
			return 0;
		}
		float totalBill = (noOfDayOfStay * baseRoomFare) + (float)(noOfDayOfStay * foodCharge) + (float)(extraPersonCharge * noOfExtraPersons);
		totalBill = totalBill + (float)(tax * totalBill);
		
		return totalBill;
	}
}
	
