package com.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.Student;
import com.view.StudentForm;

public class StudentServiceImpl implements StudentService{

	@Override
	public boolean addStudent(Student s) {
		
		String sql ="insert into Student(fname,lname,dob,email,college,faculty,rollno,age,country,state,phone,gender,city) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			
			PreparedStatement pstm = DB.getDbCon().prepareStatement(sql);
			
			pstm.setString(1, s.getFname());
			pstm.setString(2, s.getLname());
			pstm.setString(3, s.getDob());
			pstm.setString(4, s.getEmail());
			pstm.setString(5, s.getCollege());
			pstm.setString(6, s.getFaculty());
			pstm.setLong(7, s.getRollno());
			pstm.setLong(8, s.getAge());
			pstm.setString(9, s.getCountry());
			pstm.setString(10, s.getState());
			pstm.setString(11, s.getPhone());
			pstm.setString(12, s.getGender());
			pstm.setString(13, s.getCity());
			
			pstm.execute();
			
			
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteStudent(int id) {
		
		String sql = "Delete from student where id = " + id;
		try {
			
			Statement stm = DB.getDbCon().createStatement();
			stm.execute(sql);
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean updateStudent(Student s) {
		
		String sql ="update Student set fname=?,lname=?,dob=?,email=?,college=?,faculty=?,rollno=?,age=?,country=?,state=?,phone=?,gender=?,city=? where id=?";
		
		try {
			
			PreparedStatement pstm = DB.getDbCon().prepareStatement(sql);
			
			pstm.setString(1, s.getFname());
			pstm.setString(2, s.getLname());
			pstm.setString(3, s.getDob());
			pstm.setString(4, s.getEmail());
			pstm.setString(5, s.getCollege());
			pstm.setString(6, s.getFaculty());
			pstm.setLong(7, s.getRollno());
			pstm.setLong(8, s.getAge());
			pstm.setString(9, s.getCountry());
			pstm.setString(10, s.getState());
			pstm.setString(11, s.getPhone());
			pstm.setString(12, s.getGender());
			pstm.setString(13, s.getCity());
			pstm.setInt(14, s.getId());
			
			pstm.execute();
			
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
		
	}

	@Override
	public Student getStudentById(int id) {
		
		Student s = new Student(); 
		
		String sql = "Select * from student where id = "+id;
		
		try {
			Statement stm = DB.getDbCon().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			if(rs.next()) {
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setCollege(rs.getString("college"));
				s.setAge(rs.getInt("age"));
				s.setPhone(rs.getString("phone"));
				s.setCountry(rs.getString("country"));
				s.setCity(rs.getString("city"));
				s.setEmail(rs.getString("email"));
				s.setState(rs.getString("state"));
				s.setDob(rs.getString("dob"));
				s.setGender(rs.getString("gender"));
				s.setFaculty(rs.getString("faculty"));
				s.setRollno(rs.getInt("rollno"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s;
	}

	@Override
	public List<Student> getAllStudent() {
		
		List<Student> slist = new ArrayList<>();
		
		String sql = "Select * from student";
		
		try {
			Statement stm = DB.getDbCon().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				Student s = new Student();
				
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setCollege(rs.getString("college"));
				s.setAge(rs.getInt("age"));
				s.setPhone(rs.getString("phone"));
				
				slist.add(s);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return slist;
	}

	@Override
	public List<Student> searchStudent(String sdata) {
		List<Student> slist = new ArrayList<>();
		
		String sql = "Select * from student where fname like '%"+sdata+"%' or  college like '%"+sdata+"%'";
		
		try {
			Statement stm = DB.getDbCon().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				Student s = new Student();
				
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setCollege(rs.getString("college"));
				s.setAge(rs.getInt("age"));
				s.setPhone(rs.getString("phone"));
				
				slist.add(s);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return slist;
	}

}
