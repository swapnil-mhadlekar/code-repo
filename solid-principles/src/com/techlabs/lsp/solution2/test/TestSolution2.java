package com.techlabs.lsp.solution2.test;

import com.techlabs.lsp.solution2.IPolygon;
import com.techlabs.lsp.solution2.Rectangle2;
import com.techlabs.lsp.solution2.Square2;

public class TestSolution2 {

	public static void main(String[] args) {
		
		IPolygon polygon=getPolygonFromFactory();
		System.out.println("Area is: "+polygon.CalculateArea());
		
	}
	
		
	public static IPolygon getPolygonFromFactory() {
		
//		return new Rectangle2(100, 50);
		return new Square2(100);
		
	}

}
