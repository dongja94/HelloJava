package org.tacademy.hellojava.shape;

import org.tacademy.hellojava.exception.BadPointException;

public class Point {
	private int x;
	private int y;

	public Point() {
	}
	
	public Point(int x, int y) throws BadPointException {
		setX(x);
		setY(y);
	}
	
	public void setX(int x) throws BadPointException {
		if (x < 0) {
			throw new BadPointException();
		}
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) throws BadPointException {
		if (y < 0) {
			throw new BadPointException();
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
