package com.bit.pm;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex02 extends Frame implements MouseListener{
	public Ex02(){
		Panel p =new Panel();
		
		Button btn=new Button();
		btn.addMouseListener(this);
		
		
		
		p.add(btn);
		add(p);
		setSize(400,300);
		setLocation(900, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex02();

	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺 ��ư�� ������ ����");
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺 �����¼���");
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺 ���¼���");
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺�� ����");
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺�� ������");
	}

}
