package com.bit.pm;

import java.util.Scanner;

/* 
 * String db="";
 * 
 * ---------------------------------
 * �л������������α׷� (ver. 0.3.0)
 * ---------------------------------
 * 1.�Է� 2.���� 3.�󼼺��� (4.����)>1
 * �̸�>
 * ����>
 * ...
 * 
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
 */

public class Ex03 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name="-";
		int num=0;
		int kor,eng,math;
		boolean result=true;
		String db="";
		
		
		String title="---------------------------------\n"+
					"�л������������α׷� (ver. 0.3.0)\n"+
					"---------------------------------";
		String menu="1.�Է� 2.���� 3.�󼼺��� 4.���� 0.����>";
		System.out.println(title);
		
		while(result){
		System.out.print(menu);
		int con=sc.nextInt();
			switch (con) {
			case 1:
				num++;
				sc.nextLine();
				System.out.print("�̸�>");
				name=sc.nextLine();
				System.out.print("����>");
				kor=sc.nextInt();
				System.out.print("����>");
				eng=sc.nextInt();
				System.out.print("����>");
				math=sc.nextInt();
				db+=num+"@"+name+"@"+kor+"@"+eng+"@"+math+"\n";
				break;
			case 2:
				if(db==""){System.out.println("�Է����ּ���");break;}
				System.out.println("-------------------------------------");
				System.out.println("�й�\t�̸�\t����\t����\t����");
				System.out.println("-------------------------------------");
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
				break;
			case 3:
				if(db==""){System.out.println("�Է����ּ���");break;}
				int su=0;
				System.out.print("�й�>");
				su=sc.nextInt();
				System.out.println("-------------------------------------");
				System.out.println("�й�\t�̸�\t����\t����\t����");
				System.out.println("-------------------------------------");
				students=(String[]) db.split("\n");
				for (int i = su-1; i < su; i++) {
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
				break;
			case 4:
				su=0;
				System.out.print("�й�>");
				su=sc.nextInt();
				students=(String[]) db.split("\n");
				db="";
				students[su-1]="";
				
				for (int j = su; j < students.length; j++) {
					
					String temp=students[j];
					String[] stu=temp.split("@");
					stu[0]=j+"";
					for (int i = 0; i < stu.length; i++) {
						if(i==4){
							students[j-1]+=stu[i];
						}else{							
							students[j-1]+=stu[i]+"@";
						}
					}
				}
				int a=students.length;
				students[a-1]="";
				for(int i=0;i<students.length;i++){
					if(students[i]!=""){						
						db+=students[i]+"\n";
					}
				}
				num--;
				break;
			case 0:
				result=false;
				break;
			}
		}
		
		

	}

}
