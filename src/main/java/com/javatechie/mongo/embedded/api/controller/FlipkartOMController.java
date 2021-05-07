package com.javatechie.mongo.embedded.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.mongo.embedded.api.model.User;
import com.javatechie.mongo.embedded.api.services.UserService;


@RestController
@RequestMapping("/")
public class FlipkartOMController {
	
@Autowired
private UserService uService;
	
//	@Autowired
//	private uService uService;

	@PostMapping("/placeOrderNow")
	public String placeOrder(@RequestBody User req) {
		uService.saveUser(req);
		return "Order placed Successfully";
	}

	@GetMapping("/getUserByName/{name}")
	public List<User> getUserbyName(@PathVariable String name){
		return uService.findByName(name);
	}
	
	@GetMapping("/getAllUser")
	public List<User> getAllUser(){
		return uService.findAllUsers();
	}
	
	@GetMapping("/getUserByCity/{city}")
	public List<User> getByCity(@PathVariable String city){
		return uService.findByCity(city);
	}
	@GetMapping("/getUserById/{id}")
	public Optional<User> getUserById(@PathVariable Integer id){
		return uService.findByUserId(id);
	}

}
