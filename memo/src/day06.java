
public class day06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 20180213

void�ڸ��� int�� return���� �޾Ƽ� ����� �� �ִ�.

class Ex22{
  public static void func01(){
	System.out.println("22Ŭ������ func01 run");
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
	/*
	Ex02 me2;��������
	me2=new Ex02(); ��ü ����
	me2.func02();
	*

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



�޼���ȭ�� ���� ��ȭ�� ��Ű�� �ٸ� ������Ʈ������ ��밡��

�ҽ��ڵ带 ������ ���°��� �ƴ϶� Ŭ���� ���������� ���� ����



java���Ͼ� 2���� Ŭ������ �ְ� �������� �ϸ� class������ 2���� �����.

---------------------------------------------------------------------

-----------------
Ŭ����(static,core,���...)
-----------------
����
-----------------
��(��ü)
-----------------
Game me;
me=new Game() ��ü�� ����� �� ������ ����.

not-static�� ����ϱ� ���ؼ��� ����ȭ�� �ʿ�

jvm�� ��ü�� �־ ������� �ʴ´ٸ� ���ֹ���.
jvm�� �޸𸮰����� �ϴ� ������ ���������� ��ü�� ������ ������ ����


not-static�� static
static�� �ʱ� ���۽� �ӵ��� ������ ���Ŀ��� ������. �׻� ���� �޸𸮸� ������ ����. 



/*
static -> static : (Ŭ������).�޼����();
static -> non-static : ��ü ���� �� ���������� ���� ����
                       ex)��������=��ü����; ��������.�޼���();
non-static -> satic : (Ŭ������).�޼����();
non-static -> non-static : ��ü ���� �� ���������� ���� ����
                       ex)��������=��ü����; ��������.�޼���();
*/
		 

	}

}
