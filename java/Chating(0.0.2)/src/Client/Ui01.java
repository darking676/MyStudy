package Client;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
// ��������

public class Ui01 extends Frame implements ActionListener{
  
	public Ui01() {
		int Client =1; //Ŭ���̾�Ʈ�� ���ӽ� 1, �ƴҽ� 0
		Panel p1 =new Panel(new BorderLayout());
		Panel p2 =new Panel(new BorderLayout());
		Label la1 =new Label("User"); //���� ��
		Label la2 =new Label("User Name(Client)");  //����� ������ ���
		
		Icon icon=new ImageIcon("./chatimg.png"); //ä�� ��ư �̹���.
		
		Checkbox ck1 =new Checkbox("Client1");
		Checkbox ck2 =new Checkbox("Client");
		
		Font f1 = new Font("", Font.BOLD, 50); //��Ʈ����
		Font f2 = new Font("", Font.BOLD, 20); //��Ʈ����
		
		la1.setFont(f1);
		la2.setFont(f2);
		la1.setAlignment(Label.CENTER); //�߾�����.
		la2.setAlignment(Label.CENTER); //�߾�����.
		
		JButton btn =new JButton("chatting"); //��ư�� ä���̶�� �۾� �Է�
		btn.setIcon(icon); //��ư�� �̹��� �߰�
		btn.setFont(f2); //��ư ��Ʈ ����
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		if(Client ==1){ //Ŭ���̾�Ʈ�� �����ϸ� �˸�â�� ����Ʈ�� �̸��� ��.
			la2.setVisible(true); 
			final Dialog d =new Dialog(this, "Alarm");
			Font f3 = new Font("", Font.ITALIC, 20);
			Label la =new Label("Client connected");
			la.setAlignment(Label.CENTER);
			la.setFont(f3);
			d.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					d.setVisible(false); //xǥ�� ������ â �Ⱥ��̰���.
				}
			});

			d.add(la);
			d.setBounds(600, 100, 300, 200); //���̾�α� â��ġ�� ũ��
			d.setVisible(true);
		} else {
			la2.setVisible(false);
		}
		
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
		
		p2.add(btn, BorderLayout.SOUTH); //P2�� ä������ �����ϴ� ��ư�� �߰�
		p1.add(la1, BorderLayout.NORTH); //P1�� ������� ���� �гο� �߰�
		p1.add(la2, BorderLayout.CENTER); //P1�� ������ �˸� ���� �гο� �߰�
		setMenuBar(mb); //�޴��� �߰�
		add(p1,BorderLayout.NORTH); //�����ӿ� �г� �߰�
		add(p2,BorderLayout.SOUTH); //�����ӿ� �г� �߰�
		setTitle("ä�ø���â"); //â ����
		setBounds(600, 50, 300, 600); //â ũ��
		setVisible(true);

	}
	

	public static void main(String[] args) {
		new Ui01();

	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String msg =((MenuItem)e.getSource()).getLabel(); 
		if(msg.equals("Exit")){
			dispose(); //����
		}else if(msg.equals("Creator")){
			final Dialog d =new Dialog(this, "Creator"); //�����ڸ� �����ִ� ���̾�α� â ����
			Label la =new Label("creator : we are the one"); //�����ڸ� ���� ��
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
