package com.learning.testsuitedemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({AdditionTestClass.class,SubtractionTestClass.class,
	DivisionTestClass.class,MultiplicationTestClass.class})
public class TestSuiteClass {

}
