package Client;

//Ŭ���̾�Ʈ UI

//import java.awt.*; 
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;


public class Ui02 extends Frame implements ActionListener {
	
	int x,y;//��ũ��, ������ ��ġ ���ϱ� ����
	TextArea texA;
	TextField txtF; 
	String msg="~!@#";
	public Ui02() {
		super("Client");
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose(); // frame close
			}
		});
		Toolkit kit = Toolkit.getDefaultToolkit();
		texA = new TextArea(20,40);// 20�� 40column text area �����
		texA.setBackground(new Color(200,235,245));//ä��â ������ ����
		texA.setForeground(Color.GRAY); //ä��â ���ڻ� ����
		texA.setEditable(false);
	    txtF = new TextField(28);	// 30column text field �����
	    Font font = new Font("����", Font.BOLD, 15);
	    txtF.setBackground(new Color(170,188,215));//ä���Է� ������ ����
	    txtF.setFont(font); //ä�� �Է��� ���� �۾���
	    txtF.setForeground(Color.MAGENTA);//ä�� �Է� ���ڻ� 
		Button btnTransfer = new Button("����"); // ���۹�ư
		btnTransfer.addActionListener(this);
		btnTransfer.setBackground(new Color(65,128,128));//��ư ����
		btnTransfer.setForeground(Color.WHITE); //��ư ���ڻ�
		Button btnExit = new Button("����"); // ä�� �ݱ� ��ư
		btnExit.addActionListener(this);
		btnExit.setBackground(new Color(65,128,128));
		btnExit.setForeground(Color.WHITE);
		
		Panel p = new Panel();
		Panel p1= new Panel();
		add(texA);
      p.add(txtF);
      p.add(btnTransfer);
      p.add(btnExit);
      add("South",p);

		
		Dimension screan = kit.getScreenSize();
		Dimension frame=new Dimension(400,400);//����, ����
		x=screan.width/2-frame.width/2;
		y=screan.height/2-frame.height/2;
		setBounds(x, y, frame.width, frame.height);//Frame�� ��ġ  
		setVisible(false);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(((Button)e.getSource()).getLabel()=="����"){//��ư�� �������� �� ���� �����϶� ���� if ����
			msg=txtF.getText();//msg�� �������� ����
			txtF.setText("");//�Է�â �ʱ�ȭ
		}else if(((Button)e.getSource()).getLabel()=="����"){
			msg="EXIT";
			dispose();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ui02 ui02=new Ui02();
	}
}