package com.bit.am;

//������

class Lec05{
	int sum=1234;
	
	void func01(){
		System.out.println("Lec05 func01 ����");
	}
}

public class Ex05 extends Lec05 {

	void func01(){
			System.out.println("Ex05 func01 ����");
		}
	
	public static void main(String[] args) {
		Lec05 lec=new Lec05();
		System.out.println(lec.sum);
		lec.func01();
		Ex05 me=new Ex05();
		System.out.println(me.sum);
		me.func01();
		
		//������
		//���������� �θ��� Ÿ���� �޾Ƽ� �ڽ��� ��ü�� ����
		Lec05 you= new Ex05();
		System.out.println(me.sum);
		you.func01();
	}
}	