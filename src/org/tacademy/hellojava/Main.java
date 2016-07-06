package org.tacademy.hellojava;

import java.util.Random;

import org.tacademy.hellojava.shape.Shape;
import org.tacademy.hellojava.shape.ShapeFactory;

public class Main {
	
	Shape[] shapes;
	Random r = new Random();
	public void createShape() {
		int count = r.nextInt(10);
		shapes = new Shape[count];
		for (int i = 0 ; i < count; i++) {
			shapes[i] = ShapeFactory.createShape();
		}
	}
	
	public void printShape() {
		if (shapes == null) return;
		for (Shape s : shapes) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.createShape();
		main.printShape();
//		System.out.println(main);
	}
	
	@Override
	public String toString() {
		return "Main class";
	}

}
