package com.learning.testsuitedemo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.learning.testsuitedemo.classes.DivisionClass;


public class DivisionTestClass {

DivisionClass divisionClass=new DivisionClass();
	
	@Test
	public void testsubtract()
	{
		assertEquals(2, divisionClass.divide(10,5));
	}
}
