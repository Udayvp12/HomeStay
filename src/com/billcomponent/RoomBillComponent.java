package com.billcomponent;

public interface RoomBillComponent {
	double tax = 1.2;
	double extraPersonCharge=500;
	double foodCharge=800;
	
	float calculateBill();
}
