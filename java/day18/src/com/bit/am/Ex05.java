package com.bit.am;

public class Ex05 {
	
	
	public static void main(String[] args) {
		String db="1@ȫ�浿@90@80@70\n";
		db+="2@ȫ�浿@90@80@70\n";
		db+="3@ȫ�浿@90@80@70\n";
		db+="4@ȫ�浿@90@80@70\n";
		db+="5@ȫ�浿@90@80@70\n";
		
		System.out.println("-------------------------------");
		System.out.println("�й�\t�̸�\t����\t����\t����");
		System.out.println("-------------------------------");
		String[] students=(String[]) db.split("\n");
		for (int i = 0; i < students.length; i++) {
			String temp=students[i];
			String[] stu=temp.split("@");
			System.out.print(stu[0]);
			System.out.print("\t");
			System.out.print(stu[1]);
			System.out.print("\t");
			System.out.print(stu[2]);
			System.out.print("\t");
			System.out.print(stu[3]);
			System.out.print("\t");
			System.out.print(stu[4]);
			System.out.println("\t");
		}
		
		
		
		
	}

}
