package com.learning.tdddemo.classes;

public class Tdd {

	
	 public int id;
	 public String name;

	public int addNums(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	public int subtractNums(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	public int divide(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}

	public Tdd saveData(Tdd td) {
		id=td.id;
		name=td.name;
		return td;
		
	}

}
