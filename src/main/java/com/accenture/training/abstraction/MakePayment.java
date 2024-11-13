package com.accenture.training.abstraction;

//Concrete class 
public class MakePayment extends Payment implements MyCard{

	@Override
	void makeCreditCardPayment(String pin, double amount) {
		if(validatePaymentMethod(pin)) {
			System.out.println("Validation Successful!"); 
			System.out.printf("Making a Credit Card Transaction worth Rs. %.2f\n", amount);
		}
		else {
			System.out.println("Incorrect Pin entered, please try again!"); 
		}
	}

	@Override
	void makePayPalPayment(String upi, double amount) {
		if(validatePaymentMethod(upi)) {
			System.out.println("Validation Successful!"); 
			System.out.printf("Making a PayPal Transaction worth Rs. %.2f\n", amount);
		}
		else {
			System.out.println("Incorrect UPI Pin entered, please try again!"); 
		}
	}

	public boolean validatePaymentMethod(String pin) {
		return pin.equals(Payment.PIN); 
	}

}
