class Ex09{

  public static void main(String[] args){
/*
	Q1. 1~10���� �� ¦���� ����Ͻÿ�
		-> 2 4 6 8
	Q2. 1~50������ �հ踦 ���Ͻÿ�
	
	Q3. ������ 7���� ����Ͻÿ�
		7X1=7
		...
*/	
	// Q1
	System.out.println("Q1. 1~10���� �� ¦���� ����Ͻÿ�");
	for(int i=2;i<=10;i+=2){
		System.out.println(i);
	} //for end
	for(int i=3;i<=10;i+=3){
		--i;
		System.out.println(i);
	}
	// Q2
	int sum=0;
	for(int i=1;i<=50;i++){
		sum=sum+i;
	} 		
	System.out.println("Q2. 1~50������ �հ踦 ���Ͻÿ�");
	System.out.println(sum);

	//Q3
	System.out.println("Q3. ������ 7���� ����Ͻÿ�");
	for(int i=1;i<=9;i++){
		int seven=7;
		System.out.println("7X"+i+"="+seven*i);
	} //for end

  } //main end

} //class end