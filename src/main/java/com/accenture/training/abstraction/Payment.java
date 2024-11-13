package com.accenture.training.abstraction;

public abstract class Payment{
	 static final String PIN = "1234"; 
	
	abstract void makeCreditCardPayment(String pin, double amount);
	abstract void makePayPalPayment(String upi, double amount); 
}
