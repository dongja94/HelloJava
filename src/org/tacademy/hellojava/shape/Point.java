package org.tacademy.hellojava.shape;

public class Point {
	private int x;
	private int y;

	public Point() {
	}
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public void setX(int x) {
		if (x < 0) {
			x = 0;
		}
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		if (y < 0) {
			y = 0;
		}
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	@Override
	public String toString() {
		return "" + x + "," + y;
	}
}
