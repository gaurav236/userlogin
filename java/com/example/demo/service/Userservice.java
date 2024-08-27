package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface Userservice {

	public String savaUser(User u);

	public List<User> getData();

}
