package com.mywork.JavaSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Car c1 = (Car) context.getBean(Car.class);

		c1.drive();
	}
}
