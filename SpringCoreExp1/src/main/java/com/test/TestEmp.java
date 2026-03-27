package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmp {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigEmployee.class);
		
		Employee obj1 = ctx.getBean("getSetterObj", Employee.class);
		
		System.out.println("SetterInjection"+ obj1);
		
		obj1.setId(203);
		obj1.setName("SKY");
		obj1.setCmp("IPL");
		obj1.setSalary(3423);
		
		System.out.println(obj1);
		
		Employee obj2 = ctx.getBean("getConstObj", Employee.class);
		
		System.out.println(obj2);
		
	}
}