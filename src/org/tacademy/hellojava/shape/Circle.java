package org.tacademy.hellojava.shape;

import java.io.PrintStream;
import java.util.Random;

import org.tacademy.hellojava.drawable.Rect;
import org.tacademy.hellojava.exception.BadPointException;

public class Circle extends Shape {
	
	Point center;
	int radius;
	
	public Circle() throws BadPointException {
		Random r = new Random();
		int x = 20 + r.nextInt(30);
		int y = 20 + r.nextInt(30);
		center = new Point(x,y);
		int min = Math.min(x, y);
		radius = 19 + r.nextInt(min - 19);
		setBounds();
		x = getLeft();
		y = getTop();
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

	@Override
	public void draw(PrintStream canvas) {
		canvas.println(toString());
	}


	@Override
	protected void onPositionChanged() throws BadPointException {
		int centerX = x + radius;
		int centerY = y + radius;
		center.setX(centerX);
		center.setY(centerY);
		setBounds();
	}

}
