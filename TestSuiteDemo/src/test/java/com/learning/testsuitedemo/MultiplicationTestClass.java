package com.learning.testsuitedemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class MultiplicationTestClass {
MultiplicationClass multiplicationClass=new MultiplicationClass();
	
	@Test
	public void testsubtract()
	{
		assertEquals(55, multiplicationClass.multiply(7,5));
	}
}
