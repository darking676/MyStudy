package com.bit.pm;

public class Ex05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5};
		
		try{//����ó��
			for(int i=0;i<=arr.length;i++){
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("���� ��Ȳ");
		}
		
	}

}
