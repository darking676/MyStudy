
public class day16 {


	public static void main(String[] args) {
		/* list, set, stack ,Queue
		 * 
				package com.bit.am;
			
			import java.util.ArrayList;
			import java.util.LinkedList;
			import java.util.List;
			import java.util.Vector;
			
			public class Ex01 {
			
			
				public static void main(String[] args) {
					//list ���� (CRUD�۾�)
					//- ������ ����
					//- �ߺ����
					List list1=new ArrayList();
					list1 = new LinkedList();
					list1 = new Vector();//vector �� add �� �ƴ϶� ������Ʈ�� �´�.
					list1.add(1111);
					list1.add(2222);
					list1.add(3333);
					list1.add(4444);
					list1.add(5555);//�߰�
					list1.set(2,3000);//����
					list1.remove(1);//����
					
					for (int i = 0; i < list1.size(); i++) {
						System.out.print(list1.get(i)+" ");
					}//����
					System.out.println("------------------------------");
			
				}
			
			}

		 * 
		 * 
		 * 
		 * package com.bit.am;
			
			import java.util.Stack;
			import java.util.Vector;
			
			public class Ex03 {
			
				
				public static void main(String[] args) {
					//����(LIFO) - a last in first out
					//���� O - ���� in ���� out
					//�ߺ����
					Stack stack01 = new Stack();
			
					stack01.add(11);
					stack01.add(22);
					stack01.add(33);
					stack01.add(44);
					stack01.add(22);
					stack01.add(33);
					System.out.println("stack size: "+stack01.size());
					for (int i = 0; i < stack01.size(); i++) {
						System.out.println(stack01.get(i));
					}
					System.out.println("--------------------------");
					stack01.push(11);//stack �Է�
					stack01.push(22);
					stack01.push(33);
					stack01.push(22);
					stack01.push(33);
					
					System.out.println(stack01.pop());//stack ���
					System.out.println("������� ��������"+stack01.peek());
					System.out.println(stack01.pop());
					System.out.println(stack01.pop());
					System.out.println(stack01.pop());
					System.out.println(stack01.pop());
					System.out.println("--------------------------");
					Vector stack02 = new Stack();
					stack02.add(11);
					stack02.add(22);
					stack02.add(33);
					stack02.add(44);
					stack02.add(22);
					stack02.add(33);
					System.out.println("stack size: "+stack02.size());
					System.out.println(stack02.remove(stack02.size()-1));
					System.out.println(stack02.remove(stack02.size()-1));
					System.out.println(stack02.remove(stack02.size()-1));
					System.out.println(stack02.remove(stack02.size()-1));
					System.out.println(stack02.remove(stack02.size()-1));
					System.out.println(stack02.lastElement());
				}
			
			}

		 * 
		 * 
		 * 
		 * 
		 * package com.bit.am;
			
			import java.util.Iterator;
			import java.util.Set;
			import java.util.HashSet;
			
			public class Ex02 {
			
				
				public static void main(String[] args) {
					//set
					//-������ ���� �ʰ�
					//-�ߺ����X
					Set set01=new HashSet();
					set01.add(1111);//�Է�
					set01.add(2222);//�Է�
					set01.add(3333);//�Է�
					set01.add(4444);//�Է�
					set01.add(5555);//�Է�
			//		set01. ������ ���� �� ����. �ᱹ ������ ���� �Է°� ����.
					set01.remove(3333);//����
					
					System.out.println("set size:"+set01.size());
					Iterator ite= set01.iterator();//����
					while(ite.hasNext()){
						System.out.print(ite.next()+" ");
					}
					System.out.println("\n-------------------------");	
				}
			
			}

		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * package com.bit.am;
			
			import java.util.LinkedList;
			
			public class Ex04 {
			
			
				public static void main(String[] args) {
					// ť(FIFO) - a first in first out;
					// ���� o - ���� in ���� out;
					// �ߺ� ��
					java.util.Queue que=null;
					que=new LinkedList();
					que.offer(111);
					que.offer(22);
					que.offer(33);
					que.offer(55);
					que.offer(22);
					que.offer(33);
					
					System.out.println("Queue size: "+que.size());
					System.out.println("���������: "+que.peek());
					System.out.println(que.poll());
					System.out.println(que.poll());
					System.out.println("���������: "+que.peek());
					System.out.println(que.poll());
					System.out.println(que.poll());
					System.out.println(que.poll());
					System.out.println(que.poll());

				}
			}

		 * 
		 * 
		 * 
		 * 
		 * 
		 * package com.bit.pm;
			
			abstract class Pen{
				protected String color;
					
				Pen(String color){
					this.color=color;
				}
				
			//	public void draw(){
			//		System.out.println(color+" ���� �ߴ´�.");
			//	}
				
				public abstract void draw();
			}
			
			class Ballpen extends Pen{
				
				Ballpen(String color){
					super(color);
				}
				
				public void draw(){
					System.out.println(color+" ���� ���� �ߴ�");
				}
			}
			
			class Pencil extends Pen{
				
				Pencil(String color){
					super(color);
				}
				
				public void draw(){
					System.out.println(color+" ����� ���� �ߴ�");
				}
			}
			
			//class Box{
			//	Object pen;
			//	
			//	public void push(Object pen){
			//		this.pen=pen;
			//	}
			//	
			//	public Object pull(){
			//		return pen;
			//	}
			//}
			
			class Box<T>{//���׸�
				T pen;
				
				public void push(T pen){
					this.pen=pen;
				}
				
				public T pull(){
					return pen;
				}
			}
			public class Ex01 {
			
				//��ü ���������� �����ϴ°� generic
				public static void main(String[] args) {
			//		Pen pen=new Pencil("������");
			//		Pen pen3=new Ballpen("������");
			//		Box box=new Box();
			//		Pencil pencil=new Pencil("����");
			//		box.push(pencil);
			//		
			//		Pencil pencil2=box.pull();
			//		pencil2.draw();
					//////////////////////////
			//		Box box=new Box();
			//		Ballpen ball=new Ballpen("����");
			//		box.push(ball);
			//		
			//		Pen pen=(Pen)box.pull();
			//		pen.draw();
			//		/////////////////////////
			//		Box box=new Box();
			//		box.push(1111);
			//		System.out.println(box.pull());
					//////////////////////////////
					Box<Pen> box=new Box<Pen>();
			//		Ballpen ball=new Ballpen("����");
					Pencil ball=new Pencil("����");
					box.push(ball);
					
					Pen pen=box.pull();
					pen.draw();
					
			
				}
			
			}
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
