class Ex07{

  public static void main(String[] args){

	//����
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.print("ù��° ��:");
	int a=sc.nextInt();
	System.out.print("�ι�° ��:");
	int b=sc.nextInt();
	System.out.print("1.���ϱ� 2.���� 3.���ϱ� 4.������");	
	int c=sc.nextInt();

	switch(c){
		case 1:
			plus(a,b);
		break;
		case 2:
			minus(a,b);
		break;
		case 3:
			multi(a,b);
		break;
		case 4:
			div(a,b);
		break;

	}//switch end

  }//main end

  public static void plus(int x,int y){
	System.out.println(x+"+"+y+"="+(x+y));
  }//plus end

  public static void minus(int x,int y){
	System.out.println(x+"-"+y+"="+(x-y));
  }//minus end

  public static void multi(int x,int y){
	System.out.println(x+"*"+y+"="+(x*y));
  }//multi end

  public static void div(int x,int y){
	System.out.println(x+"/"+y+"="+(x/y));
  }//div end

}//class end