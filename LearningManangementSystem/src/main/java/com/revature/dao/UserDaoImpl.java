package com.revature.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.revature.exception.UserNameTaken;
import com.revature.exception.UserNotFound;
import com.revature.pojo.User;

public class UserDaoImpl implements UserDao{
	
	public static List<User> userList;

	@Override
	public void createUser(User user) throws UserNameTaken {
		
		if (user.getUsername() != null && user.getPassword() != null) {
			
			Iterator<User> iter = userList.iterator();
			
			while (iter.hasNext()) {
				if (iter.next().getUsername().equals(user.getUsername())) {
					throw new UserNameTaken("sorry! This username is already taken taken");
				}
			}
			
			//If username not taken, add user
			userList.add(user);
			
		}
		
	}

	@Override
	public User getUserByUsername(String username) throws UserNotFound {

		Iterator<User> iter = userList.iterator();
		
		while (iter.hasNext()) {
			
			User existingUser = iter.next();
			if (existingUser.getUsername().equalsIgnoreCase(username)) {
				return existingUser;
			}
		}
		
		throw new UserNotFound();
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public UserDaoImpl() {
		super();
		userList = new ArrayList<>();
		userList.add(new User("pinal", "soni123"));
		userList.add(new User("hina", "hina786"));
		
	}
	
}
