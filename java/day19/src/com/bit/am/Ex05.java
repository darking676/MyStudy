package com.bit.am;
//�����带 ��ӹ����� ��ü�� 3������ �Ѵ�.
public class Ex05 extends Thread{
	public Ex05(String name){
		setName(name);
	}
	public static void main(String[] args) {
		Thread thr=Thread.currentThread();
		System.out.println(thr.getName()+" start");
		Ex05 me1=new Ex05("ù��°");
		Ex05 me2=new Ex05("�ι�°");
		Ex05 me3=new Ex05("����°");
		me1.start();
		me2.start();
		me3.start();
		System.out.println(thr.getName()+" end");
	}

	public void run(){
		Thread thr=currentThread();
		String name=thr.getName();
		System.out.println(name+"������ ����");
		System.out.println(name+"������ ����");
	}
}
