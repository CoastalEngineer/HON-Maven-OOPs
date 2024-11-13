package com.accenture.training.abstraction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Tester 
    	MakePayment makePaymentObject = new MakePayment(); 
    	makePaymentObject.makeCreditCardPayment("1234", 25000);
    	makePaymentObject.makePayPalPayment("2345", 1000);
    	makePaymentObject.makePayPalPayment("1234", 10000);
    	
    }
}
