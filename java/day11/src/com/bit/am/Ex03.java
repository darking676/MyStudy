package com.bit.am;

class Mother01{
	public void func03(){
		System.out.println("�ܼҸ��� �Ѵ�");
	}
}


class Father01{
	int money=1000;
	
	
	public void func01(int money){
		this.money+=money;
		System.out.println(money+"���� �����-����"+this.money);
	}
	
}

class Son01 extends Father01{
	//�޼��� �����ε�
	public void func01(){
		System.out.println("������ ����ϴ�");
	}
	//�޼��� �������̵�
	public void func01(int money){
		System.out.println(money+"�� ���� ����ϴ�");
	}
	
	public void func02(int money){
		this.money-=money;
		System.out.println("���� ����"+this.money);
		
	}
	
}



public class Ex03 {
	
	public static void main(String[] args) {
		//���
		/* �ڽ� Ŭ���� extends �θ�Ŭ����
		 * ��, ���� ���(���߻�ӺҰ�)
		 * ����� �������� ������ �ȹ��� ���� �ִ�.�������̵�
		 * 
		 */
		Father01 fa=new Father01();
		fa.func01(1000);
		System.out.println(fa.money);
		System.out.println("---------------------------------");
		Son01 son=new Son01();
		son.func02(500);
		System.out.println(son.money);
		son.func01();
		son.func01(1000);
		System.out.println("�Ƶ�"+son.money);
		System.out.println("�ƺ�"+fa.money);
	}

}
