package com.bit.am;

/* ��Ű��
 * ����Ʈ - ������ ������ Ŭ������ ������ ã��
 * 			����) �ش���Ű��&&java.lang.~����
 * 
 * * �� ����� ����
 * �ִ��� �ڼ��� ����.
 */

//import java.util.Scanner;
//import java.util.Calendar;
//import java.util.Random;
import java.util.Scanner;


public class Ex01 {
	
	/*
	 * Ŭ����(��������,������,�޼���)
	 * ��������
	 * ������ - ��ü �����ÿ� ������ ���� - �ʵ� �ʱ�ȭ
	 * default - ���ڰ� ���� ������
	 * �޼���
	 * non-static(������)/static(����)
	 * static caseBycase
	 * 	
	 */
	
	public Ex01(){
//		super();
		this("");//���� �����ڸ� ȣ��
		System.out.println("Ex01");
		this.func01();
	}
	public Ex01(String st){
//		super();
		System.out.println("Ex01(asdf)");
	}
	
	public static void main(String[] args) {
		com.bit.am.Scanner sc=new com.bit.am.Scanner();
		Scanner sc2=new Scanner(System.in);
		Ex01 me=new Ex01();
		me.func01();
	}

	public void func01(){
		this.func02(); //���������� ������ ������ this�� �����Ǿ
	}
	
	public void func02(){
		
	}
	
}
