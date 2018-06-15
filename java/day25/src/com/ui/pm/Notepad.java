package com.ui.pm;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Notepad extends Frame implements ActionListener{
	int x,y;
	TextArea ta;
	public Notepad(){
		super("�������");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		Toolkit kit=Toolkit.getDefaultToolkit();
		MenuBar mb=new MenuBar();
		Menu mn1=new Menu("����");
		String[] msgs={"����","����","����","����"};
		MenuItem[] mnItm1=new MenuItem[3];
		for (int i = 0; i < mnItm1.length; i++) {
			mnItm1[i]=new MenuItem(msgs[i]);
			if(i==2){
				mn1.addSeparator();
			}
			mnItm1[i].addActionListener(this);
			mn1.add(mnItm1[i]);
		}
		mb.add(mn1);
		Menu mn2=new Menu("����");
		MenuItem mnItm2=new MenuItem("����");
		mnItm2.addActionListener(this);
		mn2.add(mnItm2);
		mb.add(mn2);
		setMenuBar(mb);
		ta=new TextArea();
		add(ta);
		Dimension screen=kit.getScreenSize();
		Dimension frame=new Dimension(400,400);
		x=screen.width/2-frame.width/2;
		y=screen.height/2-frame.height/2;
		setBounds(x,y,frame.height,frame.width);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Notepad();
	}
	public void actionPerformed(ActionEvent e) {
		String msg=((MenuItem)e.getSource()).getLabel();
		if(msg.equals("����")){
			dispose();
		}else if(msg.equals("����")){
			final Dialog dia=new Dialog(this,"����");
			dia.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					dia.setVisible(false);
				}
			});
			int x=this.getX()+(int)this.getWidth()/2-300/2;
			int y=this.getY()+(int)this.getHeight()/2-300/2;
			dia.setBounds(x, y, 300, 300);
			dia.setVisible(true);
		}else {
			String title=getTitle();
			if(msg.equals("����")){
				FileDialog opendia=new FileDialog(this,"",FileDialog.LOAD);
				int x=this.getX()+(int)this.getWidth()/2-300/2;
				int y=this.getY()+(int)this.getHeight()/2-300/2;
				opendia.setBounds(x, y, 300, 300);
				opendia.setVisible(true);
				title=opendia.getFile();
				File f=new File(opendia.getDirectory(),opendia.getFile());
				FileReader fr=null;
				BufferedReader br=null;
				try {
					fr=new FileReader(f);
					br=new BufferedReader(fr);
					while(true){
						String temp=br.readLine();
						if(temp==null){break;}
						if(ta.getText().trim().equals("")){
							ta.setText(temp);
						}else{
							ta.setText(ta.getText()+"\n"+temp);
						}
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally{
					try {
						fr.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				setTitle(title);
			} else if(msg.equals("����")){
				FileDialog savedia=new FileDialog(this,"",FileDialog.SAVE);
				int x=this.getX()+(int)this.getWidth()/2-300/2;
				int y=this.getY()+(int)this.getHeight()/2-300/2;
				savedia.setBounds(x, y, 300, 300);
				savedia.setVisible(true);
				File f=new File(savedia.getDirectory(),savedia.getFile());
				FileWriter fw=null;
				BufferedWriter bw=null;
				PrintWriter pw=null;
				try {
					f.createNewFile();
					fw=new FileWriter(f);
					bw=new BufferedWriter(fw);
					pw=new PrintWriter(bw);
					
					pw.print(ta.getText());
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally{
					try {
						pw.close();
						bw.close();
						fw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				}
			}
		}
	}
}