package com.example.stockspring.service;

import java.util.List;

import com.example.stockspring.model.User;

public interface UserService {

	void loginUser(User user);

	List<User> findByuserName(String uname);

}
