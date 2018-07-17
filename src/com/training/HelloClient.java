package com.training;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class HelloClient {

	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("spring-context.xml");
		
		HelloService h=(HelloService) factory.getBean("hello");
		System.out.println(h.SayHello());

	}

}
