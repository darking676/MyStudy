package com.bit.am;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;

public class Ex07 extends Frame {
	public Ex07() {
		Label la = new Label();
		la.setText("��ư");
		Font font = new Font("Arial",Font.BOLD,32);//�۲�, ��Ÿ��, ũ��
		la.setFont(font);
		
		add(la);
		setLocation(1000, 100);
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex07();
	}

}
