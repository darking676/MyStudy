package com.bit.am;

class Lec10 extends Thread{
	public Lec10(String name){
		super(name);
	}
	
	public void run(){
		String name=getName();
		for (int i = 0; i < 100; i++) {
			System.out.println(name+"�� i="+i);
			System.out.println("�̰� �켱����="+getPriority());
		}
		System.out.println(name+" end");
	}
}

public class Ex10 {

	
	public static void main(String[] args) {
		//setPriority(1); �켱���� 0~10 �⺻5 Ȯ��
		Lec10 lec1=new Lec10("ù��°");
		Lec10 lec2=new Lec10("�ι�°");
		Lec10 lec3=new Lec10("����°");
		lec1.setPriority(Thread.MAX_PRIORITY);
		lec2.setPriority(Thread.MIN_PRIORITY);
		lec3.setPriority(Thread.NORM_PRIORITY);
		lec1.start();
		lec2.start();
		lec3.start();
		
	}

}
