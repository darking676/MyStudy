
public class day08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 20180219
��ü
�޼���
����ʵ�
������

package com.bit.day08;


class Bike{
	//��ü�� ��� - ��ü Ư��
	public int nowSpeed;	
	public String color="���";
	public int maxSpeed=100;
	
	//��ü�� ��� - ��ü����
	public int speedUp(int speed){
		if(nowSpeed+speed<=maxSpeed){
		nowSpeed+=speed;
		}
		System.out.println(color+"�� ����ũ�� ����ӵ��� "+nowSpeed+"km �Դϴ�");
		return nowSpeed;
	}
	
	public int speedDown(int speed){
		if(nowSpeed-speed>=0){
		nowSpeed-=speed;
		}
		System.out.println(color+"�� ����ũ�� ����ӵ��� "+nowSpeed+"km �Դϴ�");
		return nowSpeed;
	}
}


public class Ex01 {
	
	public static void main(String[] args) {

		Bike by=new Bike();
		by.speedUp(10);
		by.speedUp(20);
		by.speedUp(30);
		by.speedDown(40);
		
		System.out.println("�� bike");
		by=new Bike();
		by.color="�Ķ�";
		by.speedUp(10);
		by.speedUp(20);
		by.speedUp(30);
		
		
	
	}

}package com.bit.day08;

public class Ex02 {
	/*
	 * ������
	 * return ���� ����.(void ����)
	 * �̸� ����(class �̸�)
	 * �����ڴ� �⺻������ ����
	 * �������� ��ǥ����� - �ʵ��� �ʱ�ȭ
	 * �����ε� ��� - �޼���, ������
	 *
	int sum;
	
	public Ex02(int a){
		sum=a;
		System.out.println("������ �ߵ�"+sum);
	}
	
	public Ex02(String msg,int a){
		sum=a;
		System.out.println("������ �ߵ�"+sum+msg);
	}
	
	public static void main(String[] args) {
		Ex02 me=new Ex02("����",10);
		me=new Ex02(10);
	}

}



package com.bit.day08;

class Car{
	
	int speed;
	int max;
	String color;
	
	public Car(int a){
		speed=0;
		max=a;
		color="������";
	}
	
	public Car(int a,String b){
		speed=0;
		max=a;
		color=b;
	}
	
	public void speedUp(int a){
		if(speed+a<=max){
			speed+=a;	
		} else {speed=max;}
		
	}
	
	public void speedDown(int a){
		speed-=a;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Car car1=new Car(100);
		car1.speedUp(10);
		System.out.println(car1.color+"�� ���� �ӵ��� "+car1.speed);
		car1.speedUp(20);
		System.out.println(car1.color+"�� ���� �ӵ��� "+car1.speed);
		car1.speedUp(30);
		System.out.println(car1.color+"�� ���� �ӵ��� "+car1.speed);
		car1.speedUp(50);
		System.out.println(car1.color+"�� ���� �ӵ��� "+car1.speed);
		
		car1=new Car(150,"������");
		car1.speedUp(10);
		System.out.println(car1.color+"�� ���� �ӵ��� "+car1.speed);
		car1.speedUp(20);
		System.out.println(car1.color+"�� ���� �ӵ��� "+car1.speed);
		car1.speedUp(30);
		System.out.println(car1.color+"�� ���� �ӵ��� "+car1.speed);
		car1.speedUp(120);
		System.out.println(car1.color+"�� ���� �ӵ��� "+car1.speed);
		

	}

}



******������,�ʵ�,�޼���**********


����������


package com.bit.day08;

public class Ex09 {
	//�ʵ忡 �ִ� ���� ��������
	//static : Ŭ��������, static ����
	//non-static : ����ʵ�, non-static ����
	
	public Ex09(){
		
	}
	String msg;
	int sum=100;
	static int sum2=1000;
	public static void main(String[] args) {
		//������ ������ ��������
		//Ex09 me=null;//���� ���� �ʱⰪ�� null
		Ex09 me=new Ex09(); //�ʱ�ȭ

		System.out.println(me);
		System.out.println(me.msg);
		
		System.out.println(me.sum);
		me.func01(10);
		System.out.println(me.sum);
		func02();
		System.out.println(me.sum2);
		
		
	}

	//�޼��� - �Լ�
	void func01(int sum1){
		sum=sum1;
//		return;
	}
	
	static void func02(){
		sum2=1111;
	}
	
}
//this �� static ���� ���Ұ�.
//static �� �տ� Ŭ������ ���.


------------------------------------------------------
�迭



/*
		 * �迭
		 * �ڷ���[] ������ = new �ڷ���[����];
		 * �ڷ���[] ������; �迭�� ����
		 * ������=new �ڷ���[����]; �ʱ�ȭ
		 * ������[�ε���]
		 * 0���� ����, ���ӵ� ����
		 * �ʱ�ȭ
		 * ������[�ε���]=�ʱⰪ;
		 */




		

	}

}
