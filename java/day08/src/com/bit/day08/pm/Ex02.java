package com.bit.day08.pm;

public class Ex02 {

	public static void main(String[] args) {
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
		
		int[] arr1=new int[5];
		for(int i=0;i<5;i++){
			arr1[i]=i+1;
	
			
		}
		
		for(int i=0;i<5;i++){
			arr1[i]=i+1;
			System.out.println("arr["+i+"]="+arr1[i]);
			
		}
		System.out.println("-------------------------------");
		
		//int[] arr2=new int[]{1,4,10,8,7};
		int[] arr2={1,4,10,8,7};
	
		for(int i=0;i<5;i++){
			System.out.println("arr2["+i+"]="+arr2[i]);
			
		}

	}

}
