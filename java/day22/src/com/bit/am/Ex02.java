package com.bit.am;

public class Ex02 implements Runnable {
	// 1.Thread �� ��� , setName �̸�����
	// 2.Runnable �������̽� ��� , setName ���� �̸�X
	// 3.�͸�Ŭ���� ���
	public static void main(String[] args) {
		System.out.println("main THread run");
		Runnable res=new Runnable() {
			public void run() {
				
				System.out.println("new THread run");
				System.out.println("new THread end");
			}
		};
		Thread thr=new Thread(res);
		thr.start();
		Thread thr2=new Thread(res);
		thr2.start();

		System.out.println("main THread end");
	}
	public void run() {	
		
		System.out.println("new THread run");
		System.out.println("new THread end");
	}
}
