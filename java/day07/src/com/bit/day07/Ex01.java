package com.bit.day07;
/*
 * �ż���\
 * �̸�:���ĺ� �ҹ��ڷ� ���� �ߺ�X
 * �����ε�: �ߺ����
 * 			������ ����,������ �ڷ���,������ ����
 */

public class Ex01 {

	public static void main(String[] args) {
		Ex01 me=new Ex01();
		System.out.println("test");
		func01();
		func01(100);
		me.func01(12,100);
		func01("����",100);
		func01(100,"asd");
	}

	public static void func01(){
		System.out.println("func01");
	}

	public static void func01(int a){
		System.out.println("func01-a:"+a);
	}
	
	public void func01(int a,int b){
		System.out.println("func01-a-b "+a+"\t"+b);
	}
	
	public static void func01(String a,int b){
		System.out.println("func01-a-b "+a+"\t"+b);
	}
	
	public static void func01(int a,String b){
		System.out.println("func01-a-b "+a+"\t"+b);
	}
}

