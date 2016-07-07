package org.tacademy.hellojava.drawable;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.tacademy.hellojava.annotation.Friend;

@Friend(name="group",level=10)
public class DrawableGroup<T extends Drawable> extends AbstractDrawable {

	List<T> items = new ArrayList<T>();
	
	public void add(T item) {
		items.add(item);
	}
	
	public int getSize() {
		return items.size();
	}
	
	@Override
	public void draw(PrintStream canvas) {
		for (Drawable d : items) {
			d.draw(canvas);
		}
	}

	@Override
	public Rect getBounds() {
		if (getSize() == 0) return null;		
		return items.get(0).getBounds();
	}

}
