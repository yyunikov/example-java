package org.jacoco.examples.maven.java;

public class HelloWorld3 {
	
	public String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

	public String getMessage2() {
		return "Hello World2!";
	}
}
