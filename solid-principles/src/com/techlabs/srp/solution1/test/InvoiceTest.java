package com.techlabs.srp.solution1.test;

import com.techlabs.srp.solution1.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice=new Invoice(500, 5);
		invoice.printInvoice(invoice);
	}

}
