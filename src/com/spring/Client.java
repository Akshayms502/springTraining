package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.HelloService;



public class Client {

	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring-context1.xml","spring-context.xml");
		Employee emp=context.getBean("employee",Employee.class);
		
		System.out.println(emp.getEmpid());
		System.out.println(emp.getEmpname());
		System.out.println(emp.getEmpsal());
		System.out.println(emp.hashCode());
		
		System.out.println("-----------------------------------------");
		emp=context.getBean("employee",Employee.class);
		
		System.out.println(emp.getEmpid());
		System.out.println(emp.getEmpname());
		System.out.println(emp.getEmpsal());
		System.out.println(emp.hashCode());
		
		
		HelloService h=(HelloService) context.getBean("hello");
		System.out.println(h.SayHello());
		
		context.registerShutdownHook();

	}

}
