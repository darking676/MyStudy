package com.bit.pm;
/*
 * �迭 -> ��ü
 * ������ - ��������
 * arr1.length ����ʵ带 ���
 * 
 * 
 */
public class Ex01 {

	
	public static void main(String[] args) {
		
		int[] arr1=new int[5];
		
		arr1[0]=100;
		arr1[1]=200;
		arr1[2]=300;
		arr1[3]=400;
		arr1[4]=500;
		System.out.println("�迭�� ����- ���� ����");
		System.out.print("arr1:");
		for(int i=0;i<arr1.length;i++){//length  ��ȣ�� �����Ƿ� �޼��尡 �ƴ� �ʵ�
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		int[] arr2=arr1;
		System.out.print("arr2:");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		
		arr1[2]=2333;
		System.out.print("arr1:");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.print("\narr2:");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("�迭�� ����- ���� ����");
		
		int[] arr3;//��ü �迭�� �����ϰ�
		arr3=new int[arr1.length];//����ũ��� ����
		
		for(int i=0;i<arr1.length;i++){
			arr3[i]=arr1[i];
		}
		arr3[1]=2;
		System.out.print("arr1:");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.print("\narr3:");
		for(int i=0;i<arr3.length;i++){
			System.out.print(arr3[i]+" ");
		}
		System.out.println("\n--------------------------");
		System.out.println("arr1==arr2 "+(arr1==arr2));
		System.out.println("arr1==arr3 "+(arr1==arr3));

	}

}
