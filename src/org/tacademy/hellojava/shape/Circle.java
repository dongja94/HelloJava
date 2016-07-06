package org.tacademy.hellojava.shape;

import java.util.Random;

public class Circle extends Shape {
	
	Point center;
	int radius;
	
	public Circle() {
		Random r = new Random();
		int x = 20 + r.nextInt(30);
		int y = 20 + r.nextInt(30);
		center = new Point(x,y);
		int min = Math.min(x, y);
		radius = 19 + r.nextInt(min - 19);
	}

	@Override
	public void setBounds() {
		int left = center.getX() - radius;
		int right = center.getX() + radius;
		int top = center.getY() - radius;
		int bottom = center.getY() + radius;
		setBounds(left, top, right, bottom);
	}

	@Override
	public int caculateArea() {
		return (int)(radius * radius * Math.PI);
	}
	
	@Override
	public String toString() {
		return "circle : c - (" + center + "), r - " + radius;
	}

}
