package com.mywork.SpringAnotation;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	void start() {
		System.out.println("Engine Started");
	}
}
