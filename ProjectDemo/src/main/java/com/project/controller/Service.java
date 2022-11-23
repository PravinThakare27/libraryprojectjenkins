package com.project.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.project.pojo.DataSource;
import com.project.pojo.User;

public class Service {
	
int register(User u) throws ClassNotFoundException, SQLException
{
	Connection con=DataSource.data();
	String url="insert into userlogin values('"+u.getMobile()+"','"+u.getAddress()+"','"+u.getEmail()+"','"+u.getFirstname()+"','"+u.getLastname()+"','"+u.getPassword()+"')";
	Statement s=con.createStatement();
	int i=s.executeUpdate(url);
	return i;
	
	
	
	
}

public boolean login(String email, String password) throws ClassNotFoundException, SQLException {
	// TODO Auto-generated method stub
	Connection con=DataSource.data();
	PreparedStatement p=con.prepareStatement("select * from userlogin where email=? and password=?");
	p.setString(1, email);
	p.setString(2, password);
	ResultSet s=p.executeQuery();
	boolean i=s.next();
	
	return i;
	
	
	
}

public int update(User u) throws ClassNotFoundException, SQLException {
	// TODO Auto-generated method stub
	Connection con=DataSource.data();
	PreparedStatement p=con.prepareStatement("update userlogin set mobile=?,address=?,firstname=?,lastname=? where email=?");
	p.setString(1, u.getMobile());
	p.setString(2, u.getAddress());
	p.setString(3, u.getFirstname());
	p.setString(4,u.getLastname());
	p.setString(5, u.getEmail());
	int i=p.executeUpdate();
	return i;
}

}
