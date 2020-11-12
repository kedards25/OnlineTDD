package com.learning.crudtdd.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.learning.crudtdd.models.StudentModel;

public class DbConnection {

	Connection connection=null;
	String user="sa";
	String password="";
	String url="jdbc:h2:tcp://localhost/~/test";
	Statement statement=null;
	PreparedStatement preparedStatement=null;
	StudentModel student=null;
	int id,rowsAffected=0;
	String name,mail,addr;
	
	public boolean isConnected() {
		try {
			Class.forName("org.h2.Driver");
			connection=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("Connection error: "+e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Driver class error: "+e.getMessage());
		}
		if(connection!=null)
			return true;
		return false;
	}
	
	public int insertStudent(StudentModel model) {
		
		if(isConnected())
		{
			String query="insert into student(student_id,student_name,student_mail,student_addr) "
					+ "values(?,?,?,?)";
			try {
				preparedStatement=connection.prepareStatement(query);
				preparedStatement.setInt(1,model.getStdId());
				preparedStatement.setString(2,model.getStdName());
				preparedStatement.setString(3,model.getStdMail());
				preparedStatement.setString(4,model.getStdAddr());

				rowsAffected=preparedStatement.executeUpdate();
			} catch (SQLException e) {
				System.out.println("Error while fetching records: "+e.getMessage());
			}
		}
		return rowsAffected;
	}

	public List<StudentModel> getAllStudents() {
		
		List<StudentModel> studentList=new ArrayList<StudentModel>();
		if(isConnected())
		{
			String query="select * from student";
			try {
				statement=connection.createStatement();
				ResultSet resultSet= statement.executeQuery(query);
				while(resultSet.next())
				{
					
					id=resultSet.getInt("student_id");
					name=resultSet.getString("student_name");
					mail=resultSet.getString("student_mail");
					addr=resultSet.getString("student_addr");
					student=new StudentModel(id, name, mail, addr);
					studentList.add(student);
				}
				
			} catch (SQLException e) {
				System.out.println("Error while fetching records: "+e.getMessage());
			}
		}
		
		return studentList;
	}

	public StudentModel getStudentById(int stdId) {
		if(isConnected())
		{
			String query="select * from student where student_id=?";
			try {
				preparedStatement=connection.prepareStatement(query);
				preparedStatement.setInt(1,stdId);
				ResultSet resultSet= preparedStatement.executeQuery();
				while(resultSet.next())
				{
					id=resultSet.getInt("student_id");
					name=resultSet.getString("student_name");
					mail=resultSet.getString("student_mail");
					addr=resultSet.getString("student_addr");
					student=new StudentModel(id, name, mail, addr);
				}
				
			} catch (SQLException e) {
				System.out.println("Error while fetching records: "+e.getMessage());
			}
		}
		
		return student;
	}

	public int editStudent(StudentModel model) {
		if(isConnected())
		{
			String query="update student set student_name=?,student_mail=?,student_addr=? "
					+ "where student_id=?";
			try {
				preparedStatement=connection.prepareStatement(query);
				preparedStatement.setString(1,model.getStdName());
				preparedStatement.setString(2,model.getStdMail());
				preparedStatement.setString(3,model.getStdAddr());
				preparedStatement.setInt(4,model.getStdId());
				rowsAffected=preparedStatement.executeUpdate();
			} catch (SQLException e) {
				System.out.println("Error while fetching records: "+e.getMessage());
			}
		}
		
		return rowsAffected;
	}

	public int deleteStudent(int i) {
		if(isConnected())
		{
			String query="delete student where student_id=?";
			try {
				preparedStatement=connection.prepareStatement(query);
				preparedStatement.setInt(1,i);
				rowsAffected=preparedStatement.executeUpdate();
			} catch (SQLException e) {
				System.out.println("Error while fetching records: "+e.getMessage());
			}
		}
		return rowsAffected;
	}



	

}
