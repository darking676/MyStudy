package com.bit.pm;


/*
 * ����ó��
 * ȸ��
 * 1.����
 * 	 1)������ �ڵ����� ǥ��
 * 	 2)����
 * 2.����� ����
 * 
 */


public class Ex04 {

	public static void main(String[] args) {
		java.lang.String msg=null;
		java.lang.Math.random();//java.lang �������� 
		int a=2;
		int b=0;
		int c=0;
		
		try{//����ó��
			System.out.println("���� �߻���");
			c=a/b;
			System.out.println("���� �߻���");
		}catch(ArithmeticException ex){
			System.out.println("���� ��Ȳ");
		}
		System.out.println("main end");

	}

}
