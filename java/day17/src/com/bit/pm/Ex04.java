package com.bit.pm;

class Lec04<T>{
	T obj;
	void func01(T obj){
		this.obj=obj;
	}
	T func02(){
		return obj;
	}
}

interface Interf{
	
}

public class Ex04 {

	public static void main(String[] args) {
		//���׸�
		//Lec04<String> lec=new Lec04<String>(); ����� �ۼ�
		//Lec04<String> lec2=new Lec04(); ���߿� ĳ�����Ҽ� ����
		
//		Lec04 temp=new Lec04();
		
//		Lec04<String> temp=new Lec04<String>();
//		Lec04<Integer> temp2=new Lec04<Integer>();
//		temp.func01("test");
		Lec04<? super Object> lec=new Lec04();//object�� ���� �ִ� �͵鸸 ���ڷ� ����
		lec.func01(new Lec04());
//		Object obj=lec.func02();
//		System.out.println();
//		lec=temp2;
		
//		lec2.func01(111111);
//		
//		Integer obj=lec2.func02();
//		System.out.println(obj);
	}
}
