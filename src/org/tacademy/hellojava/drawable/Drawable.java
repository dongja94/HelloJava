package org.tacademy.hellojava.drawable;

import java.io.PrintStream;

import org.tacademy.hellojava.exception.BadPointException;
import org.tacademy.hellojava.shape.Point;

public interface Drawable {
	public void setPosition(int x, int y);
	public void draw(PrintStream canvas);
	public void movePosition();
	public Point getPosition() throws BadPointException;
	public Rect getBounds();
}
