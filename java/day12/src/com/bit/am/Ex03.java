package com.bit.am;

class Lec03{
	// final class ����� ���Ұ�
	final int sum=1111;//����� ����
	
	final void func01(){
		System.out.println("func01 ����");
	}
	
}

final class A{
	int a=123;
}

//�޼��忡 final �� ����ϰ� �Ǹ� �޼��带 �����Ұ�
//�������̵�(�޼��� ����)�� �Ұ�
public class Ex03 extends Lec03 {

	public static void main(String[] args) {
//		Lec03 lec=new Lec03();
//		System.out.println(lec.sum);
//		lec.func01();
		Ex03 me=new Ex03();
		me.func01();
	
		A a=new A();
		System.out.println(a.a);
		a.a=0;
		System.out.println(a.a);
	}

	
//	void func01(){
//		
//	}
}
