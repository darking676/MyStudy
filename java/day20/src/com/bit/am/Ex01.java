package com.bit.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex01 {

	
	public static void main(String[] args) {
		java.awt.Frame f=new Frame();
		
		Panel p =new Panel();
		
		java.awt.Button btn=new Button();
		Button btn2=new Button();
		
		
		btn.setLabel("btn01");
		btn2.setLabel("btn02");
		
		p.add(btn);
		p.add(btn2);
		
		f.add(p);
		btn.setVisible(true);
		f.setSize(400, 300);//âũ��
		f.setLocation(500, 300);//��ġ
		
		
		f.setVisible(true);//ȭ�鿡 �����ٰ��ΰ�
	}

}
