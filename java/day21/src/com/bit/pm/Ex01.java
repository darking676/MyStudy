package com.bit.pm;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex01 extends Frame implements WindowListener{
	public Ex01(){
		// �̺�Ʈ ������ ���
		this.addWindowListener(this);
		
		setSize(500,300);
		setLocation(900, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex01();
		
	}

	public void windowOpened(WindowEvent e) {
		// â�� ��������
		System.out.println("windowOpened");
	}

	public void windowClosing(WindowEvent e) {
		// â�� x�� ������
		System.out.println("windowClosing");
		System.exit(0);
//		dispose(); //â�� �����ϰ� �����û
	}

	public void windowClosed(WindowEvent e) {
		// ������ ����� ���� �߰��۾��� �Ҷ�
		System.out.println("windowClosed");
	}

	public void windowIconified(WindowEvent e) {
		// â�� �ּ�ȭ
		System.out.println("windowIconified");
	}

	public void windowDeiconified(WindowEvent e) {
		// â�� �ּ�ȭ���� �ִ�ȭ��
		System.out.println("windowDeiconified");
	}

	public void windowActivated(WindowEvent e) {
		// â�� ��Ŀ�� ��
		System.out.println("windowActivated");
	}

	public void windowDeactivated(WindowEvent e) {
		// â�� ��Ŀ�� �ȉ�����
		System.out.println("windowDeactivated");
	}

}
