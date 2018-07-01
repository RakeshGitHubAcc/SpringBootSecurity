package com.learnjava.service;

import java.util.Arrays;
import java.util.List;

import org.assertj.core.util.Lists;
import org.springframework.stereotype.Service;

import com.learnjava.model.Customer;
import com.learnjava.model.Product;
@Service
public class CustomerService {
	private static List<Customer> customers = Lists.newArrayList();
	static {
		Product prd1 = new Product(1, "Bag", "Addidas Bag");
		Product prd2 = new Product(2, "Shoe", "Addidas Shoe");
		Product prd3 = new Product(3, "Belt", "Addidas Belt");
		Product prd4 = new Product(4, "Tshirt", "Addidas Tshirt");
		Product prd5 = new Product(5, "Trousers", "Addidas Trousers");
		Customer cust1 = new Customer(1, "Rajesh", "Male", Arrays.asList(prd1, prd2, prd3));
		Customer cust2 = new Customer(2, "Rakesh", "Male", Arrays.asList(prd4, prd5, prd1));
		customers.add(cust1);
		customers.add(cust2);
	}

	public List<Customer> retriveAllCustomers() {
		return customers;
	}

	public Customer retriveCustomer(int custId) {
		Customer custFetch = null;
		for (Customer cust : customers) {
			if (null != cust && cust.getId() == custId) {
				custFetch = cust;
			}
		}
		return custFetch;
	}

	public Product retriveProductForCustomer(int customerId, int productId) {
		Product productFetch = null;
		Customer customer = retriveCustomer(customerId);
		if (null == customer) {
			return null;
		}
		for (Product product : customer.getProducts()) {
			if (null != product && product.getId() == productId) {
				productFetch = product;
			}
		}
		return productFetch;
	}
}
