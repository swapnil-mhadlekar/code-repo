package com.techlabs.structural.composite.ex1.test;

import javax.swing.text.StyleContext.SmallAttributeSet;

import com.techlabs.behavioural.observer.ex1.MobileAppScreen;
import com.techlabs.structural.composite.ex1.Invoice;
import com.techlabs.structural.composite.ex1.LineItem;

public class TestInvoice {
	private static Invoice mainInvoice;

	public static void main(String[] args) {

		createInvoices();
		mainInvoice.displayOrderInfo();

	}

	private static void createInvoices() {
		mainInvoice = new Invoice("Main Invoice");

		Invoice bookInvoice = new Invoice("Book Invoice");
		bookInvoice.add(new LineItem(101, "JAVA", 2, 700));
		bookInvoice.add(new LineItem(102, "C++", 1, 500));
		bookInvoice.add(new LineItem(103, "HTML", 5, 600));
		mainInvoice.add(bookInvoice);

		Invoice mobileInvoice = new Invoice("Mobile Invoice");

		mobileInvoice.add(new LineItem(11, "NOKIA 100", 1, 1500));
		mobileInvoice.add(new LineItem(12, "NOKIA 300", 2, 2000));
		mobileInvoice.add(new LineItem(13, "NOKIA ASHA 200", 3, 2500));
		mainInvoice.add(mobileInvoice);

		Invoice smartPhoneInvoice = new Invoice("Smart Phone");

		smartPhoneInvoice.add(new LineItem(501, "I phone 4", 2, 30000));
		smartPhoneInvoice.add(new LineItem(502, "I phone 5", 1, 50000));
		smartPhoneInvoice.add(new LineItem(503, "I phone 6", 3, 60000));
		mobileInvoice.add(smartPhoneInvoice);
	}

}
