class Ex02{

  public static void main(String[] args){

	byte a=100;
	byte b=27;
	byte d=127;
	d++;
	int c=a+b;//byte�� byte�� ���ϸ鼭 int�� ����ȯ�� �Ǿ��� byte�� ��������
		   //������ ��.
	System.out.println(a+b);
	System.out.println("c�� ����ϸ� ������������ a+b�� int������ ���");
	System.out.println(d);
	
	byte f=126;
	//a=a+1; = a++; ���� ���� ǥ���̴�.  
	System.out.println(f);
	f++;
	System.out.println(f);
	f++;	
	System.out.println(f);
	f++;	
	System.out.println(f);

	long g=214654654654L;
	System.out.println(g);

	float h=214654654654F;
	System.out.println(h);

	char aa='A'; //char aa=''; ���� ����ִ� ���ڴ� ���X
	String ab=""; //String ab=""; ��� ���ڿ��� ���
	System.out.println(aa+1-1);
	char ac='\n'; 	
	System.out.println(ac+1-1);
	char ad='\uAC00'; 	
	System.out.println(ad+1-1);
	int ae='\uAC00'; 	
	System.out.println(ae);
	
	byte ba=1;
	short bb=ba;
	int bc=bb;
	long bd=bc; 	
	System.out.println(bd);

	long ca=128L;
	int cb=(int)ca;
	short cc=(short)cb;
	byte cd=(byte)cc;
	System.out.println(cd);
		

  }

}