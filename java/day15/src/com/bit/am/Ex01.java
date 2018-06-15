package com.bit.am;

import java.util.InputMismatchException;
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
public class Ex01 {
	
	static class Bbs{
		static int cnt;
		int num;
		String title;
		String content;
		
		public Bbs(){
			cnt++;
			num=cnt;
		}
	
	}
	
	static class MyArray{
		Object[] objs;
		public MyArray(){
			objs=new Object[0];
		}
		
		public void add(Object obj){
			Object[] temp=new Object[objs.length+1];
			for (int i = 0; i < objs.length; i++) {
				temp[i]=objs[i];
			}
			objs=temp;
			objs[objs.length-1]=obj;
		}

		public void remove(int idx){
			if(objs.length>0&&idx<objs.length){
				Bbs[] temp=new Bbs[objs.length-1];
				for (int i = 0; i < idx; i++) {
					temp[i]=(Bbs)objs[i];
				}
				for (int i = idx+1; i < objs.length; i++) {
					temp[i-1]=(Bbs)objs[i];
				}
				objs=temp;
			}
		}
		
		public Object get(int index){
			return objs[index];
		}
		
		public int size(){
			return objs.length;
		}
		
	}

	public static void main(String[] args) {
		String bar="-------------------------------------";
		String title="MyBBS�Խ��� (ver0.0.1)";
		String titleH="�۹�ȣ\t|\t����\t|\t����";
		System.out.println(bar);
		System.out.println(title);
		System.out.println(bar);
		String menu="1.��� 2.�۾��� 3.�ۻ��� 0.����>";
		int input=-1;
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		MyArray arr= new MyArray();
		
		while(true){
			System.out.print(menu);
			try{
				input=sc.nextInt();
			}catch(InputMismatchException ex){
				System.out.println("���ڷ� �Է��ϼ���");
				sc=new Scanner(System.in);
			}catch(Exception ex){
				System.out.println("ġ���� ����");
			}
			if(input==0){
				System.out.println("�����մϴ�.");
				break;
			}else if(input==1){//���
				System.out.println(bar);
				System.out.println(titleH);
				System.out.println(bar);
				
//				for (int i = 0; i < arr.size(); i++) {
//					String[] bbs=(String[])arr.get(i);
//					System.out.print(bbs[0]);
//					System.out.print("\t\t|\t");
//					System.out.println(bbs[1]);
//					System.out.println(bar);
//				}
				
				for (int i = 0; i < arr.size(); i++) {
					Bbs bbs=(Bbs)arr.get(i);
					System.out.println(bbs.num);
					System.out.print("\t|\t");
					System.out.print(bbs.title);
					System.out.print("\t|\t");
					System.out.println(bbs.content);
					System.out.println(bar);
				}
				
			}else if(input==2){//�Է�
				//String[]
//				String[] bbs=new String[2];
//				System.out.print("����>");
//				bbs[0]=sc2.nextLine();
//				System.out.print("����>");
//				bbs[1]=sc2.nextLine();
//				arr.add(bbs);
				//Object
				Bbs bbs=new Bbs();
				
				System.out.print("����>");
				bbs.title=sc2.nextLine();
				if(bbs.title.equals("")){
					bbs.title="�������";
				}
				System.out.print("����>");
				bbs.content=sc2.nextLine();
				if(bbs.content.equals("")){
					bbs.title="�������";
				}
				arr.add(bbs);
			}else if(input==3){//����
				System.out.println("�۹�ȣ>");
				int idx=-1;
				try{
					idx=sc.nextInt();
					arr.remove(idx-1);
				}catch(InputMismatchException ex){
					System.out.println("���ڷ� �Է�");
					sc= new Scanner(System.in);
				}catch(Exception ex){
					
				}
			}else{
				System.out.println("�Է��� �ٽ����ּ���");
			}
		}//while end	
	}//main end
	
	
	
	
	
	
}
