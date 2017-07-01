package org.jacoco.examples.maven.java;

public class HelloWorld {
	
	public String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

	public String getAnotherMessage() {
		return "Another";
	}

	public String getAnotherMessage2() {
		return "Another2";
	}
}
