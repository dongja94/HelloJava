package org.tacademy.hellojava.shape;

import java.util.Random;

import org.tacademy.hellojava.drawable.Drawable;
import org.tacademy.hellojava.drawable.OnDrawableChangeListener;
import org.tacademy.hellojava.drawable.Rect;

public abstract class Shape implements Drawable {
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
		setBottom(bottom);
	}

	OnDrawableChangeListener mListener;
	public void setOnDrawableChangeListener(OnDrawableChangeListener listener) {
		mListener = listener;
	}
	
	protected int x, y;
	@Override
	public void setPosition(int x, int y) {
		if (this.x != x || this.y != y) {
			this.x = x;
			this.y = y;
			if (mListener != null) {
				mListener.onPositionChanged(this);
			}
		}
	}
	
	abstract protected void onPositionChanged();

	@Override
	public Rect getBounds() {
		return new Rect(getLeft(), getTop(), getRight(), getBottom());
	}

	@Override
	public Point getPosition() {
		return new Point(x,y);
	}
	Random r = new Random();
	
	@Override
	public void movePosition() {
		
		int dx = 5 + r.nextInt(5);
		int dy = 5 + r.nextInt(5);
		setPosition(x + dx, y + dy);
	}
}
