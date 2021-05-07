package com.javatechie.mongo.embedded.api.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;

//@Data
//@Getter
//@Setter
//@AllArgsConstructor
@Document(collection = "order_DB")
public class User {
	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public User(int id, String name, String gender, List<Product> products, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.products = products;
		this.address = address;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String gender;
	private List<Product> products;
	private Address address;
	
	
	
}
