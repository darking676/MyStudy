package com.bit.spring04.springJava2;

import java.util.List;

public class Module03 {
	
	private List<String> alist;

	public void setAlist(List<String> alist) {
		this.alist = alist;
	}
	
	public void func1(){
		for(String msg : alist){
			System.out.println(msg);
		}
	}

	
}
