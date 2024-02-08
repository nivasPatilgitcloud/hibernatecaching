package com.caching.xml;

public class Employee {

	private int emp_id;
	private String name;
	private String departmentname;
	private String employeecode;
	
	public Employee(int emp_id, String name, String departmentname, String employeecode) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.departmentname = departmentname;
		this.employeecode = employeecode;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getEmployeecode() {
		return employeecode;
	}
	public void setEmployeecode(String employeecode) {
		this.employeecode = employeecode;
	}
}
