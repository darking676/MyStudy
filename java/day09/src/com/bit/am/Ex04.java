package com.bit.am;
/*
 * "Java Web Spring"
 * Q1. �빮�ڰ� ����� ���Ͻÿ�
 * 	>>3��
 * 
 * Q2. ��� �빮�ڷ� ����Ͻÿ�
 *  >> "JAVA WEB SPRING"
 *  
 *  
 * Q3. ����� �߶� spring[] �� ��� ����Ͻÿ�
 * >>str[0]="Java"
 * >>str[1]="Web"
 * >>str[2]="Spring"
 * 
 */
public class Ex04 {
	public static void main(String[] args){
		Jws me=new Jws();
		me.count();
		me.cha();
		me.spl();
		
	}
}

class Jws{
	//Q1. �빮�ڰ� ����� ���Ͻÿ�
	void count(){
		System.out.println("Q1. �빮�ڰ� ����� ���Ͻÿ�");
		String str = "Java Web Spring";
		char[] ch1 = null;	
		ch1 = str.toCharArray();
		int b=0;
		for(int i=0;i<ch1.length;i++){
			System.out.print(ch1[i]);
			if((90>(int)ch1[i])&&65<(int)ch1[i]){
				
				b++;
			}
		}
		System.out.println();
		System.out.println(b);
		
		System.out.println(str.charAt(0));
	
	}
	//Q2. ��� �빮�ڷ� ����Ͻÿ�
	void cha(){
		System.out.println("Q2. ��� �빮�ڷ� ����Ͻÿ�");
		String a="Java Web Spring";
		System.out.println("Java Web Spring >>\n"+ a.toUpperCase());
	}
	//Q3. ����� �߶� spring[] �� ��� ����Ͻÿ�
	void spl(){
		System.out.println("Q3. ����� �߶� spring[] �� ��� ����Ͻÿ�");
		String str1 = "Java Web Spring";
		String[] str2 = null;
		str2 = str1.split(" ");
		System.out.println(str2[0]);
		System.out.println(str2[1]);
		System.out.println(str2[2]);
	
	}
	
}