package com.bit.day07;

public class Ex03 {
		
	public static int a=1234; //Ŭ���� ����
	
	public int b=1234;//����ʵ�
	
	
	public static void main(String[] args) {
		
		System.out.println("static"+Ex03.a);
		Ex03 me=new Ex03();
		System.out.println("non-static"+me.b);//Ŭ������ ���� only ��������
		me.a--;
		me.b--;
		System.out.println("static"+Ex03.a);
		System.out.println("non-static"+me.b);
		System.out.println("��ü����");
		me=new Ex03();
		me.a--;
		me.b--;
		System.out.println("static"+Ex03.a);
		System.out.println("non-static"+me.b);
	}

}
