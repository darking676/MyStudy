package com.bit.am;
/*
 * INT long double(�����ڷ���,�����ڷ���)
 * 
 * ����Ŭ����
 * ù���ڸ� �빮�ڷ� �ٲٸ� ����Ŭ����
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		// INT �� ��ü�� Integer
		int a;
		a=100;
		int b;
		b=200;
		int c=a+b;
		System.out.println(c);
		System.out.println("-----------------------");
		Integer x=10; //���䷦��
		Integer y=20;
		Integer z=x+y;
		System.out.println(z);
		System.out.println("-----------------------");
		Integer a1=new Integer(1000);
		Integer a2=new Integer(2000);
		Integer a3=new Integer(1000+2000);
		System.out.println(a3);
		System.out.println("-----------------------");
	}

}