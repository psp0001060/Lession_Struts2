package com.chinasofti.action.dataconvert;

import java.util.Date;

public class Person {
	private String name;
	private Date birthday;
	private double salary;
	private String[] fav;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String[] getFav() {
		return fav;
	}
	public void setFav(String[] fav) {
		this.fav = fav;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
