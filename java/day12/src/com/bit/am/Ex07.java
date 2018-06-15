package com.bit.am;

import java.util.Scanner;


class Machine{
	
	void on(){
		System.out.println("�Ѵ�");
	}
	
	void off(){
		System.out.println("����");
	}
}

class Tv extends Machine{
	void on(){
		System.out.println("Tv�� �Ѵ�");
	}
	void off(){
		System.out.println("Tv�� ����");
	}
}

class Radio extends Machine{
	void on(){
		System.out.println("Radio�� �Ѵ�");
	}
	void off(){
		System.out.println("Radio�� ����");
	}
}

class Aircon extends Machine{
	void on(){
		System.out.println("Aircon�� �Ѵ�");
	}
	void off(){
		System.out.println("Aircon�� ����");
	}
}

public class Ex07{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Machine remote=null;
		System.out.println("1.TV�� ���� 2.������ ���� 3.�������� ����>");
		int input=sc.nextInt();
		if(input==1){
			remote=new Tv();
		} else if(input==2){
			remote=new Radio();
		} else if(input==3){
			remote=new Aircon();
		}
		remote.on();
		remote.off();
		
	}

}
