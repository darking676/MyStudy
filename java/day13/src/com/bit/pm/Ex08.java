package com.bit.pm;

class Lec08{}

interface Inter01{
	// ���� �߻�޼��常 ����(��, ����� ������ ����)
	// �������̽��� ���߻�� ���(���߻��ó��)
	int sum=100;
	
	public void func01();// �������̽��� �߻�޼���� public 
	void func02(int a);// �����ص� public
}

interface Inter02{
	void func03();
}
interface Inter03 extends Inter02,Inter01{
	int sum=200;
	void func03();
}
interface Inter04{
	//��ӹ޴� Ŭ������ ��üȭ
}
public class Ex08 extends Lec08 implements Inter01,Inter03,Inter04 {

	public static void main(String[] args) {
		
		
	}

	public void func01(){
		
		System.out.println();
	}
	
	public void func02(int a){
		
	}
	
	public void func03(){
		
	}
}
