package com.techlabs.lsp.solution2;

public class Rectangle2 implements IPolygon {

	private int height;
	private int width;

	public Rectangle2(int height, int width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public int CalculateArea() {
		return height * width;
	}

}
