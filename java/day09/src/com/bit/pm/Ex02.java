package com.bit.pm;

public class Ex02 {

	/*
	 * �ֹι�ȣ�� �Է��ϼ���>123456-1234567
	 * ����� 00�� �����Դϴ�
	 * 
	 * �ֹι�ȣ�� �Է��ϼ���>1234561234567
	 * '-'�� �������� ������
	 * 
	 * �ֹι�ȣ�� �Է��ϼ���>123456-123456
	 * ��Ŀ� ���� �Է¹ٶ��ϴ� ex)000000-0000000
	 * 
	 * �ֹι�ȣ�� �Է��ϼ���>
	 * 
	 */
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String num=null;
		
		while(true){
			System.out.print("�ֹι�ȣ�� �Է����ּ���>");
			num=sc.nextLine();
			System.out.println(num);
			if(num.length()==14){
				if(num.charAt(6)=='-'){
					boolean result=true;
					for(int i=0;i<num.length();i++){
						if(i==6){
							continue;
						}
						if(num.charAt(i)<'0'||num.charAt(i)>'9'){
							result=false;
						} 
					}		
					if(result){
						break;
					}else{
						System.out.println("���ڸ� �Է��ϼ���");					
					}
				}else{
					System.out.println("'-'�� �Է����ּ���");
				}
			} else {
				System.out.println("14�ڸ� ���ڸ� �Է����ּ���");
			}//'-' if end
		}//while end  
		
			
		System.out.println("�Է¿Ϸ�");
		
		int age1=0;
		int age2=0;
		String se=null;
		age1=(num.charAt(0)-48)*10;
		age2=(num.charAt(1)-48);
		int age=age1+age2;
		age=118-age;
		
		switch(num.charAt(7)){
			case '1':
				se="����";
				break;
			case '2':
				se="����";
				break;
			case '3':
				se="����";
				break;
			case '4':
				se="����";
				break;
		}
		System.out.println("�����"+age+"��"+se+"�Դϴ�.");
		
				
		}
		
		
	
	
}

