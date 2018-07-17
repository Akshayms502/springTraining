package com.spring.autowire.anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	@Autowired
	Values val;
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = val.getType();
	}

	
	
	

}
