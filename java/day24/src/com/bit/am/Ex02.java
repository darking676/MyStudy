package com.bit.am;

import java.io.File;
import java.text.FieldPosition;
import java.util.Date;

public class Ex02 {

	
	public static void main(String[] args) {
		// ���� ���丮�ȿ� � ���ϵ��� �ִ��� Ȯ��
		File f=new File("./");
		if(f.exists()){
			String[] st=f.list();
			for (int i = 0; i< st.length; i++) {
				System.out.println(st[i]);
			}
		}
		if(f.exists()){
			System.out.println(new Date(f.lastModified()));//Ÿ��long�� ����Ʈ�� ���θ� ������ ������¥
			System.out.println(f.length());//������ ������
		}
		
		
	}
}