package org.tacademy.hellojava;

import java.util.Random;

import org.tacademy.hellojava.annotation.Enemy;
import org.tacademy.hellojava.annotation.Friend;
import org.tacademy.hellojava.drawable.AbstractDrawable;
import org.tacademy.hellojava.drawable.Drawable;
import org.tacademy.hellojava.drawable.ImageDrawable;
import org.tacademy.hellojava.drawable.OnDrawableChangeListener;
import org.tacademy.hellojava.image.Image;
import org.tacademy.hellojava.shape.Shape;
import org.tacademy.hellojava.shape.ShapeFactory;

public class Main implements OnDrawableChangeListener {
	
	Shape[] shapes;
	Drawable[] drawables;
	
	Random r = new Random();
	public void createShape() {
		int count = r.nextInt(10);
		shapes = new Shape[count];
		for (int i = 0 ; i < count; i++) {
			shapes[i] = ShapeFactory.createShape();
		}
	}
	
	public void createDrawable() {
		int count = r.nextInt(10);
		drawables = new Drawable[count];
		for (int i = 0; i < count; i++) {
			if (i % 3 == 0) {
				Image image = new Image("image " + i);
				ImageDrawable d = new ImageDrawable(image); 
				d.setOnDrawableChangeListener(this);
				drawables[i] = d;
			} else {
				Shape s = ShapeFactory.createShape();
				s.setOnDrawableChangeListener(this);
				drawables[i] = s;
			}
			
		}
	}
	
	public void printShape() {
		if (shapes == null) return;
		for (Shape s : shapes) {
			System.out.println(s);
		}
	}
	
	public void printDrawable() {
		for (Drawable d : drawables) {
			d.draw(System.out);
			if (d.getClass().isAnnotationPresent(Friend.class)) {
//				Friend friend = d.getClass().getAnnotation(Friend.class);
				System.out.println("Friend");
			} else if (d.getClass().isAnnotationPresent(Enemy.class)) {
				System.out.println("Enemy");
			}
		}
	}

	public void moveDrawable() {
		for (Drawable d : drawables) {
			d.movePosition();
		}
	}
	
	public boolean isCollapse(Drawable d1, Drawable d2) {
		if ((d1.getClass().isAnnotationPresent(Friend.class) && d2.getClass().isAnnotationPresent(Friend.class)) || 
				(d1.getClass().isAnnotationPresent(Enemy.class) && d2.getClass().isAnnotationPresent(Enemy.class))){
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
//		main.createShape();
//		main.printShape();
//		System.out.println(main);
		main.createDrawable();
		main.printDrawable();
		main.moveDrawable();
	}
	
	@Override
	public String toString() {
		return "Main class";
	}

	@Override
	public void onPositionChanged(Drawable d) {
		if (d instanceof AbstractDrawable) {
			System.out.println("AbstractDrawable position changed" );
		} else if (d instanceof Shape) {
			System.out.println("Shape position changed");
		}
	}

}
