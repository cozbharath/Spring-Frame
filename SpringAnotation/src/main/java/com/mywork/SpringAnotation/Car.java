package com.mywork.SpringAnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private Engine engine;

	void drive() {
		engine.start();
		System.out.println("Car Started");
	}

}
