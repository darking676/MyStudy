package com.bit.am;

public class Ex07 implements Runnable{

	static int su=0;
	
//	synchronized void hap(int su){
	void hap(int su){
		synchronized(this){
			int sum=Ex07.su;
			sum+=su;
			Ex07.su=sum;
		}//syc end
	}
	public void run(){
		for (int i = 0; i < 1000; i++) {
			hap(i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Ex07 me=new Ex07();
		
		Thread thr=new Thread(me);
		Thread thr2=new Thread(me);
		
		thr.start();
		thr2.start();
		
		thr.join();
		thr2.join();
		
		System.out.println(Ex07.su);
	}

}
