package com.bit.pm;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		
		File f=new File("./dir/ex08.bin");
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		try {
			fos=new FileOutputStream(f);
			dos=new DataOutputStream(fos);
			if(!f.exists()){
				f.createNewFile();
			}
			dos.writeInt(1234);
			dos.writeDouble(3.14);
			dos.writeBoolean(true);
			dos.writeChar('A');
			dos.writeUTF("�ѱ��Է�");
			dos.write(97);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				dos.close();//������ ��Ʈ���� ���� �ݴ´�
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("������ ��Ʈ�� �Է³�");
		
	}
}