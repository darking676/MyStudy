package com.bit.day08.am;

public class Ex02 {
	/*
	 * ������
	 * return ���� ����.(void ����)
	 * �̸� ����(class �̸�)
	 * �����ڴ� �⺻������ ����
	 * �������� ��ǥ����� - �ʵ��� �ʱ�ȭ
	 * �����ε� ��� - �޼���, ������
	 */
	int sum;
	
	public Ex02(int a){
		sum=a;
		System.out.println("������ �ߵ�"+sum);
	}
	
	public Ex02(String msg,int a){
		sum=a;
		System.out.println("������ �ߵ�"+sum+msg);
	}
	
	public static void main(String[] args) {
		Ex02 me=new Ex02("����",10);
		System.out.println(me.sum);
		me=new Ex02(12);
		System.out.println(me.sum);
	}

}
