package com.bit.pm;

import java.util.Scanner;

public class Ex01 {

	
	public static void main(String[] args) {
		// ����ó��
		Scanner sc= new Scanner(System.in);
		int result=0;
		
		try{
			try{
			int su=5/0;
			}catch(java.lang.ArithmeticException ex){
				System.out.println("0���� ������ ����");
			}
		} catch(java.util.InputMismatchException ex){
			System.out.println("�����Է��� �ƴ�");
		}
	
		
		
	}

}
