package com.example.model;

public class Employee {

	private String name ;
	private String city ;
	private String department ;
	private Integer employeeId;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "Emoloyee [name=" + name + ", city=" + city + ", department=" + department + ", employeeId=" + employeeId
				+ "]";
	}
	
	
}
