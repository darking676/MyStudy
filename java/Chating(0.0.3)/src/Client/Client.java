package Client;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Client.Receive;
import Client.Send;

public class Client extends Thread{
	public static String id;
	public static Ui03 ui03;
	public static String ipaddress="0";
	static Socket sock;
	static PrintWriter pw;
	static int port=3000;
	static Ui02 ui02=new Ui02();
	public static void main(String[] args){
		int port=3000;
		ui03=new Ui03();
	}
	public static void connect(){
		String msg = null;//�ߺ��˻����� �־� ���� msg
		boolean result=false;//�ߺ��˻� ��� ���� result
		try {
			sock=new Socket("203.236.209.220",port);
			
			pw=new PrintWriter(sock.getOutputStream());
			pw.println("idID"+id);//���̵� ������ ����
			pw.flush();
			BufferedReader br=new BufferedReader(new InputStreamReader(sock.getInputStream()));
			while(true){//�������� �ߺ��˻縦 �Ͽ� ��ȯ���� while
				msg=br.readLine();//�ߺ��̸� true, �ƴϸ� false
				if(!msg.isEmpty()){//�ߺ��̰ų� �ƴϰų� �Ѵ� while Ż��
					break;
				}
			}
			msg.toString();//booleanŸ���� ����� string�� ��ȯ
			if(msg.equals("false")){//�ƴҽ� ����
				ui03.dispose();//�α���â �ݱ�
				ui02.setVisible(true);//ä��â ���
				Receive receive=new Receive(sock,ui02);
				receive.start();
				Send send=new Send(sock, id,ui02);
				send.start();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
