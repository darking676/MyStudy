package com.bit.pm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex07 {


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int su1=10;
		int su2=1;
		
//		try{
//			try{
//				su2=sc.nextInt();
//				int result=su1/su2;
//				System.out.println("result:"+result);
//			}catch(InputMismatchException ex){
//				System.out.println("���ڸ� �Է��ϼ���");
//			}
//		}catch(ArithmeticException ex){
//			System.out.println("������");
//		}
		try{
			su2=sc.nextInt();
			int result=su1/su2;
			System.out.println("result:"+result);
		}
		catch(InputMismatchException ex){
			System.out.println("���ڸ� �Է��ϼ���");
		}
		catch(ArithmeticException ex){
			System.out.println("������");
		}
	}//main end
}

		
		
		
	

	
