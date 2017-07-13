package org.jacoco.examples.maven.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorld2Test {

	private HelloWorld2 subject;

	@Before
	public void setup() {
		subject = new HelloWorld2();
	}
	@Test
	public void testGetMessage() {
		assertEquals("Hello World!", subject.getMessage(false));
		assertEquals("Hello Universe!", subject.getMessage(true));
	}
}
