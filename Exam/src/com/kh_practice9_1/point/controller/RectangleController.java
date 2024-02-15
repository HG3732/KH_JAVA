package com.kh_practice9_1.point.controller;

import com.kh_practice9_1.point.model.vo.Rectangle;

public class RectangleController {
	
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		return r.getX() + " " + r.getY() + " " + r.getHeight() + " " + r.getWidth() + " 면적 : " + r.getHeight()*r.getWidth();
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		return r.getX() + " " + r.getY() + " " + r.getHeight() + " " + r.getWidth() + "둘레 : " + 2*(r.getHeight() + r.getWidth());
	}

}
