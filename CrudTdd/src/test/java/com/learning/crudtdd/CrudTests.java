package com.learning.crudtdd;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.learning.crudtdd.jdbc.DbConnection;
import com.learning.crudtdd.models.StudentModel;

public class CrudTests {

	static DbConnection dbConnection=new DbConnection();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Checking Connection");
		boolean connectionEstablished=dbConnection.isConnected();
		assertEquals(true, connectionEstablished);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Test
	public void insertStudentTest()
	{
		StudentModel model=new StudentModel(16, "Shivani", "shivani@gmail.com", "Santacruz");
		int rowCount=dbConnection.insertStudent(model);
		assertEquals(true, rowCount>0);
	}
	
	@Ignore
	public void getAllStudentsTest() {
		List<StudentModel> receivedList=dbConnection.getAllStudents();
		assertEquals(true, receivedList.size()>0);
	}
	
	@Ignore
	public void getStudentByIdTest()
	{
		StudentModel receivedObj=dbConnection.getStudentById(15);
		System.out.println(receivedObj.getStdName());
		assertEquals("Maitreya", receivedObj.getStdName());
	}
	
	@Ignore
	public void editStudentTest()
	{
		StudentModel model=new StudentModel(16, "Vicky", "vicky@gmail.com", "Santacruz");
		int rowCount=dbConnection.editStudent(model);
		assertEquals(true, rowCount>0);
	}
	
	@Ignore
	public void deleteStudentTest()
	{
		int rowCount=dbConnection.deleteStudent(16);
		assertEquals(true, rowCount>0);
	}

}
