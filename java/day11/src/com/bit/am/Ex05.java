package com.bit.am;
// ���� ��Ӹ� �����ؼ� � ��ü�� ����ؼ� ��������� �߿�
// ���� ������ڸ� ��ӿ� ����� ����Ͽ� �Ѵ� ���� ������ ����
class Lec05{
	public void func01(){
		System.out.println("�������");
	}
}

class Lec55 extends Lec05{
	public void func01(){
		super.func01();
		System.out.println("�������");
	}	
}

public class Ex05 extends Lec05{

	public Ex05(){
		System.out.println("��ü����");
	}
	
	public static void main(String[] args) {

//		Integer a1=new Integer("10");
//		Double b1=new Double("3.14");
//		Byte c1=new Byte("11");
//		
//	
//		System.out.println(a1.toString());
//		System.out.println(a1.equals(b1));
//		System.out.println(b1.toString());
//		System.out.println(b1);
//		System.out.println(c1.toString());
//		System.out.println(c1);
		
		Lec55 me=new Lec55();
		me.func01();
		
		
	}

	
}
