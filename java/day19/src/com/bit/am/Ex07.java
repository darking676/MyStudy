package com.bit.am;

import java.util.Date;

public class Ex07 extends Thread{
		// ������ ����
	 
	public static void main(String[] args) {
		Ex07 me=new Ex07();
//		me.run();
//		me.time();
		for (int i = 0; i < 10; i++) {
			Date d= new Date();
			int year=d.getYear()+1900;
			int month=d.getMonth()+1;
			int day=d.getDate();
			int h=d.getHours();
			int m=d.getMinutes();
			int s=d.getSeconds();
			System.out.println(year+"��"+month+"��"+day+"��"+h+"��"+m+"��"+s+"��");
			try {
				Thread.sleep(1000);//sleep(1000) ���� 1/1000 ��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		
	}
	
	public void time(){
		for (int i = 0; i < 10; i++) {
			Date d= new Date();
			int year=d.getYear()+1900;
			int month=d.getMonth()+1;
			int day=d.getDate();
			int h=d.getHours();
			int m=d.getMinutes();
			int s=d.getSeconds();
			System.out.println(year+"��"+month+"��"+day+"��"+h+"��"+m+"��"+s+"��");
			try {
				Thread.sleep(1000);//���� 1/1000 ��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public void run(){
		int dan=9;
		for (int i = 1; i < 10; i++) {
			System.out.println(dan+"X"+i+"="+(dan*i));
			try {
				sleep(1000);				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
