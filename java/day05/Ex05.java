class Ex05{

  public static void main(String[] args){
	System.out.println("main start");
	//�ڹ��� �⺻����
	//�ڹ��� �⺻ ���
	//�޼���
	int su=func02();
	func01(100,1);
	System.out.println(su);
	System.out.println("main end");
  }//main end
/*�޼��� ����
public static [�ڷ���||void] �޼����̸�(����){���๮;}



*/
  public static void func01(int b,int c){
	System.out.println(b+c+" func01 run..");
	//return; �����ȴ�.
  }

  public static int func02(){
	int x=1234;
	int y=4321;
	int z=x+y;
	return z;
  }


}//class end