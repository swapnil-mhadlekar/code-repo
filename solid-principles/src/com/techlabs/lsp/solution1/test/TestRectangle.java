package com.techlabs.lsp.solution1.test;

import com.techlabs.lsp.solution1.Recatngle;
import com.techlabs.lsp.solution1.Square;

public class TestRectangle {

	public static void main(String[] args) {
		
		Recatngle rectObj=getRectangleFromFactory();
		rectObj.setHeight(100);
		rectObj.setWidth(50);
		System.out.println("Area is: "+rectObj.calculateArea());
		
		
	}
	
	public static Recatngle getRectangleFromFactory() {
		
//		return new Recatngle();
		return new Square();
		
	}

}
