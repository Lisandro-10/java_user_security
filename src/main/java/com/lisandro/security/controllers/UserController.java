package com.lisandro.security.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lisandro.security.models.Users;
import com.lisandro.security.services.UserService;

@RestController
@RequestMapping(path = "/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping({"", "/"})
	public List<Users> getUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/{username}")
	public Users getUserByUsername(@RequestBody String username) {
		return userService.getUserByUsername(username);
	}

}
