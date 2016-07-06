package org.tacademy.hellojava.image;

public class Image {
	String text;
	public Image(String text) {
		if (text == null) {
			text = "";
		}
		this.text = text;
	}
	
	@Override
	public String toString() {
		return text;
	}
	
	public int getWidth() {
		return 10 * text.length();
	}
	
	public int getHeight() {
		return 10;
	}
}
