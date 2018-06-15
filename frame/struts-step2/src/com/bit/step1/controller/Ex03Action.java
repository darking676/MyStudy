package com.bit.step1.controller;

import com.opensymphony.xwork2.ActionSupport;

public class Ex03Action extends ActionSupport {
	private String id,pw;
	private int age;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String execute() throws Exception {
		return "success";
	}
	
	@Override
	public void validate() {
		System.out.println("validate run");
		
		if("".equals(id)){
			addFieldError("id", "���̵� �����");
		}else if("".equals(pw)){
			addFieldError("pw", "��й�ȣ�� �����");
		}
	}
	
}
