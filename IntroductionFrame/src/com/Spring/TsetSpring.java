package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TsetSpring {

	public static void main(String[] args) {

//		HelloSpring h1 = new HelloSpring();

		/*
		 * h1.setSid(101); h1.setSname("Nava Bharath");
		 * 
		 * System.out.println(h1.getSid()); System.out.println(h1.getSnamen());
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloSpring ht = (HelloSpring) context.getBean("ht");

		System.out.println(ht.getSid());
		System.out.println(ht.getSname());

	}

}
