package com.bit.am;

import java.util.Scanner;

/*
 * 991234-1234567
 * 001234-3456789
 * 001234-4456789
 * 001234-9456789
 * 19180221
 * 1908
 * �ֹι�ȣ�� �Է��ϼ���>123456-1234567
 * ����� 00�� �����Դϴ�
 * 
 * �ֹι�ȣ�� �Է��ϼ���>123456-2234567
 * ����� 00�� �����Դϴ�
 * 
 * �ֹι�ȣ�� �Է��ϼ���>1234561234567
 * '-'�� �������� ������
 * 
 * �ֹι�ȣ�� �Է��ϼ���>123456-123456
 * ��Ŀ� ���� �Է¹ٶ��ϴ� ex)000000-0000000
 * 
 * �ֹι�ȣ�� �Է��ϼ���>12345-1234567
 * ��Ŀ� ���� �Է¹ٶ��ϴ� ex)000000-0000000
 * 
 * �ֹι�ȣ�� �Է��ϼ���>���̻�����-���̻�����ĥ
 * ����� 00�� �����Դϴ�
 * 
*/
public class Ex08 {

	
	public static void main(String[] args) {
		Ex08 me=new Ex08();
		boolean result=true;
		do{
			result=me.gameStart();
		}while(!result);
		System.out.println("�����մϴ�.");
		

	}// main end
	
	
	public boolean gameStart(){
		String input=null;
		int age=0;
		int year=2000;
		char gender='��';
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է����ּ���>>");
		input=sc.nextLine();
		boolean result=valid(input);
		if(result){
			if(input.charAt(0)-'0'>1){year=1900;}
			age=2018-(year+(input.charAt(0)-'0')*10+(input.charAt(1)-'0'));
			if(input.charAt(7)-'0'==1||input.charAt(7)-'0'==3){
				gender='��';
			} else if(input.charAt(7)-'0'==2||input.charAt(7)-'0'==4){
				gender='��';
			}
			System.out.println("����� "+age+"�� "+gender+"���Դϴ�." );
		}	
		return result;
	}// gameStart end
	
	public boolean valid(String msg){
		if(msg.length()!=14){
			System.out.println("��Ŀ� ���� �Է¹ٶ��ϴ� ex)000000-0000000");
			return false;
		}
		for(int i=0;i<msg.length();i++){
			if(i==6){
				if(msg.charAt(i)!='-'){
					System.out.println("��Ŀ� ���� �Է¹ٶ��ϴ� ex)000000-0000000");
					return false;
				}
			}else{
				char temp=msg.charAt(i);
				if(!Character.isDigit(temp)){
					System.out.println("��Ŀ� ���� �Է¹ٶ��ϴ� ex)000000-0000000");
					return false;
				}
			}	
		}
		return true;
	}

	
}//class end
