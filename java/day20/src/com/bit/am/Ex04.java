package com.bit.am;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex04 extends Frame{
	public Ex04(){
		Panel p=new Panel();
		Label la1=new Label("����");
		TextField tf1=new TextField("�������",15);//���ڼ�
		Label la2=new Label("id");
		TextField tf2=new TextField();
		tf2.setColumns(5);
		tf2.setText("id�Է�");
		Label la3=new Label("pw");
		TextField tf3=new TextField(6);
		tf3.setEchoChar('&');
		
		TextArea ta1=new TextArea("",3,6,TextArea.SCROLLBARS_BOTH); //String text, int rows, int columns, int scrollbars(���ڿ� ���� ��ũ���� �ٸ�)
												
		p.add(la1);
		p.add(tf1);
		p.add(la2);
		p.add(tf2);
		p.add(la3);
		p.add(tf3);
		p.add(ta1);
		add(p);
		setSize(300, 200);
		setLocation(1000,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex04();

	}

}