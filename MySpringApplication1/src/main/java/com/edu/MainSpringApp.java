package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Student s= (Student) context.getBean("Studentob");
		Course c= (Course) context.getBean("Courseob");
		s.display();
		c.display();
	}

}
