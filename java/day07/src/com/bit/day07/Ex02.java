package com.bit.day07;

public class Ex02 {
/*
 * Ŭ������ �������
 * 1.�޼���(static, non-static)
 * 2.����(static[Ŭ��������],non-static[����ʵ�])
 * 		�⺻���� ����, �ʱ�ȭ�� ���ص� ����Ʈ���� �ִ�.
 *		����� �ʱ�ȭ�� ���ÿ� �ʼ�
 */
	public static int sum=0;//Ŭ�������� 
	
	
	public static void main(String[] args) {
		int temp;

		Ex02 me=new Ex02();
		temp=1000;
		sum=me.add(temp);
		System.out.println("sum: "+sum);
		temp=200;
		sum=me.del(temp);
		System.out.println("sum: "+sum);
		temp=300;
		sum=me.del(temp);
		System.out.println("sum: "+sum);
	}

	public int add(int a){
		return sum+a;
	}
	
	public int del(int a){
		return sum-a;
	}
	
}
