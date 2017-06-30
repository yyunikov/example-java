package org.jacoco.examples.maven.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnotherHelloWorldTest {

	private AnotherHelloWorld subject;

	@Before
	public void setup() {
		subject = new AnotherHelloWorld();
	}

	@Test
	public void testGetMessage() {
		assertEquals("Another message", subject.getAnotherMessage());
	}

}
