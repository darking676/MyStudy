package com.bit.am;

abstract class Lec08{
	//�߻�Ŭ����
	// - �߻�޼��带 0�� �̻�~
	// - ������ ��ü�� �����Ұ� **************
	// - ��ӹ޴� ������ �߻�޼��带 �����ؼ� ���
	// �߻�޼��带 �Ȱ������� �ִ�
	// �߻�Ŭ������ ���
	// 1. ����Ŭ������ �߻�Ŭ������ �Ǿ� �߻�Ŭ������ ���
	// 2. �߻�޼��带 �������̵�(- ��ӹ޴� ������ �߻�޼��带 �����ؼ� ���)
	//  - ��ӹ޴� ������ ����� �����ؼ� ����� �� �ִ�
	int su=1234;
	public Lec08(){
		System.out.println("Lec08 ������");
	}
	
	public void func01(){
		System.out.println("Lec08 func01 run");
	}
	// �߻�޼���
	public abstract void func02();
}

public class Ex08 extends Lec08{

	/*
	 * ���
	 */
	public Ex08(){
		super();
		System.out.println("Ex08 ������");
	}
	
	public static void main(String[] args) {
		Lec08 me= new Ex08();
		me.func01();
		me.func02();
	}
	
	public void func02(){
		System.out.println("Ex08 override func02");
	}
}