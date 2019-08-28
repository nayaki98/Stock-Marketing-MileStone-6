package com.example.stockspring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

import com.example.stockspring.model.User;

/*@Repository
public class UserDaoImpl implements UserDao {



	@Override
	public int loginUser(User user) {
		int result = 0;
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/stock","root","root");  
			PreparedStatement ps=con.prepareStatement("insert into user(username,password,email,mobilenumber) value(?,?,?,?)");
		
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getMobileNumber());
			result=ps.executeUpdate();
			if(result>0) {
				System.out.println("inserted");
			}
			else
			{
				System.out.println("not inserted");
			}
			}
			catch (Exception e) {
			e.printStackTrace();
			}
		
		return result;
		
	}

}
*/