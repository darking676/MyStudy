/*
use not-static method
����������

*/

class Ex04{
  public static void main(String[] args){
	
	Ex04 me=new Ex04();
	me.flow();
	
  }//main end

  public void flow(){
	int con=1;
	int win=0;
	int lose=0;
	int draw=0;
	while(con==1){

		Ex04 me=new Ex04();
		int user=me.input();
		int com=me.com();
		int result=me.compare(user,com);
		String resultA=me.compareKo(result);
		con=me.output(user,com,resultA);

		//����
		switch(result){
			case 3:	
				win+=1;
			break;
			case 2:
				draw+=1;
			break;
			case 1:
				lose+=1;
			break;
		} //���� end
		System.out.println("----------------------------------");
	}
	
	//����ȳ���
	System.out.println("���� "+win+"��"+draw+"��"+lose+"��");
	System.out.println("�̿����ּż� �����մϴ�.");
	//����ȳ��� end

  }


  //���������� �Է¹ޱ�
  public int input(){
	System.out.println("���������� ����(ver 0.0.1)");	
	System.out.print("1.���� 2.���� 3.��>>>");
	java.util.Scanner sc=new java.util.Scanner(System.in);
	int user;
	do{
		user=sc.nextInt();
		if(user>3||user<1){
			System.out.println("�ٽ��Է����ּ���");
		}
	}while(user>3||user<1);
	String userA;
	if(user==1){
		userA="����";
	} else if(user==2){
		userA="����";
	} else {
		userA="��";		
	}
	return user;
  }//���������� �Է�end

  //��ǻ�Ͱ� �� ����������
  public int com(){
	int com=(int)(Math.random()*3)+1;
	String comA;
	if(com==1){
		comA="����";
	} else if(com==2){
		comA="����";
	} else {
		comA="��";		
	}
	return com;
  }//��ǻ�� ���������� end

  //��� ���� if�� SU
  public int compare(int user,int com){
	int result=0;
	if(user==1){
		if(com==2){
			result=1;
		} else if(com==3) {
			result=3;
		} else {
			result=2;
		}
	} else if(user==2){
		if(com==1){
			result=3;
		} else if(com==3) {
			result=1;
		} else {
			result=2;
		}
	} else if(user==3){
		if(com==2){
			result=3;
		} else if(com==1) {
			result=1;
		} else {
			result=2;
		}
	} //if end
	return result;
  }//��� ���� end

  //��� ���� if�� KOR
  public String compareKo(int result){
	String resultA="";
	switch(result){
		case 1:
			resultA="����.";
		break;
		case 2:
			resultA="����.";
		break;
		case 3:
			resultA="�̰��.";
		break;
	}
	return resultA;
  }//��� ���� end

  //��� ���
  public int output(int user,int com,String resultA){

	String userA;
	if(user==1){
		userA="����";
	} else if(user==2){
		userA="����";
	} else {
		userA="��";		
	}

	String comA;
	if(com==1){
		comA="����";
	} else if(com==2){
		comA="����";
	} else {
		comA="��";		
	}

	System.out.println("��� : "+userA);
	System.out.println("��ǻ�� : "+comA);
	System.out.println("��� : "+resultA);
	System.out.print("����Ͻðڽ��ϱ�?(1.��� 0.����)>>");
	java.util.Scanner sc=new java.util.Scanner(System.in);

	//�̿�����
	int con;
	do{
		con=sc.nextInt();
		if(con<0||con>1){
			System.out.println("�ٽ��Է����ּ���");
		}
	}while(con<0||con>1);
	//�̿����� end

	return con;
  }
  //��� ��� end

}//class end
