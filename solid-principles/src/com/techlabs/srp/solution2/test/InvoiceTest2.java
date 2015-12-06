package com.techlabs.srp.solution2.test;

import com.techlabs.srp.solution2.Invoice2;
import com.techlabs.srp.solution2.InvoicePrinter;

public class InvoiceTest2 {

	public static void main(String[] args) {
		Invoice2 invoice=new Invoice2(600, 4);
		InvoicePrinter print=new InvoicePrinter();
		print.printInvoice(invoice);
	}

}
