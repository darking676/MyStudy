package com.bit.day07;

class BankCD{
	public int money=0;
	public void add(int b){
		money=money+b;
	};
	public void del(int input){
		money=money-input;
	};	
	public void show(){
		System.out.println("���� �ܰ�� "+money+"���Դϴ�.");
	};	
}

public class Ex04 {

	public static void main(String[] args) {
		int input=1;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		BankCD bank=new BankCD();
		
		while(input!=0){
			
		System.out.println("1.�Ա� 2.��� 3.�ܰ�Ȯ�� 0.����");
		input=sc.nextInt();
		
		
			switch(input){
				case 1:
						System.out.print("�Ա��Ͻ� �ݾ�");
						input=sc.nextInt();
						bank.add(input);
						System.out.println(bank.money);
					break;
				case 2:
						System.out.print("�Ա��Ͻ� �ݾ�");
						input=sc.nextInt();
						bank.del(input);
					break;
				case 3:
						bank.show();
					break;
				case 0:
					break;
				default:
					break;
			}
	
		}
	}

}
