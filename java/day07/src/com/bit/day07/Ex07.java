package com.bit.day07;
/*
 * �л� ���� ���� ���α׷�(ver 0.0.2)
 * 
 * 2�� ��
 * 
 * 1.�� ���� 2.�������>1
 * 
 * ��>1
 * 
 * 1�� 1���л� ����>
 * 1�� 1���л� ����>
 * 1�� 1���л� ����>
 * 
 * �Է� ���-���� : XX, ���� : xx, ���� : xx
 * 
 * 1.�� ���� 2.�������>1
 * 
 * ��>2
 * 
 * 2�� 1���л� ����>
 * 2�� 1���л� ����>
 * 2�� 1���л� ����>
 * 
 * �Է� ���-���� : XX, ���� : xx, ���� : xx
 * 
 * 1.�� ���� 2.�������>2
 * ----------------------
 * 1��
 * ----------------------
 * �ѿ� : xx��
 * ���� ��� : xx.xx
 * ���� ��� : xx.xx
 * ���� ��� : xx.xx
 * ----------------------
 * 2��
 * ----------------------
 * �ѿ� : xx��
 * ���� ��� : xx.xx
 * ���� ��� : xx.xx
 * ���� ��� : xx.xx 
 */
/*
	class Ban{
		int banId;
		
	}

	class Student{
		int studentId;
		int kor,eng,math,sum;
		double avg;
	}
	
	class management{
		Ban ban=new Ban();
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		public void show(){//��� ���
			for(int i=1;i<=std.studentId;i++){
				std.avg=avg(std.kor, std.eng, std.math);
			}
			
			System.out.println("----------------------");
			System.out.println(ban.banId+"��");
			System.out.println("----------------------");
			System.out.println("�ѿ� :"+std.studentId+"��");
			System.out.println("���� ��� :"+std.kor);
			System.out.println("���� ��� :"+std.eng);
			System.out.println("���� ��� :"+std.math);
		}
		
		public void add(){//�л��߰�,�����Է�
			int n=0;
			System.out.print("��>");
			ban.banId=sc.nextInt();
			if(ban.banId==1){
				n++;
				Student std=new Student();
				std.studentId++;
			}
			System.out.println("----------------------");
			System.out.println(ban.banId+"��");
			System.out.println("----------------------");
			System.out.print(ban.banId+"��"+std.studentId+"���л� ����>");
			std.kor=sc.nextInt();
			System.out.print("1�� 1���л� ����>");
			std.eng=sc.nextInt();
			System.out.print("1�� 1���л� ����>");
			std.math=sc.nextInt();
			
			System.out.println("�Է� ���-���� : "+std.kor+", ���� : "+std.eng+", ���� : "+std.math);
		}
		
		public double avg(int kor,int eng,int math){//��� ���
			int sum=kor+eng+math;
			double avg=sum*100/3/100;
			return avg;
		}
	}

public class Ex07{

	
	public static void main(String[] args) {
		int con=1;
		management me=new management();
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("�л� ���� ���� ���α׷�(ver 0.0.2)");
		System.out.println("1.�� ���� 2.������� 0.����>");
		con=sc.nextInt();
		
		switch(con){
			case 1:
				me.add();
				break;
			case 2:
				me.show();
				break;
			case 0:
				break;
			default :
				break;
		}
		
	}

}
*/