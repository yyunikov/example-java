package org.jacoco.examples.maven.java;

import org.junit.Before;

public class HelloWorldTest {

	private HelloWorld subject;

	@Before
	public void setup() {
		subject = new HelloWorld();
	}
}
