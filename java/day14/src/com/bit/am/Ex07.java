package com.bit.am;

import java.util.Scanner;

/*
 * -------------------------------------------------
 * MyBBS�Խ��� (ver0.0.1)
 * -------------------------------------------------
 * 1.��� 2.�۾��� 3.�ۻ���>2
 * ����>test1
 * ����>test
 * 
 * 1.��� 2.�۾��� 3.�ۻ���>1
 * ------------------
 * ���� | ����
 * ------------------
 * test1|������
 * ------------------
 * 
 * 1.��� 2.�۾��� 3.�ۻ���>2
 * ����>test2
 * ����>test
 * 
 * 1.��� 2.�۾��� 3.�ۻ���>1
 * ------------------
 * ���� | ����
 * ------------------
 * test1|������
 * test2|asdf
 * ------------------
 * 
 * 
 * 
 */
class Doc{
	String title="-";
	String body="-";
	
//	public Doc(){
//		doc=new String[0];
//	}
}



public class Ex07 {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean result=true;
		String head="-----------------------------\n"+
					"MyBBS�Խ���(ver 0.0.1)\n"+
					"-----------------------------";
		System.out.println(head);
	
		
//		while(result){
//			String menu="1.��� 2.�۾��� 3.�ۻ��� 0.����>";
//			System.out.print(menu);
//			int con=sc.nextInt();
//			switch(con){
//			case 1:
//				
//				break;
//			case 2:
//				input();
//				break;
//			case 3:
//				del();
//				break;
//			case 0:
//				System.out.println("�����մϴ�.");
//				result=false;
//				break;
//			}//switch end
//		}//while end
	}//main end
	
	public static void list(){
		
		
		
	}
//
//	public static void input(){
//		Doc doc=new Doc();
//		System.out.print("����>");
//		doc[0].title=sc.nextLine();
//		sc.nextLine();
//		System.out.print("����>");
//		doc[0].body=sc.nextLine();
//		
//		
//		Doc[] temp=null;
//		temp=new Doc[doc.length+1];
//		for(int i=0;i<doc.length;i++){
//			temp[i]=doc[i];
//			
//		}
//		arr=temp;
//		arr[arr.length-1]=su;
//	}
//	
//	
	
	
	public static void del() {
		
	}
	
	
}//class end

