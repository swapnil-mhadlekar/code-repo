package com.techlabs.structural.adapter.ex1.test;

import com.techlabs.structural.adapter.ex1.IDiscountable;
import com.techlabs.structural.adapter.ex1.oldvendor.Goods;

public class GoodsAdapter implements IDiscountable {
	Goods goods;

	public GoodsAdapter(String name, int quantity, double price) {
		goods = new Goods(name, quantity, price);
	}

	@Override
	public String getDescription() {
		return String.format("Name is %s, quantity is %d, price is %s",
				goods.getName(), goods.getQuantity(), goods.getPrice());
	}

	@Override
	public double calaculateDiscount() {
		System.out.print("Discount is:");
		return goods.getDiscount();
	}
}
