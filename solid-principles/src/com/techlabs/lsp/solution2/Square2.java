package com.techlabs.lsp.solution2;

public class Square2 implements IPolygon {
	private int side;
	

	public Square2(int side) {
		this.side = side;
	}


	@Override
	public int CalculateArea() {
		return side * side;
	}

}
