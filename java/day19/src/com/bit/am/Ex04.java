package com.bit.am;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("main start");
		Runnable runner=new Runnable() {
			
			public void run() {
				System.out.println("����");
				System.out.println("����");				
			}
		};
		Thread thr=new Thread(runner);
		thr.start();
		Thread thr1=new Thread(runner);
		thr1.start();
		
		System.out.println("main end");
	}
}
