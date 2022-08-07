package com;

import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathxmlApplicationContext("AppConfig.xml");
		Student s =context.getBean(Student.Class);
		System.out.printl(s);
		Exam e=(Exam)context.getBean("exam");
		System.out.println(e);

	}

}
