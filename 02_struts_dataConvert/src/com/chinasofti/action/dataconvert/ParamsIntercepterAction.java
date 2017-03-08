package com.chinasofti.action.dataconvert;

import java.text.SimpleDateFormat;

public class ParamsIntercepterAction {
	private String phoneNumber;
	private Person person;
	

	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}


	public String execute() {
		System.out.println("phoneNumber文本框的内容为：" + this.getPhoneNumber());
		
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("name文本框的内容为：" + this.getPerson().getName());
		System.out.println("salary文本框的内容为：" + this.getPerson().getSalary());
		System.out.println("sex文本框的内容为：" + this.getPerson().getSex());
		System.out.println("birthday文本框的内容为：" + df.format(this.getPerson().getBirthday()));
		System.out.println("fav选择的内容为：" + this.getPerson().getFav()[0]);
		return "success";
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
