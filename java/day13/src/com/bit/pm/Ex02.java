package com.bit.pm;

import java.util.Scanner;

public class Ex02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try{
			try{
				int su=5/sc.nextInt();
			}catch(java.util.InputMismatchException ex){
				System.out.println("�����Է��� �ƴ�");
			}
		} catch(Exception ex){
			System.out.println("�����߻�");
		}
	
	}

}
