package com.bit.am;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Toolkit;

public class Ex03 extends Frame{
	public Ex03(){
		Toolkit kit=Toolkit.getDefaultToolkit();//Toolkit �� �̿��Ͽ� ������� �ػ󵵸� �޾Ƴ���
		kit.beep();
		Dimension dim=kit.getScreenSize();// ����Ÿ������ �޴´�
		
		
		
		Dimension mySize=new Dimension();
		mySize.width=300;
		mySize.height=300;
		setSize(mySize);
//		setSize(300,300);
		setLocation(dim.width/2-150,dim.height/2-150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex03();

	}

}
