package com.bit.am;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

class Lec02{
	int su;
	Lec02(int su){
		this.su=su;
	}
}

public class Ex02 {

	
	public static void main(String[] args) {
		//set
		//-������ ���� �ʰ�
		//-�ߺ����X
		Set set01=new HashSet(); // ���� ����, hash ������ ���ϹǷ� ��ü�� �Էµȴ�
//		set01= new TreeSet();// ������ ����, ���ڿ��� �Է½� �񱳰� ���
		set01.add(new Lec02(1111));//�Է�
//		set01.add(2222);//�Է�
//		set01.add(3333);//�Է�
//		set01.add(4444);//�Է�
//		set01.add(5555);//�Է�
//		set01. ������ ���� �� ����. �ᱹ ������ ���� �Է°� ����.
		set01.remove(3333);//����
		
		System.out.println("set size:"+set01.size());
		Iterator ite= set01.iterator();//����
		while(ite.hasNext()){
			System.out.print(ite.next()+" ");
		}
		System.out.println("\n-------------------------");	
	}

}
