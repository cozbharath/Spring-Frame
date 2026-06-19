package com.mywork.SetterConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Laptop l1 = (Laptop) context.getBean("lp1");

		/*
		 * l1.setBrand("Dell"); l1.setModel("Intel-Core");
		 */

		l1.show();

		System.out.println("______________________________________________________________________");

		Laptop l2 = (Laptop) context.getBean("lp1");
		l2.show();
		System.out.println("_____________________________________________________________________");

		Laptop l3 = (Laptop) context.getBean("lp2");

		l3.show();

	}
}
