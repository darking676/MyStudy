package com.bit.am;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex09 {

		//arraylist �� �ӵ��� ������.
	public static void main(String[] args) {
		List<Integer> list01=new ArrayList<Integer>();
		list01.add(111);
		list01.add(222);
		list01.add(333);
		list01.add(444);
		for (int i = 0; i < list01.size(); i++) {
			System.out.println(list01.get(i));
		}
		for (int i = 0; i < 1000000; i++) {
			list01.add(i);
		}
		System.out.println("�Է½���");
		for (int i = 0; i < 1000000; i++) {
			list01.get(i);
		}
		System.out.println("�Է³�");
		System.out.println("-----------------------------------");

		List<Integer> list02 = new LinkedList<Integer>();
		list02.add(111);
		list02.add(222);
		list02.add(333);
		list02.add(444);
		for (int i = 0; i < list02.size(); i++) {
			System.out.println(list02.get(i));
		}
		for (int i = 0; i < 1000000; i++) {
			list02.add(i);
		}
		System.out.println("�Է½���");
		for (int i = 0; i < 1000000; i++) {
			list02.get(i);
		}
		System.out.println("�Է³�");
	}

}
