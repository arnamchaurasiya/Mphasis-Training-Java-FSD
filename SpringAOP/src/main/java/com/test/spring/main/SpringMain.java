package com.test.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.spring.service.EmployeeService;

public class SpringMain {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService empservice =  ctx.getBean("employeeService", EmployeeService.class);
		
		String name =  empservice.getEmployee().getName();
		
		System.out.println("AOP FROM MAIN CLASS : "+name);
		
		empservice.getEmployee().setName("Rohit Sharma");
		
		empservice.getEmployee().throwException();
	}
}
