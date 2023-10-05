package com.thebank.backend.customer;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	public List<Customer> getCustomers() {
		return List.of(
			new Customer(
					1L,
					"Joe",
					"Joe@mail.com"),
			new Customer(
					2L,
					"Jane",
					"Jane@mail.com")
		);
	}
}
