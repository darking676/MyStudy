/*
Q1. 2��1�� 2��2�� 2��3�� 2��4�� 2��5���� ����ϼ���
	-> 2 4 8 16 32
Q2. 1~50������ ���� while������ ����Ͻÿ�
	-> 1~50�� �� �հ�� XXXX�Դϴ�.
Q3. 1,2,3,4,5,6,7,8,9,10�� ����Ͻÿ�

Q4. ������ 7���� while������ ����Ͻÿ�

Q5. while������ �������� ����Ͻÿ�
*/
class Ex02{

  public static void main(String[] args){

	//Q1. 2��1�� 2��2�� 2��3�� 2��4�� 2��5���� ����ϼ���
	System.out.println("Q1. 2��1�� 2��2�� 2��3�� 2��4�� 2��5���� ����ϼ���");
	int a=1;
	while(a<32){
		System.out.print(a*2+" ");
		a=a*2;
		/*	a=2  �������� �ϴ� ���
			a=a+a
			2+2=4
			4+4=8
			8+8=16
			16+16=32

		*/
			
	}//while end
	System.out.println();

	//Q2. 1~50������ ���� while������ ����Ͻÿ�
	System.out.println("Q2. 1~50������ ���� while������ ����Ͻÿ�");
	int j=1;
	int sum=0;
	boolean result2=true;
	while(result2){
		sum=sum+j;
		j++;
		if(j==51){
			result2=false;
		}
	}
	System.out.println(sum);

	//Q3. 1,2,3,4,5,6,7,8,9,10�� ����Ͻÿ�
	System.out.println("Q3. 1,2,3,4,5,6,7,8,9,10�� ����Ͻÿ�");
	int c=0;
	while(c<9){
		c++;
		System.out.print(c+",");
		
	}
	System.out.println("10\n");
	
	//Q4. ������ 7���� while������ ����Ͻÿ�
	int q4=1;
	while(q4<10){
		System.out.println("7X"+q4+"="+q4*7);
		q4++;
	}
	System.out.println();
	//Q5. while������ �������� ����Ͻÿ�
	int q5a=2;
	int q5b=1;
	while(q5b<10){
		while(q5a<10){
			System.out.print(q5a+"X"+q5b+"="+q5a*q5b+"\t");
			q5a++;
		}
		q5a=2;
		q5b++;
		System.out.println();
	}

  }//main end

}//class end