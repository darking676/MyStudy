class Ex04{

  public static void main(String[] args){

	System.out.println("------------------------------");
	System.out.println("XXXX���α׷�");
	System.out.println("------------------------------");
	System.out.println("�޴��� �����ϼ���");
	System.out.print("(1.���� 2.�Է� 3.���� 0.����)");
	int input=0;
	System.out.println(input);
	if(input<0||input>3){
		System.out.println("�߸��Է��ϼ̽��ϴ�.");
	} else if(input<=1){
		System.out.println("���� ����");	
	} else if(input<=2){
		System.out.println("�Է� ����");	
	} else if(input<=3){
		System.out.println("���� ����");	
	} else if(input==0){
		System.out.println("���� ����");	
	}

	System.out.println("");

	int b=1;
	switch(b){
		
		case 1:
			System.out.println("1�Դϴ�.");
			break;
		case 2:
			System.out.println("2�Դϴ�.");
			break;
		case 3:
			System.out.println("3�Դϴ�.");
			break;
		case 4:
			System.out.println("4�Դϴ�.");
			break;
		case 5:
			System.out.println("5�Դϴ�.");
			break;
		case 6:
			System.out.println("6�Դϴ�.");
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		break;
	}
  }

}