package com.bit.am;

public class Ex07 {

	public static void main(String[] args) {
	

		char ch1='a';
		Character ch2= new Character('A');
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE);
		System.out.println(Character.SIZE);
		System.out.println("--------------");
		System.out.println(ch2.charValue()+1);//���ڷ� ���
		System.out.println(ch2.toString()+1);//���ڷ� ���
		System.out.println(Character.valueOf(ch1));//
		// �����ڵ� ���� �ڹٿ��� ����� �� �ִ� �������� �˻�
		System.out.println("�����ڵ�˻�--------------");
		System.out.println(Character.isDefined('@'));
		// ���� ����
		System.out.println("���ڰ˻�--------------");
		System.out.println("'a'"+Character.isLetter('a'));
		System.out.println("'��'"+Character.isLetter('��'));
		System.out.println("123"+Character.isLetter(123));
		System.out.println("'��'"+Character.isLetter('��'));
		// ���� ����
		System.out.println("���ڰ˻�----------------");
		System.out.println("'9'"+Character.isDigit('9'));
		System.out.println("'@'"+Character.isDigit('@'));
		System.out.println("'a'"+Character.isDigit('a'));
		// ���ĺ� ����
		System.out.println("���ĺ��˻�----------------");
		System.out.println("'A'"+Character.isAlphabetic('A'));
		System.out.println("'Z'"+Character.isAlphabetic('Z'));
		System.out.println("'a'"+Character.isAlphabetic('a'));
		System.out.println("'b'"+Character.isAlphabetic('b'));
		System.out.println("'2'"+Character.isAlphabetic('2'));
		System.out.println("'@'"+Character.isAlphabetic('@'));
		System.out.println("'��'"+Character.isAlphabetic('��'));
		System.out.println("'A'"+Character.isUpperCase('A'));
		System.out.println("'a'"+Character.isUpperCase('a'));
		// ����
		System.out.println("����˻�----------------");
		System.out.println("' '"+Character.isSpace(' '));
		System.out.println("'a'"+Character.isSpace('a'));
		System.out.println("'@'"+Character.isSpace('@'));
		System.out.println("' '"+Character.isWhitespace(' '));
		System.out.println("'a'"+Character.isWhitespace('a'));
		System.out.println("'@'"+Character.isWhitespace('@'));
	}

}
