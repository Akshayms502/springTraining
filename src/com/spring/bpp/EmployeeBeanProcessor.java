package com.spring.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.spring.Employee;

public class EmployeeBeanProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("********************************before initialization****************");
		
		if(bean instanceof Employee){
			Employee emp=(Employee) bean;
			emp.setEmpname(emp.getEmpname().toUpperCase());
			return emp;
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("********************************after initialization****************");
		return bean;
	}

}
