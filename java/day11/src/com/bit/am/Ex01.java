package com.bit.am;

import java.util.Scanner;

/*-------------------------------
 * �л������������α׷�(ver 0.1.0)
 * -------------------------------
 * 1.��ü���� 2.�Է� 3.�󼼺���>2
 * ����>90
 * ����>80
 * ����>70
 * 1.��ü���� 2.�Է� 3.�󼼺���>1
 * -------------------------------
 * �й� | ���� | ���� | ����
 * -------------------------------
 *  01     90     80     70
 *  02     80     80     80
 * 1.��ü���� 2.�Է� 3.�󼼺���>3
 * �й�>2
 * -------------------------------
 * �й� | ���� | ���� | ����
 * -------------------------------
 *  02     80     80     80
 * -------------------------------
 */
public class Ex01 {
	static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		Ex01 me=new Ex01();
		int con=0;
		int stdN=0;
		int tot=0;
		boolean result=true;
		System.out.println("-------------------------------");
		System.out.println("�л������������α׷�(ver 0.1.0)");
		System.out.println("-------------------------------");
		System.out.print("�ѿ�>");
		tot=sc.nextInt();
		int[][] arr=new int[tot][4];
		while(result){
			System.out.print("1.��ü���� 2.�Է� 3.�󼼺��� 4.�����ϱ� 5.�����ϱ� 0.����>");
			con=sc.nextInt();
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
						System.out.println("�̿����ּż� �����մϴ�.");
						result=false;
						break;
				}//switch end
			}else{
				System.out.println("�ٽ��Է����ּ���");
				break;
			}//if end
		}//while end
	}	
	
	public void show(int[][] arr){//1.��ü����
		System.out.println("-------------------------------");
		System.out.println("�й� | ����  | ���� | ����");
		System.out.println("-------------------------------");
		for(int i=0;i<arr.length;i++){
			System.out.println(" "+arr[i][0]+"\t"+arr[i][1]+"\t"+arr[i][2]+"\t"+arr[i][3]);
		}
		
	}
	
	public void showDetail(int[][] arr){//2.�󼼺���
		System.out.print("�й�>");
		int con=0;
		con=sc.nextInt();
		con--;
		System.out.println("-------------------------------");
		System.out.println("�й� | ����  | ���� | ����");
		System.out.println("-------------------------------");
		System.out.println(" "+arr[con][0]+"\t"+arr[con][1]+"\t"+arr[con][2]+"\t"+arr[con][3]);
	}
	
	public void insert(int[][] arr,int a){//3.�Է�
		System.out.println("-------------------------------");
		System.out.println("�й�>"+(a+1));
		arr[a][0]=a+1;
		System.out.print("����>");
		arr[a][1]=sc.nextInt();
		System.out.print("����>");
		arr[a][2]=sc.nextInt();
		System.out.print("����>");
		arr[a][3]=sc.nextInt();
	}
	
	public void change(int[][] arr){//4.�����ϱ�
		System.out.println("-------------------------------");
		System.out.print("������ �й�>");
		int con=sc.nextInt();
		con--;
		System.out.print("����>");
		arr[con][1]=sc.nextInt();
		System.out.print("����>");
		arr[con][2]=sc.nextInt();
		System.out.print("����>");
		arr[con][3]=sc.nextInt();
	} 
	
	public void del(int[][] arr){//5.�����ϱ�
		System.out.println("-------------------------------");
		System.out.print("������ �й�>");
		int con=sc.nextInt();
		con--;
		arr[con][0]=0;
		arr[con][1]=0;
		arr[con][2]=0;
		arr[con][3]=0;
		System.out.println("�����Ϸ�");
	}
	
}
