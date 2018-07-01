package com.learnjava.model;

import lombok.Data;

@Data
public class Product {
	private int id;
	private String name;
	private String descriprion;

	public Product(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.descriprion = description;
	}
}
