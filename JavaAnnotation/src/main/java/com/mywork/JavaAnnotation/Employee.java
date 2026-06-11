package com.mywork.JavaAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Autowired
	private Address address;

	public void display() {
		address.getCity();
		System.out.println("Telangana");
	}
}
