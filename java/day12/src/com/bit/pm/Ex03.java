package com.bit.pm;

class Lec03{
	int sum=100;
	
	void func01(){
		
		System.out.println("Lec03-func01 run");
	}
}
//�θ�Ŭ����,����Ŭ����,superŬ����

//�ڽ�Ŭ����,����Ŭ����,����Ŭ����
public class Ex03 extends Lec03{
	int sum=200;
	//�������̵��� ����� �޼��� final �ƴ� non-static �޼���
	void func01(){
		System.out.println(++super.sum);
		System.out.println("Ex03-func01 run");
		System.out.println(super.sum);
		System.out.println(this.sum);
	}
	public static void main(String[] args) {
		Lec03 me=new Ex03();
		me.func01();
		System.out.println(me.sum);

	}

}
