package com.learnjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learnjava.model.Customer;
import com.learnjava.model.Product;
import com.learnjava.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService custService;

	@GetMapping("/customers")
	public List<Customer> retriveAllCustomers() {
		return this.custService.retriveAllCustomers();
	}

	@GetMapping("/customers/{customerId}/products/{productId}")
	public Product retriveProduct(@PathVariable int customerId, @PathVariable int productId) {
		return this.custService.retriveProductForCustomer(customerId, productId);
	}
}
