package com.spring;

public class Employee {
	private int empid;
	private String empname;
	private String empsal;
	
	Employee(){}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpsal() {
		return empsal;
	}
	public void setEmpsal(String empsal) {
		this.empsal = empsal;
	}
	public Employee(int empid, String empname, String empsal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + "]";
	}
	
	public void init(){
		System.out.println("init for employee goes here");
	}
	public void destroy(){
		System.out.println("destroy for employee goes here");
	}
	
	public void ginit(){
		System.out.println("global init for employee goes here");
	}
	public void gdestroy(){
		System.out.println("global destroy for employee goes here");
	}

}
