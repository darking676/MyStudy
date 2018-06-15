package com.bit.pm;

public class Ex02 extends Thread{
	public void run() {
		while(true){
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("running");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		Ex02 me=new Ex02();
		me.setDaemon(true);// main�� ���ӵ� ������� ����. main�� ������ ���ӵ� End
		me.start();
		
		Thread.sleep(3000);
		System.out.println("main end");
	}

}
