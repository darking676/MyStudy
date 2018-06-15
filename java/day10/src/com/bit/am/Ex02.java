package com.bit.am;

public class Ex02 {
/*
 * Integer ������ ���ڸ� ����
 * ���ڿܿ� ���Ұ�
 * 
 */
	public static void main(String[] args) {
		Integer a1=new Integer(1);
		Integer a2=new Integer("2");
		Integer a3=3;//���䷦�� �������������� ����� �ȵȴ�.
		int a4=a1+a2;//����
		Integer a5=a1+a2;//����� ���ؼ� ����(��ü�� ���ڷ� ��ȯ) ����� �ٽ� ���䷦�ε�
		
		System.out.println(a1+a2+a3);
		//�Ӽ� ����
		System.out.println(Integer.MIN_VALUE);//���� ������ �ʴ� ����� ����
		System.out.println(Integer.MAX_VALUE);//static �̴�.
		System.out.println(a1.MAX_VALUE);
		System.out.println(a1.SIZE);
		System.out.println("-----------------------");
		//��� �޼��� static
		System.out.println("parseInt-----------");
		String su1="1234";
		System.out.println(su1+1);
		int result1=Integer.parseInt(su1);// ���ֻ�� ���ڿ� -> ����  �ٲٴ� ���
		System.out.println(result1+1);    // INT �� �������� parseInt ���
		System.out.println("valueOf--------------");
		Integer result2=Integer.valueOf(su1);//Integer �� �������� valueOf ���
		System.out.println(result2+1);//
		Integer result3=Integer.valueOf(100);//int�� �޾Ƽ� Integer�� ���䷦��
		System.out.println("�������--------------");
		int su=10;
		System.out.println("2����"+su+":"+Integer.toBinaryString(su));//
		System.out.println("8����"+su+":"+Integer.toOctalString(su));
		System.out.println("16����"+su+":"+Integer.toHexString(su));
		
		
		System.out.println("-------------------------------");
		Integer b1=new Integer(101);
		Integer b2=new Integer(101);
		System.out.println("��ü�� �� �ּҰ�");
		System.out.println(b1==b2);
		System.out.println("������ ��");
		System.out.println(b1.equals(b2));
		System.out.println(Integer.valueOf(b1)==Integer.valueOf(b2));
		System.out.println("-------------------------------");
		System.out.println("���ڸ� ���ڷ�");
		int c1=3;
		Integer c2=new Integer(c1);
		System.out.println("�տ� ��ĭ�� ����");
		System.out.println(""+c1+1);
		System.out.println("toStirng���� ����");
		System.out.println(c2.toString()+1);
		System.out.println("-------------------------------");
		System.out.println("int �� double ������ doubleValue");
		Integer d1=new Integer(100);
		int d2=d1.intValue();
		double d3=d1.doubleValue();
		System.out.println(d2);
		System.out.println(d3);
		System.out.println("int �� byte ������ byteValue");
		byte d4=d1.byteValue();
		System.out.println(d4);
		System.out.println("int �� short ������ shortValue");
		short d5=d1.byteValue();
		System.out.println(d5);
		
		
	}

}
