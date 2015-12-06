package com.techlabs.creational.simplefactory.ex1.test;

import com.techlabs.creational.simplefactory.ex1.IShape;
import com.techlabs.creational.simplefactory.ex1.ShapeFactory;
import com.techlabs.creational.simplefactory.ex1.ShapeType;

public class TestShape {

	public static void main(String[] args) {
		IShape shape=ShapeFactory.getInstance().createShape(ShapeType.CIRCLE);
		shape.draw();
		System.out.println("It is from "+shape.getClass());
		
		IShape squareShape=ShapeFactory.getInstance().createShape(ShapeType.SQUARE);
		squareShape.draw();
		System.out.println("It is from "+squareShape.getClass());
	}

}
