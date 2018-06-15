package com;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//�޴��� Ŭ����

public class Menubar extends Frame implements ActionListener{
	
	public Menubar() {
		MenuBar mb =new MenuBar(); //�޴��� ����
		
		Menu mnufile =new Menu("File"); // �޴����� ����
		Menu mnuinform =new Menu("Help"); //�޴����� ����
		
		MenuItem mnuexit =new MenuItem("Exit"); //�޴����� �ȿ� ����
		MenuItem mnucre =new MenuItem("Creator"); //�޴� ���� �ȿ� ������
		
		mnuexit.addActionListener(this); //�����ư�� ������ �����ϱ����� �׼Ǹ����� �߰�
		mnucre.addActionListener(this); //ũ�������� ��ư�� ������ �����ϱ����� �׼Ǹ����� �߰�
		
		mnufile.add(mnuexit); //���ϸ޴��� ���� �߰�
		mnuinform.add(mnucre); //���� ���򸻿� ������ �߰�
		
		mb.add(mnufile); //�޴��ٿ� ���ϸ޴� �߰�
		mb.add(mnuinform); //�޴��ٿ� ���� �߰�
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String msg =((MenuItem)e.getSource()).getLabel(); 
		if(msg.equals("Exit")){
			dispose(); //����
		}else if(msg.equals("Creator")){
			final Dialog d =new Dialog(this, "Creator"); //�����ڸ� �����ִ� ���̾�α� â ����
			Label la =new Label("creator : we are the one"); //�����ڸ� ���� ��
			la.setAlignment(Label.CENTER);
			d.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					d.setVisible(false); //xǥ�� ������ â �Ⱥ��̰���.
				}
			});
			d.add(la); //���̾� �α׿� �� �߰�(������ �� ���°�)
			d.setBounds(600, 100, 300, 200); //���̾�α� â��ġ�� ũ��
			d.setVisible(true);	
		}	
	}
	

}
