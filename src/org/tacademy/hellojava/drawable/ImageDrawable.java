package org.tacademy.hellojava.drawable;

import java.io.PrintStream;

import org.tacademy.hellojava.annotation.Enemy;
import org.tacademy.hellojava.image.Image;

@Enemy
public class ImageDrawable extends AbstractDrawable {
	
	Image image;
	
	public ImageDrawable(Image image) {
		this.image = image;
	}
	
	@Override
	public void draw(PrintStream canvas) {
		canvas.println(image);
	}

	@Override
	public Rect getBounds() {
		Rect rect = new Rect(x, y, x + image.getWidth(), y + image.getHeight());
		return rect;
	}

}
