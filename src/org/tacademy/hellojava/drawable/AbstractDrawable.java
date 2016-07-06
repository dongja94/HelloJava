package org.tacademy.hellojava.drawable;

import java.io.PrintStream;
import java.util.Random;

import org.tacademy.hellojava.shape.Point;

public abstract class AbstractDrawable implements Drawable {

	protected int x, y;
	Random r = new Random();
	
	OnDrawableChangeListener mListener;
	public void setOnDrawableChangeListener(OnDrawableChangeListener listener) {
		mListener = listener;
	}
	
	@Override
	public void setPosition(int x, int y) {
		if (this.x != x || this.y != y) {
			this.x = x;
			this.y = y;
			if (mListener != null) {
				mListener.onPositionChanged(this);
			}
			onPositionChanged();
		}
	}
	
	protected void onPositionChanged() {
		
	}
	
	@Override
	public Point getPosition() {
		return new Point(x,y);
	}

	@Override
	public void movePosition() {
		int dx = 5 + r.nextInt(5);
		int dy = 5 + r.nextInt(5);
		setPosition(x + dx, y + dy);
	}
	
}
