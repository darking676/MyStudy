package com.bit.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Ex07 extends Frame implements ComponentListener{

	public Ex07(){
		Panel p=new Panel();
		final Button btn1=new Button("btn1");
		Button btn2=new Button("togle");
		btn1.addComponentListener(this);
		btn2.addActionListener(new ActionListener() {
			boolean show;
			public void actionPerformed(ActionEvent e) {
				btn1.setVisible(show);					
				show=!show;
			}
		});
		p.add(btn1);
		p.add(btn2);
		add(p);
		setBounds(900, 100, 400, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex07();
	}
	public void componentResized(ComponentEvent e) {//â�� ũ�Ⱑ ��ȭ
		System.out.println("componentResized run");
	}
	public void componentMoved(ComponentEvent e) {//â�� ������
		System.out.println("componentMoved run");
	}
	public void componentShown(ComponentEvent e) {//�����ٶ�
		System.out.println("componentShown run");
	}
	public void componentHidden(ComponentEvent e) {//��������
		System.out.println("hidden run");
	}
}
