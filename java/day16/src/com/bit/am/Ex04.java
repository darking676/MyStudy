package com.bit.am;

import java.util.LinkedList;

public class Ex04 {


	public static void main(String[] args) {
		// ť(FIFO) - a first in first out;
		// ���� o - ���� in ���� out;
		// �ߺ� ��
		java.util.Queue que=null;
		que=new LinkedList();
		que.offer(111);
		que.offer(22);
		que.offer(33);
		que.offer(55);
		que.offer(22);
		que.offer(33);
		
		System.out.println("Queue size: "+que.size());
		System.out.println("���������: "+que.peek());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println("���������: "+que.peek());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		

	}

}
