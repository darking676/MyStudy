package com.bit.pm;

import java.util.Scanner;

/*
 * ===================================
 * �л������������α׷�(ver 0.1.1)
 * ===================================
 * �ѿ�>5
 * 1.��ü���� 2.�Է� 3.�󼼺���>1
 * ---------------------------------------
 * �й� | ���� | ���� | ���� | ����
 * ---------------------------------------
 * 1	 ȫ�浿  100	100	   100
 * 2	 ȫ�浿  100	100	   100
 * 3	 ȫ�浿  100	100	   100
 * 4	 ȫ�浿  100	100	   100
 * 5	 ȫ�浿  100	100	   100
 * 6	 ȫ�浿  100	100	   100
 * 
 * �Է½�>����ó��
 * �����Է½� > �����Է¿����ذ�
 * �̸� > 3��
 * �� ���� > �ּ� 0��~100��
 * 
 */

class Student{
	int num=0;
	String name="-";
	int kor,eng,math;
}
public class Ex09 {
static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		Ex09 me=new Ex09();
		int con=0;
		int stdN=0;
		int su=0;
		boolean result=true;
		System.out.println("-------------------------------");
		System.out.println("�л������������α׷�(ver 0.1.0)");
		System.out.println("-------------------------------");
		System.out.print("�ѿ�>");
		su=sc.nextInt();
		Student[] arr=new Student[su];
		for(int i=0;i<su;i++){
			arr[i]=new Student();
		}
		while(result){
			System.out.print("1.��ü���� 2.�Է� 3.�󼼺��� 4.�����ϱ� 5.�����ϱ� 0.����>");
			con=me.excepMenu();
			System.out.println(con);
			if(con>=0&&con<=5){
				switch(con){
					case 1:
						me.show(arr);
						
						break;
					case 2:
						me.insert(arr,stdN);
						stdN++;
						break;
					case 3:
						me.showDetail(arr);
						break;
					case 4:
						me.change(arr);
						break;
					case 5:
						me.del(arr);
						break;
					case 0:
						System.out.println("�����մϴ�.");
						result=false;
						break;
				}//switch end
			}else{
				System.out.println("�ٽ��Է����ּ���");
			}//if end
		}//while end
	}	
	
	public void show(Student[] arr){//1.��ü����
		System.out.println("-------------------------------");
		System.out.println("�й� |  �̸�  |  ����  | ���� | ����");
		System.out.println("-------------------------------");
		for(int i=0;i<arr.length;i++){
			System.out.println(" "+arr[i].num+"\t"+arr[i].name+"\t"+arr[i].kor+"\t"+arr[i].eng+"\t"+arr[i].math);
		}
		
	}
	
	public void insert(Student[] arr,int a){//2.�Է�
		int kor = 0;
		int eng = 0;
		int math = 0;
		int result=0;
		System.out.println("-------------------------------");
		System.out.print("�й�>");
		arr[a].num=(a+1);
		System.out.println(arr[a].num);
		
		while(true){
			System.out.print("�̸�>");
			sc.nextLine();
			arr[a].name=sc.nextLine();
			if(arr[a].name.length()!=3){
				System.out.println("3���ڰ� �ƴմϴ�.");
			} else {result++;}
			System.out.print("����>");
			kor=excepInput();
			if(!(kor>=0 && kor<=100)){
				System.out.println("0~100���̷� �Է����ּ���");
			} else {result++;}
			sc.nextLine();
			System.out.print("����>");
			eng=excepInput();
			if(!(eng>=0 && eng<=100)){
				System.out.println("0~100���̷� �Է����ּ���");
			} else {result++;}
			sc.nextLine();
			System.out.print("����>");
			math=excepInput();
			if(!(math>=0 && math<=100)){
				System.out.println("0~100���̷� �Է����ּ���");
			} else {result++;}
			
			if(result==4){break;} else{System.out.println("�ٽ��Է����ּ���");}
		}//while end
		
		arr[a].kor=kor;
		arr[a].eng=eng;
		arr[a].math=math;
	}
	
	public void showDetail(Student[] arr){//3.�󼼺���
		System.out.print("�й�>");
		int con=0;
		con=sc.nextInt();
		con--;
		System.out.println("-------------------------------");
		System.out.println("�й� | ����  | ���� | ����");
		System.out.println("-------------------------------");
		System.out.println(" "+arr[con].num+"\t"+arr[con].name+"\t"+arr[con].kor+"\t"+arr[con].eng+"\t"+arr[con].math);
	}
	
	public void change(Student[] arr){//4.�����ϱ�
		System.out.println("-------------------------------");
		System.out.print("������ �й�>");
		int con=sc.nextInt();
		con--;
		System.out.print("����>");
		arr[con].kor=sc.nextInt();
		System.out.print("����>");
		arr[con].eng=sc.nextInt();
		System.out.print("����>");
		arr[con].math=sc.nextInt();
	} 
	
	public void del(Student[] arr){//5.�����ϱ�
		System.out.println("-------------------------------");
		System.out.print("������ �й�>");
		int con=sc.nextInt();
		con--;
		arr[con].num=0;
		arr[con].name="-";
		arr[con].kor=0;
		arr[con].eng=0;
		arr[con].math=0;
		System.out.println("�����Ϸ�");
	}
	
	public int excepMenu(){
		int su=-1;
		do{
			try	{
				su=sc.nextInt();
			}catch(java.util.InputMismatchException ex){
				System.out.println("���ڷ� �Է����ּ���");
				sc=new Scanner(System.in);
			}
		}while(!(su>=0&&su<=5));
		return su;
	}
	
	public int excepInput(){
		int su=-1;
		do{
			try	{
				su=sc.nextInt();
			}catch(java.util.InputMismatchException ex){
				System.out.println("���ڷ� �Է����ּ���");
				sc=new Scanner(System.in);
			}
		}while(!(su>=0&&su<=100));
		return su;
	}
}
