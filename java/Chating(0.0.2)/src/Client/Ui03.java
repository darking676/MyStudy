package Client;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//������ �Է� ����

public class Ui03 extends Frame implements ActionListener,MouseListener{
	
	static JTextField tfip=new JTextField(16); //ip�ؽ�Ʈ �ʵ� 16�� ���� �ִ¿�
	static JTextField tfid=new JTextField(8);//id�ؽ�Ʈ �ʵ� 8�� ���� �ִ¿�
	
	
	public Ui03() {
		JPanel jp =new JPanel(); //�г� ����
		JLabel jla =new JLabel("IP��ȣ "); 
		JLabel jla2 =new JLabel("ID ");
		JLabel jla3 =new JLabel();
		JButton btn = new JButton("Enter");		
		ImageIcon img =new ImageIcon("./chatimg.png");
		btn.addMouseListener(this);
		jla3.setIcon(img);
		
		jp.add(jla3);
		jp.add(jla);
		jp.add(tfip);
		jp.add(jla2);
		jp.add(tfid);
		jp.add(btn);
		
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
		
		setMenuBar(mb); //�޴��� �߰�
		
		add(jp);
		setTitle("IP �� ID �Է�â"); //â ����
		setBounds(600, 50, 600, 150); //â ũ��
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	static public String getIp(){
		return tfip.getText();
	}
	
	static public String getId(){
		return tfid.getText();
	}
	
	public static void main(String[] args) {
		new Ui03();

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
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseReleased(MouseEvent e) {
		if(((JButton)e.getSource()).getLabel()=="Enter"){
			Client.ipaddress=tfip.getText();//ui�� ip�Է�â���� ip�� �޾� Client�� ip������ ����
			Client.id=tfid.getText();//���� ���� id�� �޾� ����
			if(Client.ipaddress!=""&&Client.id!=""){
				dispose();//������ �޾� â�� ����
				Client.connect();//Ŭ���̾�Ʈ�� ������ �ϴ� �޼��带 ����
			}else{
				tfip.setText("");
				tfid.setText("");
				}
		}
	}
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
