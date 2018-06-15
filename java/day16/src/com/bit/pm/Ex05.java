package com.bit.pm;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
/*
 * =================================== 
 * �л������������α׷� (ver0.2.0)
 * ===================================
 * 1. ��ü���� 2.�Է� 3.�󼼺��� 4.���� 5.���� 0.����> 
 * --------------------------------
 * �й� | ���� | ���� | ���� | ����
 * --------------------------------
 * 
 * 
 * 
 */

class Student{
	static int su;
	int num;
	String name="-";
	int kor=0;
	int eng=0;
	int math=0;;
	public Student(){
		su++;
		num=su;
	}
}//class end

class Prog{
	LinkedList list=new LinkedList();
	Scanner sc = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	String var="-------------------------------------------------------------------\n"+
	 		"�й�\t|\t����\t|\t����\t|\t����\t|\t����\n"+
	 		"-------------------------------------------------------------------";
	public void show(){
		
		int con=-1;
		String title="================================\n" +
					"�л������������α׷� (ver 0.2.0)\n"+
					"================================";
		System.out.println(title);
		String menu="1. ��ü���� 2.�Է� 3.�󼼺��� 4.���� 5.���� 0.����>";
		while(true){
			System.out.print(menu);
			con=sc.nextInt();
			if(con==1){
				listShow();
			}else if(con==2){
				input();
			}else if(con==3){
				detailShow();
			}else if(con==4){
				reInput();
			}else if(con==5){
				del();
			}else if(con==0){
				System.out.println("�̿����ּż� �����մϴ�");
				break;
			}else{
				System.out.println("�ٽ��Է��ϼ���");
			}
		}
	}
	
	public void listShow(){
		 
		System.out.println(var);
		Iterator ite=list.iterator();
		while(ite.hasNext()){			
			Student std2=(Student)ite.next();
			System.out.println(std2.num+"\t|\t"+
								std2.name+"\t|\t"+
								std2.kor+"\t|\t"+
								std2.eng+"\t|\t"+
								std2.math);
		}
	}
	
	public void input(){
		Student std=new Student();
		while(true){
			System.out.print("�й�>");
			System.out.println(std.num);
			System.out.print("�̸�>");
			std.name = sc2.nextLine();
			if(std.name.length()==3){}else{System.out.println("�ٽ��Է����ּ���");continue;}
			System.out.print("����>");
			std.kor=sc.nextInt();		
			if(std.kor>=0&&std.kor<=100){}else{System.out.println("�ٽ��Է����ּ���");continue;}
			System.out.print("����>");
			std.eng=sc.nextInt();							
			if(std.eng>=0&&std.eng<=100){}else{System.out.println("�ٽ��Է����ּ���");continue;}
			System.out.print("����>");
			std.math=sc.nextInt();
			if(std.math>=0&&std.math<=100){break;}else{System.out.println("�ٽ��Է����ּ���");continue;}
		}
		list.add(std);
	}
	
	public void detailShow(){
		int su;
		System.out.print("�й�>");
		try{
		su=sc.nextInt();
		Student std2=(Student)list.get(su-1);
		System.out.println(var);
		System.out.println(std2.num+"\t|\t"+
				std2.name+"\t|\t"+
				std2.kor+"\t|\t"+
				std2.eng+"\t|\t"+
				std2.math);
		} catch(IndexOutOfBoundsException ex){
			System.out.println("���� �Էµ��� �ʾҽ��ϴ�.");
		}
	}
	
	public void reInput(){
		System.out.print("�й�>");
		try{
			int su=sc.nextInt();
			Student std2=(Student)list.get(su-1);
			while(true){
				System.out.print("�й�>");
				System.out.println(std2.num);
				System.out.print("�̸�>");
				std2.name = sc2.nextLine();
				if(std2.name.length()==3){}else{System.out.println("�ٽ��Է����ּ���");continue;}
				System.out.print("����>");
				std2.kor=sc.nextInt();		
				if(std2.kor>=0&&std2.kor<=100){}else{System.out.println("�ٽ��Է����ּ���");continue;}
				System.out.print("����>");
				std2.eng=sc.nextInt();							
				if(std2.eng>=0&&std2.eng<=100){}else{System.out.println("�ٽ��Է����ּ���");continue;}
				System.out.print("����>");
				std2.math=sc.nextInt();
				if(std2.math>=0&&std2.math<=100){break;}else{System.out.println("�ٽ��Է����ּ���");continue;}
			}
		}catch(IndexOutOfBoundsException ex){
			System.out.println("���� �Էµ��� �ʾҽ��ϴ�.");
		}
	}
	
	public void del(){
		System.out.print("�й�>");
		try{
		int su=sc.nextInt();
		list.remove(su-1);
		}catch(IndexOutOfBoundsException ex){
			System.out.println("���� �Էµ��� �ʾҽ��ϴ�.");
		}
	}
}

public class Ex05 {

	
	public static void main(String[] args) {
		
		
		
		Prog prog=new Prog();
		prog.show();
		
		
	}//main end
}//class end
