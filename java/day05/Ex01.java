class Ex01{

  public static void main(String[] args){//�޼���

	int a=100;
	a=102;
	a=10;
	a=012;// 8����
	System.out.println("8����"+a);
	a=0xd;
	System.out.println("16����"+a);
	a=0xa;
	System.out.println("16����"+a);
	//������ ���� : �ڷ��� ������;
	//�ʱ�ȭ(���� ���� ����) : ������=��;
	//��: 10���� ����
	//byte
	//short
	//int
	//long
	//��: �Ǽ�
	//float
	//double
	double b1=1.0000000001;
	double b2=1.00000000002;
	double b3=b1+b2;
	System.out.println(b3);

  }

}