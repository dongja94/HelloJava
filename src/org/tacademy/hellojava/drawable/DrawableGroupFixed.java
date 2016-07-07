package org.tacademy.hellojava.drawable;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class DrawableGroupFixed extends AbstractDrawable{

	List<Drawable> items = new ArrayList<>();
	public void add(Drawable d) {
		items.add(d);
	}
	@Override
	public void draw(PrintStream canvas) {
		
	}

	@Override
	public Rect getBounds() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
