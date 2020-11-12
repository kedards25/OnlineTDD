package com.learning.testsuitedemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.learning.testsuitedemo.classes.SubtractionClass;

public class SubtractionTestClass {

SubtractionClass subtractionClass=new SubtractionClass();
	
	@Test
	public void testsubtract()
	{
		assertEquals(2, subtractionClass.subtract(7,5));
	}
}
