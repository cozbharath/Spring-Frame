package com.mywork.JavaSpring;

public class Car {

	private Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}

	void drive() {
		System.out.println("Drive Method Called");
		engine.start();
	}

}
