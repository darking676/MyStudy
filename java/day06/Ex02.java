class Ex22{
  public static void func01(){
	System.out.println("22Ŭ������ func01 run");
  }

  public void func02(){
	System.out.println("22Ŭ������ non-static method run");
  }
} //22class end


class Ex02{

  public static void main(String[] args){
	int su=func01();	
	System.out.println(su+"-----------------");
	//Ex02.func01(); ���� �޼��嵵 �տ� Ŭ�������� �����ϰ� �ִ�.	
	//������ Ŭ���� �ȿ� �ֱ� ������ ����
	Ex02 me = new Ex02();//�������� = ��ü����
	su=me.func02(); // ���������� ����
	System.out.println("func02�� "+su);

	Ex22.func01();

	Ex22 me2=new Ex22();
	me2.func02();
	/*
	Ex02 me2;��������
	me2=new Ex02(); ��ü ����
	me2.func02();
	*/

  }//main end

  public static int func01(){
	System.out.println("static method run");
	return 0;
  }//func01 end

  public int func02(){//static�� �������� �������� �Ұ�,return�� ��������.
	System.out.println("non-static method run..");
	return 10;
  }//fucn02 end

}//02class end