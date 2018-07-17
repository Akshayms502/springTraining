package com.spring.autowire.anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Screen {
	@Autowired
	Values val;
	public String glassType;
	private int len;
	private int bre;
	public String getGlassType() {
		return glassType;
	}
	public void setGlassType(String glassType) {
		this.glassType = val.getGlassType();
	}
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = val.getLen();
	}
	public int getBre() {
		return bre;
	}
	public void setBre(int bre) {
		this.bre = val.getBre();
	}

	
	

}
