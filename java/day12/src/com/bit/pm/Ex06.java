package com.bit.pm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int su=0;
		String msg=null;
		for(int i=0;i<5;i++){
			try{
				System.out.print("����>");				
				su=sc.nextInt();
				System.out.print("���ڿ�>");				
				msg=sc.nextLine();
				System.out.println(msg+"="+su);
				
			}catch(InputMismatchException ex){
				System.out.println("0���� ������ �����ϴ�.");
				sc=new Scanner(System.in);
			}//���� end
		}//for end
		
	}//main end

}
