package com.bit.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex03 extends Frame{
	public Ex03(){
		super("GridBagLayout");
		GridBagLayout gbl=new GridBagLayout();
		Panel p=new Panel(gbl);
		
		Button[] btns=new Button[6];
		for (int i = 0; i < btns.length; i++) {
			btns[i]=new Button("��ư"+i);
		}
		//ũ��,��ġ,����ġ
		
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		
		//��ġ
		gbc.gridx=0;
		gbc.gridy=0;
		//ũ��
		gbc.gridwidth=2;
		gbc.gridheight=1;
		//����ġ
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		p.add(btns[0],gbc);
		
		gbc.gridx=2;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
	
		p.add(btns[1],gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=3;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		p.add(btns[2],gbc);
		
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=2;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		p.add(btns[3],gbc);
		
		gbc.gridx=1;
		gbc.gridy=2;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		p.add(btns[4],gbc);
		
		gbc.gridx=1;
		gbc.gridy=3;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		p.add(btns[5],gbc);
		
		add(p);
		setSize(500,300);
		setLocation(900, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex03();

	}

}
