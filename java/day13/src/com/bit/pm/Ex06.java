package com.bit.pm;

class Car{
	
	
	public void carRun(){
		System.out.println("�޸���");
	}
	
	
	public void stop(){
		System.out.println("�����");
	}
}

class Tico extends Car{
	public void carRun(){
		System.out.println("õõ�� �޸���");
	}
}

class Sonata extends Car{
	public void carRun(){
		System.out.println("������ �޸���");
	}
}

public class Ex06 {

	public static void main(String[] args) {
		Car myCar= new Sonata();
		myCar.carRun();
		myCar.stop();
		

	}
	

}
