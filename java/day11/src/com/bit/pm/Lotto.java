package com.bit.pm;

import java.util.Random;
import java.util.Scanner;

/*
 * �ζǹ�ȣ ������
 * SBS �� pm 8��40��
 * ���� 6��
 * 1~45
 * �ߺ��Ұ�
 * ������ ��������
 * ��ǥ�Ҷ� ������� ��������
 * 
 * ��ü
 */
public class Lotto {
	Scanner sc=new Scanner(System.in);
	Random random=new Random();
	int[] LottoN=new int[45];
	
	public static void main(String[] args) {
		Lotto me=new Lotto();
		me.show();
	}
	
	public void show(){
		System.out.println("�ζ���÷");
		System.out.print("1.5000 2.3000 3.1000>");
		int con=sc.nextInt();
		switch(con){
			case 1:
				con=con*5;
				LottoNum(con);
				break;
			case 2:
				con++;
				LottoNum(con);
				break;
			case 3:
				con=con/3;
				LottoNum(con);
				break;	
			default:
				break;
		}
	}
	
	public void LottoNum(int su){//Ƚ���� ���ڷ� ����.
		int[][] MyNum=new int[su][6];
		
		for(int i=0;i<su;i++){//Ƚ���� �ش��ϴ� for
			for(int a=0;a<45;a++){//LottoN�� 45���� ���ڸ� ����.
				LottoN[a]=a+1;
			}
			
			for(int j=0;j<45;j++){//LottoN 45���� ���ڸ� �������� ����
				int temp=0;
				int n;
				temp=LottoN[j];
				while(true){
					n=random.nextInt(45);
					if(n!=j){break;}
				}	
				LottoN[j]=LottoN[n];
				LottoN[n]=temp;
			}
			/*
			 * for(int i=0;i<10000;i++){
			 * int ran=(int)(Math.random()*44)+1;
			 * int temp=LottoN[0]
			 * LottoN[0]=LottoN[ran];
			 * LottoN[ran]=temp;
			 * 
			 * }
			 */
			for(int j=0;j<6;j++){//LottoN �տ��� 6���� ���ڸ� ����
				MyNum[i][j]=LottoN[j];
			}
				
			//��ȣ�� ������ ������������ �ؾ���.
			int temp = 0; 
	        for (int j = 0; j < MyNum[i].length; j++) {
	            for (int k = j + 1; k < MyNum[i].length; k++) {
	            	if (MyNum[i][j] > MyNum[i][k]) {
	            			temp = MyNum[i][j];
	            			MyNum[i][j] = MyNum[i][k];
	            			MyNum[i][k] = temp;
	            	}
	            }
	        }
	        System.out.print("[");
	        for(int b=0;b<MyNum[i].length;b++){
	        	System.out.print(MyNum[i][b]+"\t");
	        }
	        System.out.print("]");
	        System.out.println();
		}
	}
}

