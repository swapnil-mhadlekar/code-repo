package com.techlabs.lsp.solution1;

public class Square extends Recatngle {

	@Override
	public void setHeight(int height) {

		this.height = height;
		this.width = height;

	}

	@Override
	public void setWidth(int width) {
		this.height = width;
		this.width = width;
	}

}
