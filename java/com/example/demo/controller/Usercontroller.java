package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.Userservice;

@RestController
public class Usercontroller {
	@Autowired
	Userservice us;

	@PostMapping(value = "/use")
	public String addUser(@RequestBody User u) {
		if (u != null) {
			String msg = us.savaUser(u);
			return msg;
		} else {
			return "please send valid data";
		}
	}

	@GetMapping(value = "/use")
	public List<User> getUsers() {
		List<User> l = us.getData();
		return l;

	}

}
