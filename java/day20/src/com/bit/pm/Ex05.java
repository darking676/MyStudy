package com.bit.pm;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex05 extends Frame{

	public Ex05(){
		super("������");
		Panel mainP=new Panel(new BorderLayout());
		Panel topP=new Panel(new BorderLayout());
		Panel topPl=new Panel(new GridLayout(6,1));
		Panel topPr=new Panel(new GridLayout(6,1));
		Panel botP=new Panel(new BorderLayout());
		Panel botPt=new Panel();
		Panel botPb=new Panel();
		CheckboxGroup cbg=new CheckboxGroup();
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel(new BorderLayout());
		Panel p4=new Panel(new BorderLayout());
		Panel p5=new Panel();
		
		topPl.add(new Label("��   ��"));
		p1.add(new TextField(14));
		p1.add(new Label("��  ��"));
		p1.add(new Checkbox("��",cbg,true));
		p1.add(new Checkbox("��",cbg,false));
		
		topPl.add(new Label("�ֹε�Ϲ�ȣ"));
		p2.add(new TextField(6));
		p2.add(new Label("-"));
		p2.add(new TextField(6));
		p2.add(new Label("                      "));
		
		topPl.add(new Label("�ּ�"));
		p3.add(new TextField());
		
		topPl.add(new Label("�μ���"));
		Choice choi=new Choice();
		choi.add("��ȹ��");
		p4.add(choi,BorderLayout.WEST);
		
		topPl.add(new Label("���"));
		p5.add(new Checkbox("�",true));
		p5.add(new Checkbox("���ǰ���",false));
		p5.add(new Checkbox("��ȭ",false));
		p5.add(new Checkbox("��ǻ��",false));
		
		topPl.add(new Label("�ڱ�Ұ�"));
		
		
		botPt.add(new TextArea("",7,45,TextArea.SCROLLBARS_VERTICAL_ONLY));
		botPb.add(new Button("����"));
		botPb.add(new Button("����"));
		
		topPr.add(p1);
		topPr.add(p2);
		topPr.add(p3);
		topPr.add(p4);
		topPr.add(p5);
		topP.add(topPl,BorderLayout.WEST);
		topP.add(topPr,BorderLayout.EAST);
		botP.add(botPt,BorderLayout.NORTH);
		botP.add(botPb,BorderLayout.SOUTH);
		mainP.add(topP,BorderLayout.NORTH);
		mainP.add(botP,BorderLayout.SOUTH);
		add(mainP);
		setSize(360,400);
		setLocation(900,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex05();

	}

}
