package com.bit.am;

import java.io.File;
import java.io.IOException;

public class Ex07 {

	
	public static void main(String[] args) throws InterruptedException {
		//�ӽ����ϻ���
		
		try {
			File temp=new File("./dir");
			File f = File.createTempFile("abcdefg", "bit",temp);
			
			System.out.println(f.getCanonicalPath());
			System.out.println(f.getName()+":���ϻ����Ϸ�");
			
			Thread.sleep(3000);
			f.deleteOnExit();
			System.out.println("���ϻ����Ϸ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
