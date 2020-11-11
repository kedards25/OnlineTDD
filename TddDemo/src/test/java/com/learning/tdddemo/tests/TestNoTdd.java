package com.learning.tdddemo.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.learning.tdddemo.classes.NoTdd;

public class TestNoTdd {

	NoTdd noTdd=new NoTdd();
	
	@Test	//states that following method needs to be tested
	public void testAdd() {
		System.out.println("Test case is being executed");
		int val=noTdd.add(5, 8);
		assertEquals(12, val);
	}

}
