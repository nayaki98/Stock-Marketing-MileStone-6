package com.example.stockspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.UserDao;
import com.example.stockspring.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userdao;
	
	public void loginUser(User user) 
	{
		userdao.save(user);
	
	}

	@Override
	public List<User> findByuserName(String uname) {
		
		return userdao.findByuserName(uname);
	}

	
}
