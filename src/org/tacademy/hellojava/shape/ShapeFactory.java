package org.tacademy.hellojava.shape;

import java.util.Random;

import org.tacademy.hellojava.exception.BadPointException;

public class ShapeFactory {
	static Random r = new Random();

	public static Shape createShape() {
		while (true) {
			try {
				int type = r.nextInt(2);
				if (type == 0) {
					return new Triangle();
				} else {
					return new Circle();
				}
			} catch (BadPointException e) {
				e.printStackTrace();
			}
		}
	}
}
