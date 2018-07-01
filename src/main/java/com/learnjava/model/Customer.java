package com.learnjava.model;

import java.util.List;

import lombok.Data;
@Data
public class Customer {
	private int id;
	private String name;
	private String description;
	private List<Product> products;

	public Customer(int id, String name, String description, List<Product> products) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.products = products;
	}
}
