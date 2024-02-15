package com.kh_practice9_1.point.controller;

import com.kh_practice9_1.point.model.vo.Circle;

public class CircleController {
	
	private Circle c = new Circle();
	final double PI = 3.14;
	
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return c.getX() + " " + c.getY() + " " + c.getRadius() + " 면적 :" +  PI*c.getRadius()*c.getRadius();
		
	}

	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return c.getX() + " " + c.getY() + " " + c.getRadius() + " 둘레 : " + PI*c.getRadius()*2;
		
	}
}
