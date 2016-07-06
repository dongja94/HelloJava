package org.tacademy.hellojava.shape;

public abstract class Shape {
	int left, right, top, bottom;
	
	public abstract void setBounds();
	public abstract int caculateArea();
	
	protected final void setLeft(int left) {
		if (left < 0) {
			left = 0;
		}
		this.left = left;
	}
	
	protected final int getLeft() {
		return left;
	}
	
	protected final void setRight(int right) {
		if (right < left) {
			right = left;
		}
		this.right = right;
	}
	
	protected final int getRight() {
		return right;
	}
	
	protected final void setTop(int top) {
		if (top < 0) {
			top = 0;
		}
		this.top = top;
	}
	
	protected final int getTop() {
		return top;
	}
	
	protected final void setBottom(int bottom) {
		if (bottom < top) {
			bottom = top;
		}
		this.bottom = bottom;
	}
	
	protected final int getBottom() {
		return bottom;
	}
	
	protected final void setBounds(int left, int top, int right, int bottom){
		setLeft(left);
		setTop(top);
		setRight(right);
		setBottom(bottm);
	}
	
	
}
