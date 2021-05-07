package com.javatechie.mongo.embedded.api.repositary;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.javatechie.mongo.embedded.api.model.User;

@Repository
public interface FlipkartRepo extends MongoRepository<User, Integer> {

	List<User> findByName(String name);

	Optional<User> findById(Integer id);

	@Query("{'Address.city':?0}")
	List<User> findByCity(String city);

}
