package com.techlabs.srp.solution2;


public class InvoicePrinter {
	
public void printInvoice(Invoice2 invoice) {
	System.out.println("Bill Amount is: " + invoice.getBillAmount()
			+ ",\nTax Rate is: " + invoice.getTaxRate()
			+ ",\nTotal Amount Payable is: " + invoice.calculateBillAmount());

}
}