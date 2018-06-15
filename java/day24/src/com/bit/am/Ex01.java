package com.bit.am;

import java.io.File;
import java.io.IOException;

public class Ex01 {
	//vm���� �ü������ �о���µ� ������ true/������ false
	
	public static void main(String[] args) throws IOException {
//		File f0=new File("main01.png");
//		System.out.println("�������� ���� :"+f0.exists());
//		func(f0);
		File f1=new File("C:\\jtest\\workspace\\myStudy\\day24\\main01.png");//������
		System.out.println("�������� ���� :"+f1.exists());
		func(f1);
		
		System.out.println(f1.getPath());
		//�����δ� ������ ����� �ٸ���
		System.out.println(f1.getCanonicalPath());
		System.out.println(f1.getAbsolutePath());
		String path1=f1.getAbsolutePath();
		String path2=f1.getCanonicalPath();
		System.out.println(path1.replace(path2,""));
		System.out.println(f1.getParent());
		System.out.println(f1.getName());
		System.out.println(f1.getParent()+"\\"+f1.getName());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());//������ �б��������� �ϸ� ���°� �Ұ���
		System.out.println(f1.canExecute());
		
		
		File f2=new File("dir/../main01.png");//dir�� ������ ���丮
		System.out.println("�������� ���� :"+f2.exists());
		func(f2);
		File f3=new File("./main01.png");//���� ���丮
		System.out.println("�������� ���� :"+f3.exists());
		func(f3);
	}

	public static void func(File f){
		if(f.isDirectory()){
			System.out.println("���丮");
		}else if(f.isFile()){
			System.out.println("����");
		}
	}
}
