package com.bit.day08.am;

public class Ex09 {
	//�ʵ忡 �ִ� ���� ��������
	//static : Ŭ��������, static ����
	//non-static : ����ʵ�, non-static ����
	
	public Ex09(){
		
	}
	String msg;
	int sum=100;
	static int sum2=1000;
	public static void main(String[] args) {
		//������ ������ ��������
		//Ex09 me=null;//���� ���� �ʱⰪ�� null
		Ex09 me=new Ex09(); //�ʱ�ȭ

		System.out.println(me);
		System.out.println(me.msg);
		
		System.out.println(me.sum);
		me.func01(10);
		System.out.println(me.sum);
		func02();
		System.out.println(me.sum2);
		
		
	}

	//�޼��� - �Լ�
	void func01(int sum1){
		sum=sum1;
//		return;
	}
	
	static void func02(){
		sum2=1111;
	}
	
}
//this �� static ���� ���Ұ�.
//static �� �տ� Ŭ������ ���.
