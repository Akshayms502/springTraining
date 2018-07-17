package com.spring.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ap=new AnnotationConfigApplicationContext(AppConfig.class);
		Greeting greet=(Greeting) ap.getBean("english");
		System.out.println(greet.greetHello());

	}

}
