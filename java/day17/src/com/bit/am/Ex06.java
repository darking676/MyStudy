package com.bit.am;

interface Interf{
	void func();
}

public class Ex06 {
	static int su1=111;
	int su2=222;
	Interf me4=new Interf(){
		public void func(){}
	};
	
	// static (����)Ŭ����
	static class Lec02{
		static void func02_1(){
			System.out.println(su1);
		}
		void func02_2(){
			System.out.println(su1);
		}
	}
//	static Interf lec12=new Interf(){
//		
//		public void func(){
//			
//		}
//	};
	// ���Ŭ����
	class Lec01{
		void func01_2(){
			System.out.println(su1);
		}
		
		Lec02 me1=new Lec02();
		Lec02 me2=new Lec02();
		final int su=100;
	}
	
	public Interf func01(final int su){
		//����Ŭ������ �ۿ� �ִ� ��������
		// ~1.7 final
		// 1.8~
		Lec02 me1=new Lec02();
		Lec02 me2=new Lec02();
		
		//����Ŭ����
		class Lec03 implements Interf{
			public void func(){}
		}
//		Lec03 me3=new Lec03();
//		Interf me3=new Interf(){
//			public void func(){}
//		}
		return new Interf(){
			public void func(){};
		};
//		return me3;
	}
	
	public static void main(String[] args) {
		

	}

}
