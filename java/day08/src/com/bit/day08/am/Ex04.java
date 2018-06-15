package com.bit.day08.am;

import com.bit.day08.pm.Ex06;

class Ex44{
	/* ����������
	 * ���������� [static] �ڷ��� ������;
	 * public > default > private
	 * 
	 * �ʵ��� ����������
	 * private ���� �������� ���� Ŭ���� ���ο����� �������
	 * default ���� ��Ű�� ���ο����� �������
	 * public ��𼭵� ���� ���
	 * 
	 */
	
	public int su1=1111;
	int su2=2222;
	private int su3=3333;
	
	public void func01(){
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
	}
	
	void func02(){
		System.out.println("default �޼���");
		func03();
	}
	
	private void func03(){
		System.out.println("private �޼���");
	}
	
}

public class Ex04 {
	
	
	public static void main(String[] args) {
		Ex44 me=new Ex44();
		System.out.println(me.su1);
		System.out.println(me.su2);
		me.func01();
		
		Ex55 you=new Ex55();
		System.out.println(you.su4);
		System.out.println(you.su5);
		
		Ex06 he=new Ex06();
	
		System.out.println(he.su7);
		
		me.func02();
		
	}

}
