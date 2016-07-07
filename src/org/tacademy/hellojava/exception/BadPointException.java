package org.tacademy.hellojava.exception;

public class BadPointException extends Exception {
	public BadPointException() {
		super();
	}
	
	public BadPointException(String message) {
		super(message);
	}
	
	public BadPointException(String message, int x, int y) {
		super(message + x + "," + y);
	}
}
