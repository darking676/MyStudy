package com.bit.am;

interface Lec55{
	//�߻�޼��常 �޴� �������̽�, ���߻�� �ذ�
	//1.���߻��
	//2.���ϼ� index
	//3.Ŭ������ ����
	//4.Ŭ������ ������ �ο�
	public void func01();
	abstract void func02();//public ����
	public abstract void func03();
}
interface Lec5{}
interface Lec555 extends Lec5,Lec55{};
//�߻�Ŭ������ ����� ���ؼ�
//�߻�޼��尡 ������ �߻�Ŭ����
//abstract class Lec05{
//	public void func01(){
//		
//	}
//	public abstract void func02();
//		
//}

public class Ex05 implements Lec55,Lec5{

	
	public static void main(String[] args) {
		Object obj = new Ex05();

	}

	public void func02() {
		// TODO Auto-generated method stub
		
	}

	public void func01() {
		// TODO Auto-generated method stub
		
	}

	public void func03() {
		// TODO Auto-generated method stub
		
	}

}
