package org.tacademy.hellojava.shape;

import java.util.Random;

public class ShapeFactory {
	static Random r = new Random();
	public static Shape createShape() {
		int type = r.nextInt(2);
		if (type == 0) {
			return new Triangle();
		} else {
			return new Circle();
		}
	}
}
