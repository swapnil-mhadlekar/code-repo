package com.techlabs.creational.simplefactory.ex1;

public class ShapeFactory {
	private static ShapeFactory shape;

	private ShapeFactory() {

	}

	public static ShapeFactory getInstance() {
		if (shape == null) {
			shape = new ShapeFactory();

		}
		return shape;

	}

	public IShape createShape(ShapeType shapeToBeCreated) {

		switch (shapeToBeCreated) {
		case CIRCLE:

			return new Circle();
		case SQUARE:
			return new Square();
		case TRIANGLE:
			return new Triangle();
		case RECTANGLE:
			return new Rectangle();

		default:
			return null;
		}

	}

}
