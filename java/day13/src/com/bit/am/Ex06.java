package com.bit.am;

public class Ex06 extends Object{
	int val;
	public Ex06(int a){
		val=a;
	}
	
	public static void main(String[] args) {
		Ex06 me=new Ex06(100);
		Ex06 me2=new Ex06(100);
		Ex05 ex05=new Ex05();
		
		//�ּ�(���۷���)����
		System.out.println(me==me2);
		//��(value)��
		System.out.println(me.equals(me2));
	}
	
	public boolean equals(Object obj){
		if(this.val==((Ex06)obj).val){
			return true;
		}else{
		return false;
		}
	}
}
