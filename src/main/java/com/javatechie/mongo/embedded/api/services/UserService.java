package com.javatechie.mongo.embedded.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.mongo.embedded.api.model.User;
import com.javatechie.mongo.embedded.api.repositary.FlipkartRepo;

@Service
public class UserService {
	@Autowired
	private FlipkartRepo flipkartRepo ; 
	
	/*
	 * @Autowired public UserService(FlipkartRepo flipkartRepo) { this.flipkartRepo
	 * = flipkartRepo; }
	 */
	/*
	 * public void updateUserByName(User user, Integer id) { User tempUser =
	 * flipkartRepo.findByIdUser(id); tempUser = user; flipkartRepo.save(tempUser);
	 * }
	 */


	public void saveUser(User req) {
		flipkartRepo.save(req);
	}


	public List<User> findByName(String name) {
		return flipkartRepo.findByName(name);
	}


	public List<User> findByCity(String city) {
		// TODO Auto-generated method stub
		return flipkartRepo.findByCity(city);
	}


	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return flipkartRepo.findAll();
	}
	
	public Optional<User> findByUserId(Integer id) {
		return flipkartRepo.findById(id);
		
	}

}
