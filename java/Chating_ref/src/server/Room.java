package server;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Room extends Frame implements ActionListener{
	WaitingRoom wr;
	TextArea ta;
	List list;
	TextField tf;
	Button b;
	String id;
	WaitingRoom waitingRoom,waitingRoom2;
	String rn;
	Room(String name, String rn, WaitingRoom waitingRoom) {
		super(name+"님의 채팅창"+"   방제목 :"+rn);
		this.rn=rn;
		this.waitingRoom=waitingRoom;
		id=name;
		ta = new TextArea();
		ta.enable(false);
		ta.setBackground(Color.WHITE);
		ta.setForeground(Color.black);
		list = new List();
		tf = new TextField();
		b = new Button("나가기");

		Panel p1 = new Panel();
		p1.setLayout(new BorderLayout());
		Panel p2 = new Panel();
		p2.setLayout(new BorderLayout());
		
		p1.add(ta);
		p1.add(list, "East");
		p2.add(tf);
		p2.add(b, "East");
		add(p1);
		add(p2, "South");
		tf.addActionListener(this);
		b.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b){
			
			try {
			
				waitingRoom.sendMsg("roomout/"+id+"/"+rn);
				waitingRoom.dispose();
				dispose();
				setVisible(false);
				
		
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		else if(e.getSource()==tf){
			try {
				if(tf.getText().trim().length()>0){
				waitingRoom.sendMsg("msg/"+id+"/"+rn+"/"+tf.getText());
				tf.setText("");
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
	}
	
}