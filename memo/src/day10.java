
public class day10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 20180221



package com.bit.am;
/*
 * INT long double(�����ڷ���,�����ڷ���)
 * 
 * ����Ŭ����
 * ù���ڸ� �빮�ڷ� �ٲٸ� ����Ŭ����
 * 
 *
public class Ex01 {

	public static void main(String[] args) {
		// INT �� ��ü�� Integer
		int a;
		a=100;
		int b;
		b=200;
		int c=a+b;
		System.out.println(c);
		System.out.println("-----------------------");
		Integer x=10; //���䷦��
		Integer y=20;
		Integer z=x+y;
		System.out.println(z);
		System.out.println("-----------------------");
		Integer a1=new Integer(1000);
		Integer a2=new Integer(2000);
		Integer a3=new Integer(1000+2000);
		System.out.println(a3);
		System.out.println("-----------------------");
	}

}


package com.bit.am;

public class Ex02 {
/*
 * Integer ������ ���ڸ� ����
 * ���ڿܿ� ���Ұ�
 * 
 *
	public static void main(String[] args) {
		Integer a1=new Integer(1);
		Integer a2=new Integer("2");
		Integer a3=3;//���䷦�� �������������� ����� �ȵȴ�.
		int a4=a1+a2;//����
		Integer a5=a1+a2;//����� ���ؼ� ����(��ü�� ���ڷ� ��ȯ) ����� �ٽ� ���䷦�ε�
		
		System.out.println(a1+a2+a3);
		//�Ӽ� ����
		System.out.println(Integer.MIN_VALUE);//���� ������ �ʴ� ����� ����
		System.out.println(Integer.MAX_VALUE);//static �̴�.
		System.out.println(a1.MAX_VALUE);
		System.out.println(a1.SIZE);
		System.out.println("-----------------------");
		//��� �޼��� static
		System.out.println("parseInt-----------");
		String su1="1234";
		System.out.println(su1+1);
		int result1=Integer.parseInt(su1);// ���ֻ�� ���ڿ� -> ����  �ٲٴ� ���
		System.out.println(result1+1);    // INT �� �������� parseInt ���
		System.out.println("valueOf--------------");
		Integer result2=Integer.valueOf(su1);//Integer �� �������� valueOf ���
		System.out.println(result2+1);//
		Integer result3=Integer.valueOf(100);//int�� �޾Ƽ� Integer�� ���䷦��
		System.out.println("�������--------------");
		int su=10;
		System.out.println("2����"+su+":"+Integer.toBinaryString(su));//
		System.out.println("8����"+su+":"+Integer.toOctalString(su));
		System.out.println("16����"+su+":"+Integer.toHexString(su));
		
		
		System.out.println("-------------------------------");
		Integer b1=new Integer(101);
		Integer b2=new Integer(101);
		System.out.println("��ü�� �� �ּҰ�");
		System.out.println(b1==b2);
		System.out.println("������ ��");
		System.out.println(b1.equals(b2));
		System.out.println(Integer.valueOf(b1)==Integer.valueOf(b2));
		System.out.println("-------------------------------");
		System.out.println("���ڸ� ���ڷ�");
		int c1=3;
		Integer c2=new Integer(c1);
		System.out.println("�տ� ��ĭ�� ����");
		System.out.println(""+c1+1);
		System.out.println("toStirng���� ����");
		System.out.println(c2.toString()+1);
		System.out.println("-------------------------------");
		
		
	}

}


�޼���
parseXXX ���ڿ��� �ش� Ÿ������ ������
valueOf
equals
toString
doubleValue()
-------------------------------------------
�迭�� ����
package com.bit.pm;
/*
 * �迭 -> ��ü
 * ������ - ��������
 * arr1.length ����ʵ带 ���
 * 
 * 
 *
public class Ex01 {

	
	public static void main(String[] args) {
		
		int[] arr1=new int[5];
		
		arr1[0]=100;
		arr1[1]=200;
		arr1[2]=300;
		arr1[3]=400;
		arr1[4]=500;
		System.out.println("�迭�� ����- ���� ����");
		System.out.print("arr1:");
		for(int i=0;i<arr1.length;i++){//length  ��ȣ�� �����Ƿ� �޼��尡 �ƴ� �ʵ�
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		int[] arr2=arr1;
		System.out.print("arr2:");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		
		arr1[2]=2333;
		System.out.print("arr1:");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.print("\narr2:");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("�迭�� ����- ���� ����");
		
		int[] arr3;//��ü �迭�� �����ϰ�
		arr3=new int[arr1.length];//����ũ��� ����
		
		for(int i=0;i<arr1.length;i++){
			arr3[i]=arr1[i];
		}
		arr3[1]=2;
		System.out.print("arr1:");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.print("\narr3:");
		for(int i=0;i<arr3.length;i++){
			System.out.print(arr3[i]+" ");
		}
		System.out.println("\n--------------------------");
		System.out.println("arr1==arr2 "+(arr1==arr2));
		System.out.println("arr1==arr3 "+(arr1==arr3));

	}

}



//�迭�� ���� ����
		//1.
		int[] arr1={1,3,5,7};
		int[] arr2=new int[arr1.length];
		for(int i=0;i<arr2.length;i++){
			arr2[i]=arr1[i];
		}
		//2.
		int[] arr3=new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, arr3.length);
	//System.arraycopy(����-������, ���� index, ���, ���� index, �����Ұ���);
		for(int i=0;i<arr3.length;i++){
			System.out.print(arr3[i]+" ");
		}




//���߹迭

package com.bit.pm;


public class Ex04 {

	public static void main(String[] args) {
		int[] arr=null;
		arr=new int[5];
		arr[1]=2;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		//���߹迭
		int[][] arrs=new int[2][3];
		arrs[0]=new int[3];
		arrs[1]=new int[3];
		
		arrs[0][0]=11;
		arrs[0][1]=22;
		arrs[0][2]=33;
		arrs[1][0]=44;
		arrs[1][1]=55;
		arrs[1][2]=66;
		for(int i=0;i<arrs.length;i++){
			for(int j=0;j<3;j++){
				System.out.print(arrs[i][j]+" ");
			}
				System.out.println();
		}
		
		int[][] arrs1={
				{11,22,33},
				{44,55},
				{77,88,99}
				
		};
		int[][] arr2=new int[3][];**********************
		arr2[0]=new int[]{11,22,33};********************
		arr2[1]=new int[2];*****************************
		arr2[2]=new int[3];*****************************
		
	}

}


		 */
	}

}
