package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.Userrepository;
import com.example.demo.service.Userservice;

@Service
public class Serviceimpl implements Userservice {
	@Autowired
	Userrepository ur;

	@Override
	public String savaUser(User u) {
		ur.save(u);
		return "data added successfully";
	}

	@Override
	public List<User> getData() {
		List<User> l=(List<User>) ur.findAll();
		return l;
	}

}
