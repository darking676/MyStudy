



public class day15 {

	public static void main(String[] args) {
		/*
		 *package com.bit.am;
			
			import java.util.InputMismatchException;
			import java.util.Scanner;
			
			/*
			 * -------------------------------------------------
			 * MyBBS�Խ��� (ver0.0.1)
			 * -------------------------------------------------
			 * 1.��� 2.�۾��� 3.�ۻ���>2
			 * ����>test1
			 * ����>test
			 * 
			 * 1.��� 2.�۾��� 3.�ۻ���>1
			 * ------------------
			 * ���� | ����
			 * ------------------
			 * test1|������
			 * ------------------
			 * 
			 * 1.��� 2.�۾��� 3.�ۻ���>2
			 * ����>test2
			 * ����>test
			 * 
			 * 1.��� 2.�۾��� 3.�ۻ���>1
			 * ------------------
			 * ���� | ����
			 * ------------------
			 * test1|������
			 * test2|asdf
			 * ------------------
			 * 
			 * 
			 * 
			 *
			public class Ex01 {
				
				static class Bbs{
					static int cnt;
					int num;
					String title;
					String content;
					
					public Bbs(){
						cnt++;
						num=cnt;
					}
				
				}
				
				static class MyArray{
					Object[] objs;
					public MyArray(){
						objs=new Object[0];
					}
					
					public void add(Object obj){
						Object[] temp=new Object[objs.length+1];
						for (int i = 0; i < objs.length; i++) {
							temp[i]=objs[i];
						}
						objs=temp;
						objs[objs.length-1]=obj;
					}
					
					public Object get(int index){
						return objs[index];
					}
					
					public int size(){
						return objs.length;
					}
				}
			
				public static void main(String[] args) {
					String bar="-------------------------------------";
					String title="MyBBS�Խ��� (ver0.0.1)";
					String titleH="�۹�ȣ\t|\t����\t|\t����";
					System.out.println(bar);
					System.out.println(title);
					System.out.println(bar);
					String menu="1.��� 2.�۾��� 3.�ۻ��� 0.����>";
					int input=-1;
					Scanner sc=new Scanner(System.in);
					Scanner sc2=new Scanner(System.in);
					MyArray arr= new MyArray();
					
					while(true){
						System.out.print(menu);
						try{
							input=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("���ڷ� �Է��ϼ���");
							sc=new Scanner(System.in);
						}catch(Exception ex){
							System.out.println("ġ���� ����");
						}
						if(input==0){
							System.out.println("�����մϴ�.");
							break;
						}else if(input==1){//���
							System.out.println(bar);
							System.out.println(titleH);
							System.out.println(bar);
							
			//				for (int i = 0; i < arr.size(); i++) {
			//					String[] bbs=(String[])arr.get(i);
			//					System.out.print(bbs[0]);
			//					System.out.print("\t\t|\t");
			//					System.out.println(bbs[1]);
			//					System.out.println(bar);
			//				}
							
							for (int i = 0; i < arr.size(); i++) {
								Bbs bbs=(Bbs)arr.get(i);
								System.out.println(bbs.num);
								System.out.print("\t|\t");
								System.out.print(bbs.title);
								System.out.print("\t|\t");
								System.out.println(bbs.content);
								System.out.println(bar);
							}
							
						}else if(input==2){//�Է�
							//String[]
			//				String[] bbs=new String[2];
			//				System.out.print("����>");
			//				bbs[0]=sc2.nextLine();
			//				System.out.print("����>");
			//				bbs[1]=sc2.nextLine();
			//				arr.add(bbs);
							//Object
							Bbs bbs=new Bbs();
							
							System.out.print("����>");
							bbs.title=sc2.nextLine();
							if(bbs.title.equals("")){
								bbs.title="�������";
							}
							System.out.print("����>");
							bbs.content=sc2.nextLine();
							if(bbs.content.equals("")){
								bbs.title="�������";
							}
							arr.add(bbs);
						}else if(input==3){//����
						
							
						}else{
							System.out.println("�Է��� �ٽ����ּ���");
						}
					}//while end	
				}//main end
				
				
				
				
				
				
			}
			 
		 * 
		 * 
		 * 
		 * 
		 * 
		 *package com.bit.am;
			
			class Node{
				//��ü�� �̿��� �����Ҵ�
				int val;
				Node node;
				
			}
			
			class MyLink{
				//��ü�� �̿��� �����Ҵ�
				int cnt;
				Node start;
				
				public MyLink(){
					
				}
			
				public int get(int idx){
					int su=0;
			//		//0
			//		su=start.val;
			//		//1
			//		su=start.node.val;
			//		//2
			//		su=start.node.node.val;
			//		
					Node temp=start;
					for (int i = 0; i < idx; i++) {
						temp=temp.node;
					}
					su=temp.val;
					return su;
				}
				
				public void add(int a){
					if(cnt==0){
						start=new Node();
						start.val=a;
						cnt++;
					}else{
						Node temp=start;
						while(true){
							if(temp.node==null){
								break;
							}
							temp=temp.node;
						}
			//			Node before=start;
			//			for (int i = 0; i < cnt; i++) {
			////				before=temp;
			//				temp=temp.node;
			//			}
						temp.node=new Node();
						temp.node.val=a;
						cnt++;
						
			//			start.node=new Node();
			//			start.node.val=a;				
					}
				}
			}
			
			class MyArr{
				//�迭�� �̿��� �����Ҵ�
				int[] arr;
				
				public MyArr(){
					arr=new int[0];
				}
				
				public void add(int a){
					int[] temp=new int[arr.length+1];
					System.arraycopy(arr, 0, temp, 0, arr.length);
					arr=temp;
					arr[arr.length-1]=a;
				}
				
				public int get(int idx){
					return arr[idx];
				}
			}
			
			public class Ex02 {
			
				 
				public static void main(String[] args) {
					MyArr arr1=new MyArr();
					arr1.add(111);
					arr1.add(222);
					arr1.add(333);
					for (int i = 0; i < arr1.arr.length; i++) {
						System.out.println(arr1.get(i));
					}
					
					MyLink arr2=new MyLink();
					arr2.add(111);
					arr2.add(222);
					arr2.add(333);
					arr2.add(444);
					arr2.add(555);
					for (int i = 0; i < 5; i++) {
						System.out.println(arr2.get(i));
					}
			//		System.out.println(arr2.get(1));
				}
			
			}

		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 *

			public class Ex02 {
			vector    Enumeration ��ü�� ���� vector�� �Ӽ����� ��ȯ
				public static void main(String[] args) {
					//�����Ҵ��� ���� �ڷᱸ��(vector)
					java.util.Vector vec01=new java.util.Vector();
					vec01.addElement("1111");
					vec01.addElement("1112");
					vec01.addElement("1113");
					vec01.addElement("1114");
					
					System.out.println("------------------------------");
					for (int i = 0; i < vec01.size(); i++) {
						System.out.println(vec01.elementAt(i));
					}
					System.out.println("------------------------------");
					java.util.Enumeration en=vec01.elements();
					System.out.println(en.hasMoreElements());
					System.out.println(en.nextElement());
					System.out.println(en.hasMoreElements());
					System.out.println(en.nextElement());
					System.out.println(en.hasMoreElements());
					System.out.println(en.nextElement());
					System.out.println(en.hasMoreElements());
					System.out.println(en.nextElement());
					System.out.println("------------------------------");
					vec01.removeElementAt(2);//����
					vec01.removeElement("1112");
					
					java.util.Enumeration ev=vec01.elements();
					
					for (int i = 0; i < vec01.size(); i++) {
						System.out.println(vec01.elementAt(i));
					}
					vec01.setElementAt("5555", 1);
					
					for (int i = 0; i < vec01.size(); i++) {
						System.out.println(vec01.elementAt(i));
					}
					
				}
			
			}

		 * 
		 * 
		 * 
		 * 
		 * package com.bit.pm;
			
			import java.util.HashSet;
			
			public class Ex04 {
			
			
				public static void main(String[] args) {
					//SET - ������ ����
					//������ ����
					//������ �����Ƿ� �ߺ��� ����.
					java.util.Set set01=null;
			//		HashSet set01 = new HashSet();
			//		set01=new java.util.HashSet();
					set01=new java.util.TreeSet();
					set01.add(1111);
					set01.add(2222);
					set01.add(3333);
					set01.add(4444);
					
					java.util.Iterator ite=set01.iterator();
					while(ite.hasNext()){
						System.out.println(ite.next());
					}
					
					
			
				}
			
			}

		 * 
		 * 
		 * 
		 */

	}

}
