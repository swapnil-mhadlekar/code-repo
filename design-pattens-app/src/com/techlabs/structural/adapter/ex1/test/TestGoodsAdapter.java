package com.techlabs.structural.adapter.ex1.test;

import com.techlabs.structural.adapter.ex1.DiscountPrinter;
import com.techlabs.structural.adapter.ex1.Invoice;

public class TestGoodsAdapter {

	public static void main(String[] args) {
		DiscountPrinter printer=new DiscountPrinter();
		printer.printAsPDF(new GoodsAdapter("Mobile", 2, 7000));
		printer.printAsPDF(new Invoice("book invoice", 10000));
	}

}
