package com.bit.am;

class Outter03 {
	
	int su2=20;
	
	public Outter03(){
		System.out.println("Outter0 ������");
	}
	
	public static void func01(){
		int sum=0;
		class Inner01{
			final static int su3=30;
			int su4=40;
			public Inner01(){
				System.out.println("Inner01 ������");
			}
			
			public void func03(){
				System.out.println("Inner01 func03");
			}
		}//Inner01 end
		
		Inner01 inn=new Inner01();
		inn.func03();
		
	}//func01 end
	
	public Interf func02(){
		//����Ŭ����
		class Inner11 implements Interf{
			final static int su5=30;
			int su6=40;
			
			public Inner11(){
				System.out.println("Inner11 ������");
			}
			
			public void func04(){
				System.out.println("Inner11 func04");
			}
		}//Inner11 end
		
		Inner11 inn=new Inner11();
//		inn.func04();
		return inn;
		
	}//func02 end
	
}//Outter end

interface Interf{
	void func04();
}

public class Ex03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter03.func01();
		Outter03 out=new Outter03();
		out.func02();
		Interf obj=out.func02();
		obj.func04();
		
		
	}

}
