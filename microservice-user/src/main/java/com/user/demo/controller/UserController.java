package com.user.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.user.demo.model.User;
import com.user.demo.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@PostMapping("/insertNewUser")
	public String insertNewUser(@ModelAttribute("user") User user) {
		userRepo.save(user);
		return "insertNewUser";
	}
	
	@GetMapping(path="/viewAllUsers")
	public String getAllUsers(Model model) {
		List<User> users = new ArrayList<User>();
		for(User us: userRepo.findAll()) {
			users.add(us);
		}
		model.addAttribute("users",users);
		return "viewAllUsers";
	}

}
