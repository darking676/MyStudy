class Ex08{
/*
static -> static : (Ŭ������).�޼����();
static -> non-static : ��ü ���� �� ���������� ���� ����
                       ex)��������=��ü����; ��������.�޼���();
non-static -> satic : (Ŭ������).�޼����();
*/

  public static void main(String[] args){
	
	//Ex08.func01();	
	Ex08 me;
	me=new Ex08();
	System.out.println(me);
	me.func02();
	//me.func03();
	me.func03();	
	func01();
  }//main end

  public static void func01(){
	System.out.println("func01");
	Ex08 me3;
	me3=new Ex08();
	me3.func03();
  }//func01 end

  public void func02(){
	func03();
	func01();
	System.out.println("func02");
	
  }

  public void func03(){
	
	System.out.println("func03");
  }
}//class end