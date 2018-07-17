package com.training1;

public class DefaultHello implements HelloService{
	
	private String name;
	private String city;
	public DefaultHello(){}

	public DefaultHello(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String SayHello() {
		// TODO Auto-generated method stub
		return sayHello(name,city);
	}

	@Override
	public String sayHello(String name, String city) {
		String mystr[]={
			"hey how are you %s",
			"good morning %s"
		};
		
		int randomNumber=(int) Math.random();
		return String.format(mystr[randomNumber], name,city);
	}
	
	public void ginit(){
		System.out.println("global init for employee goes here");
	}
	public void gdestroy(){
		System.out.println("global destroy for employee goes here");
	}

}
