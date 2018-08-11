package com.hellojxl.helloMybaits.Dao;

import java.util.List;
import com.hellojxl.helloMybaits.Entity.*;

public interface UserService {
	
	public List<User> getAll();
	public User getUser(int id);
	public int deleteUser(int id);
	public int addUser(User u);
	public int editUser(User u);
	
}
