package com.bit.pm;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Lec05{
	void print(){}
}
class Lec55{
	static Lec05 out;
}
public class Ex05 {


	public static void main(String[] args) throws IOException {
//		Lec55.out.print();

//		PrintStream myOut =System.out;//�ý��� ���
//		myOut.println("test");
//		InputStream myIn=System.in;//�ý��� �Է�
//		System.out.println(myIn.read());
		
//		Scanner sc=new Scanner(myIn);
//		System.out.println(sc.nextLine());
//		if(sc.nextInt()==0){
//			System.exit(0);//��������
//			System.exit(-1);//������Ȳ���� ����
//			return ;
//		}
//		System.out.println("��� �Է��ϴٰ�");
		
		Map<String,String> map=System.getenv();
		Set<Entry<String,String>> set=map.entrySet();
		Iterator<Entry<String,String>> ite=set.iterator();
		while(ite.hasNext()){
			Entry<String,String> entry =ite.next();
			System.out.println("key:"+entry.getKey());
			System.out.println("value:"+entry.getValue());
		}
		
	}
}