/*
----------------------------
bankCD
----------------------------
1.�Ա� 2.��� 3.�ܾ׺��� 0.����>>>3
���� ��>0��

1.�Ա� 2.��� 3.�ܾ׺��� 0.����>>>2
�����>500
�ܾ��� �����մϴ�.

1.�Ա� 2.��� 3.�ܾ׺��� 0.����>>>1
�Աݾ�>1000

1.�Ա� 2.��� 3.�ܾ׺��� 0.����>>>3
�ܾ�>1000

1.�Ա� 2.��� 3.�ܾ׺��� 0.����>>>2
�����>500

1.�Ա� 2.��� 3.�ܾ׺��� 0.����>>>3
�ܾ�>500

1.�Ա� 2.��� 3.�ܾ׺��� 0.����>>>0
*/
class Ex09{

  public static void main(String[] args){
	System.out.println("----------------------");
	System.out.println("       Bacnk CD");
	System.out.println("----------------------");
	java.util.Scanner sc=new java.util.Scanner(System.in);
	Ex09 me=new Ex09();
	me.show();
  }//main end
	
  public void show(){
	long myAccount=0;
	Ex09 me2=new Ex09();
	int con=1;
	while(con!=0){
		System.out.print("\n1.�Ա� 2.��� 3.�ܾ׺��� 0.����>>>");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		con=sc.nextInt();
		switch(con){
			case 1:
				myAccount=me2.insert(myAccount);
			break;
			case 2:
				myAccount=me2.out(myAccount);
			break;
			case 3:
				me2.check(myAccount);
			break;
			case 0:
				System.out.println("�̿����ּż� �����մϴ�.");
			break;
			default :
				System.out.println("�ٽ� �Է����ּ���");
			break;
		}//switch end
	}//while end
  }//show end

  public long insert(long money){
	System.out.print("�Աݾ�>");
	java.util.Scanner sc=new java.util.Scanner(System.in);
	long su=0;
	su=sc.nextLong();
	while(su<1){
		System.out.println("�ٽ� �Է����ּ���");
		su=sc.nextLong();
	}
	money=money + su;
	return money;
  }

  public long out(long money){
  	System.out.print("��ݾ�>");
	java.util.Scanner sc=new java.util.Scanner(System.in);
	long su=0;
	su=sc.nextLong();
	while(su>money){
		System.out.println("�ܾ��� �����մϴ�.");
		su=sc.nextLong();
	}
	money=money - su;
	return money;
  }

  public void check(long money){
	System.out.println("�ܾ׺���>"+money);
  }

}//class end