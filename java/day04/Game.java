/*
���������� ����(ver 0.0.1)
1.���� 2.���� 3.��>>>1
��� : ����
��ǻ�� : ��
��� : �̰��
����ϰڽ��ϱ�?
1.��� 0����
���� 0�� 0�� 0��
�̿����ּż� �����մϴ�.
*/
class Game{

  public static void main(String[] args){

	int con=1;
	int win=0;
	int lose=0;
	int draw=0;
	while(con==1){

	//���������� �Է¹ޱ�
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
	//���������� �Է�end	

	//��ǻ�Ͱ� �� ����������
	int com=(int)(Math.random()*3)+1;
	String comA;
	if(com==1){
		comA="����";
	} else if(com==2){
		comA="����";
	} else {
		comA="��";		
	}
	//��ǻ�� ���������� end

	//��� ���� if��
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
	//��� ���� if�� end

	//��� ���
	System.out.println("��� : "+userA);
	System.out.println("��ǻ�� : "+comA);
	System.out.println("��� : "+resultA);
	System.out.print("����Ͻðڽ��ϱ�?(1.��� 0.����)>>");
	//��� ��� end
	
	//�̿�����
	do{
		con=sc.nextInt();
		if(con<0||con>1){
			System.out.println("�ٽ��Է����ּ���");
		}
	}while(con<0||con>1);
	//�̿����� end

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
	}//while end

	//����ȳ���
	System.out.println("���� "+win+"��"+draw+"��"+lose+"��");
	System.out.println("�̿����ּż� �����մϴ�.");

	//����ȳ��� end
  }//main end

}//class end