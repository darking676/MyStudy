package com.bit.am;

interface Interf01{
	void func();
}

class Lec04 {
	
	void func01(){
		
		Interf01 inn =new Interf01(){

			public void func(){
				System.out.println("����Ŭ������ func");
			}
		};
		inn.func();
		
	}
}
//class Lec04 {
//	//�͸�Ŭ����    (�߰��� Ŭ���� �̸��� ����)
//	Interf01 inn=new /*class XXXX*/Interf01(){
//
//		public void func(){
//			System.out.println("����Ŭ������ func");
//		}
//	};
//	void func01(){	
//		inn.func();
//	}
//}

abstract class Lec22{
	public void func01(){
		System.out.println("func01()");
	}
	public abstract void func02();
}

//class Ex22 extends Ex02(){} ���⿡ �̸��� ������ �͸�Ŭ����
public class Ex04 {

	public static void main(String[] args) {
		
		Lec04 lec=new Lec04();
		lec.func01();
		// ������ �͸�Ŭ���� ����� ����
		Ex04 me=new Ex04(){
			void func04(){}
		};
		
		Ex04 www=new Ex04(){};
		
		Lec22 ab=new Lec22(){
			public void func02(){
			}
		};
		
		Interf01 inn =new Interf01(){
			public void func(){
			}
		};

	}
}
