package com.cts.app.dao;

import com.cts.app.entity.User;

public interface UserDao {
	
	public boolean addUser(User user);
	
	public boolean updateUser(User user);
	
	public User getUserByEmail(String email);
}
