package com.learning.crudtdd.models;

public class StudentModel {
	int stdId;
	String stdName;
	String stdMail;
	String stdAddr;
	
	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentModel(int stdId, String stdName, String stdMail, String stdAddr) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdMail = stdMail;
		this.stdAddr = stdAddr;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdMail() {
		return stdMail;
	}

	public void setStdMail(String stdMail) {
		this.stdMail = stdMail;
	}

	public String getStdAddr() {
		return stdAddr;
	}

	public void setStdAddr(String stdAddr) {
		this.stdAddr = stdAddr;
	}

	@Override
	public String toString() {
		return "StudentModel [stdId=" + stdId + ", stdName=" + stdName + ", stdMail=" + stdMail + ", stdAddr=" + stdAddr
				+ "]";
	}
	
	
	
}
