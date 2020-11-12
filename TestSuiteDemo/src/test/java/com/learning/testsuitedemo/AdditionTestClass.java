package com.learning.testsuitedemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.learning.testsuitedemo.classes.AdditionClass;

public class AdditionTestClass {

	AdditionClass additionClass=new AdditionClass();
	
	@Test
	public void testAdd()
	{
		assertEquals(12, additionClass.add(5,7));
	}
}
