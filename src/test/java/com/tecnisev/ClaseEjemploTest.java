package com.tecnisev;

import org.junit.Test;

import junit.framework.TestCase;

public class ClaseEjemploTest extends TestCase {
	
	@Test
	public void testClaseEjemplo()
	{	
		ClaseEjemplo ce = new ClaseEjemplo();
		assertEquals(ce.variable, 0);
		ce.tellMeSomething(3);
	}
	
}