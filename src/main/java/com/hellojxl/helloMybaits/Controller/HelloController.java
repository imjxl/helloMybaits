package com.hellojxl.helloMybaits.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hellojxl.helloMybaits.Dao.UserService;
import com.hellojxl.helloMybaits.Entity.User;

@RestController
public class HelloController {
	
	
	@Autowired
	private UserService userService;
	
    @RequestMapping(value="/get")
    public List<User> getAll(){
    	List<User> test=userService.getAll();
        return test;
    }
    
    @RequestMapping("/user")
    public User GetUser(int id) {
    	return userService.getUser(id);
    }
    @RequestMapping("/add")
    public boolean addUser(@RequestBody User u) {
    	int i= userService.addUser(u);
    	System.out.println("addUser---------"+i);
    	if(i>0) {
			return true;
		}
		else {
			return false;
		}
	}
    
    @RequestMapping("/edit")
    public boolean editUser(@RequestBody User u) {
		int i=userService.editUser(u);
		System.out.println("editUser----------"+ i);
		if(i>0) {
			return true;
		}
		else {
			return false;
		}
			
		
	}
    
    @RequestMapping("/delete")
    public boolean deleteUser(int id) {
    	int i= userService.deleteUser(id);
    	System.out.println("deleteUser----------"+ i);
    	if(i>0) {
			return true;
		}
		else {
			return false;
		}
	}
}
