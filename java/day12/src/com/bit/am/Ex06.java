package com.bit.am;


class Car{
	// 
	void go(){
		System.out.println("�޸���");
	}
	
	void stop(){
		System.out.println("�����");
	}
}


class Tico extends Car{
	// �θ� - ��ü�� ������ ����
	void go(){
		super.go();
		System.out.println("�ִ�100km��");
	}
}

class TicoTurbo extends Tico {
	// �ڽ� - �θ𿡼� ���� ��üȭ
	void go(){
		super.go();
		System.out.println("�޸��� ���� ���� �� ������ ������");
	}
}

class Sonata extends Car{
	void go(){
		super.go();
		System.out.println("�ִ�150km");
	}
}

public class Ex06 {

	//TicoTurbo �� Tico �� ��ӹ޾� �������̵�� �ӵ� ����
	public static void main(String[] args) {
		Car myCar=new Sonata();//new Tico TicoTurbo �̵��� ���� �ӵ��� ��ȭ�� �ټ� �ִ�.
		myCar.go();
		myCar.stop();
		
	}

}
