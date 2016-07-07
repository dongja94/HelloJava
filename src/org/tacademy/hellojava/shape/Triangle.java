package org.tacademy.hellojava.shape;

import java.io.PrintStream;
import java.util.Random;

import org.tacademy.hellojava.annotation.Friend;
import org.tacademy.hellojava.drawable.Rect;
import org.tacademy.hellojava.exception.BadPointException;

@Friend
public class Triangle extends Shape {
	Point[] points = new Point[3];
	
	public Triangle() throws BadPointException {
		Random r = new Random();
		int x1 = r.nextInt(30);
		int y1 = r.nextInt(30);
		int x2 = x1 + 1 + r.nextInt(30);
		int y2 = y1 + 1 + r.nextInt(30);
		int x3 = x1;
		int y3 = y2;
		points[0] = new Point(x1, y1);
		points[1] = new Point(x2, y2);
		points[2] = new Point(x3, y3);
		setBounds();
		x = getLeft();
		y = getRight();
	}

	@Override
	public void setBounds() {
		int left = points[0].getX();
		int top = points[0].getY();
		int right = points[1].getX();
		int bottom = points[1].getY();
		setBounds(left, top, right, bottom);
	}

	@Override
	public int caculateArea() {
		int height = points[1].getY() - points[0].getY();
		int width = points[1].getX() - points[0].getX();
		return height * width / 2;
	}
	
	@Override
	public String toString() {
		return "triangle : " + points.toString();
	}

	@Override
	public void draw(PrintStream canvas) {
		canvas.println(toString());
	}

	@Override
	protected void onPositionChanged() throws BadPointException {
		int x1 = x;
		int y1 = y;
		int x2 = x + points[1].getX() - points[0].getX();
		int y2 = y + points[1].getY() - points[0].getY();
		int x3 = x1;
		int y3 = y2;
		points[0].setX(x1);
		points[0].setY(y1);
		points[1].setX(x2);
		points[1].setY(y2);
		points[2].setX(x3);
		points[2].setY(y3);
		setBounds();
	}
	
}
