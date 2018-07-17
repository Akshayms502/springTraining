package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-context2.xml");
		Mobile mobile=(Mobile) context.getBean("mobile");
		
		System.out.println("mobile details");
		
		System.out.println(mobile.getCamera().getType());
		System.out.println(mobile.getSpeaker().getType()+","+mobile.getSpeaker().getVolLevel());
		System.out.println(mobile.getScreen().getGlassType()+","+mobile.getScreen().getBre());
	}

}
