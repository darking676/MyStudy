package com.bit.pm;

class Lec22{
	
	void func01(){
		System.out.println("Lec22-func01 run");
	}
}

public class Ex02 extends Lec22{
	
	void func01(){
		System.out.println("Ex02-func01 run");
	}

	void func02(){
		System.out.println("Ex02-func02 run");
	}
	
	static void func03(Object obj){
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Lec22 me= new Ex02();
		me.func01();
//		me.func02(); ���� ��ü�� ����� ������ ������ ���������� Ÿ�Կ� ���⶧���� �Ұ���
		Ex02 me2=(Ex02)me;//Ex02 Ÿ������ ����ȯ�Ͽ� ��밡��
		me2.func02();

		Object obj=new Ex02();
		((Ex02)obj).func01();
		((Ex02)obj).func02();
		
		func03("���޵Ǵ� ���ڿ�");
//		func03(1234);������ ������ ���� �ȵɼ��� �ִ�.
		func03(new Integer(1234));
		func03(obj);
//		func03(3.14);
//		func03(true);
		int code=me.hashCode();
		String st=Integer.toHexString(code);
		System.out.println(st);
		System.out.println(me);
		System.out.println(me.toString());
	}

}
