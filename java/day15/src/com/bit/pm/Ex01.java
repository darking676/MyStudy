package com.bit.pm;
import java.util.ArrayList;

public class Ex01 {

	
	public static void main(String[] args) {
		// �迭�� �̿��� �����Ҵ�
		ArrayList list=null;
		list = new ArrayList();
		
		list.add("test1");
		list.add("test2");
		list.add("test3");
		list.add("test4");
		list.add("test5");
		list.add("test6");
		//CRUD(Create,Read,Update,Delete)
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------------------");
		list.remove(1);//����
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}
		System.out.println("----------------------------");
		list.set(2, "test5");//����
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------------------");
		list.add(3, "test6");//�����ֱ�
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------------------");
		// test5�� index���� ���϶�(���° �ִ°�)
		System.out.println("test5�� idx="+list.indexOf(new String("test5")));
		int idx=0;
		for (idx = 0; idx < list.size(); idx++) {
			String temp=(String)list.get(idx);
			if(temp=="test5"){
				break;
			}
		}
		if(idx==list.size()){
			idx=-1;
		}
		System.out.println("test5�� index: "+idx);
		// test5�� ��������
		System.out.println("test5�� ��������"+list.contains("test5"));
		System.out.println("----------------------------");
		System.out.println("list�� ����°�"+list.isEmpty());
		System.out.println("list.clear ����");
		list.clear();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("list�� ����°�"+list.isEmpty());
		System.out.println("----------------------------");
		//���� ����
		ArrayList list2=list;
		list2.add("1111");
		//���� ����
		ArrayList list3=(ArrayList)list2.clone();
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
		
		ArrayList list4=new ArrayList();
		for (int i = 0; i < list4.size(); i++) {
			list3.add(list4.get(i));
		}
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
		
		ArrayList list5=new ArrayList(list);
		list5.add("2222");
		for (int i = 0; i < list5.size(); i++) {
			System.out.println(list5.get(i));
		}
		System.out.println("----------------------------");
		//��ü�� �̿��� �����Ҵ� - �� ����� ����.
		java.util.LinkedList list01=null;
		
		
		
		
		
		
		
	}

}
