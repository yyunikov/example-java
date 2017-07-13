package org.jacoco.examples.maven.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorld3Test {

	private HelloWorld3 subject;

	@Before
	public void setup() {
		subject = new HelloWorld3();
	}

	@Test
	public void testGetMessage() {
		assertEquals("Hello World!", subject.getMessage(false));
		assertEquals("Hello Universe!", subject.getMessage(true));
	}

	@Test
	public void testGetMessage2() {
		assertEquals("Hello World2!", subject.getMessage2());
	}
}
