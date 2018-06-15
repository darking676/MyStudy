package com.bit.pm;

import java.lang.annotation.ElementType;

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

class Box<T>{//���׸� - T (Type) E(element) K(key) V(value)
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
