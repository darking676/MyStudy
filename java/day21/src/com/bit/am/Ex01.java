package com.bit.am;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class Ex01 {
	

	public static void main(String[] args) {
		Frame f=new Frame("��ġ������(����)");
		FlowLayout fl=new FlowLayout();
		Panel p =new Panel(null);//����Ʈ���� flowLayout
		
		Button btn1=new Button("��ư");

		
		p.add(btn1);
		f.add(p);
		f.setSize(300, 500);
		f.setLocation(900, 100);
		f.setVisible(true);
		btn1.setSize(50,50);
//		int x=p.getWidth();
//		int y=p.getHeight();
		btn1.setLocation(284-50, 462-50);
	
	}

}
