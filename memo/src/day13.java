/* ��Ű��
 * ����Ʈ - ������ ������ Ŭ������ ������ ã��
 * 			����) �ش���Ű��&&java.lang.~����
 * 
 * 
 * 
 */
import java.util.Scanner;

public class day13 {
	/*
	 * Ŭ����(��������,������,�޼���)
	 * ��������
	 * ������ - ��ü �����ÿ� ������ ���� - �ʵ� �ʱ�ȭ
	 * default - ���ڰ� ���� ������
	 * �޼���
	 * non-static(������)/static(����)
	 * static caseBycase
	 * 	
	 */
	public static void main(String[] args) {
		/*
		 * 20180226
		 * 
		 * 	public Ex01(){
		//		super();
				this("");//���� �����ڸ� ȣ��
				System.out.println("Ex01");
				this.func01();
			}
			public Ex01(String st){
		//		super();
				System.out.println("Ex01(asdf)");
			}
			
			public static void main(String[] args) {
				com.bit.am.Scanner sc=new com.bit.am.Scanner();
				Scanner sc2=new Scanner(System.in);
				Ex01 me=new Ex01();
				me.func01();
			}
		
			public void func01(){
				this.func02(); //���������� ������ ������ this�� �����Ǿ
			}
			
			public void func02(){
				
			}
			
		}
		 * 
		 * 
		 * class : public || default
		 * ������,����,�޼��� : public || protected || default || private
		 * 
		 * class Lec03{
				//������ ���� - �̱��� ����
				private static Lec03 you=null;
				
				private Lec03(){
				}
				
				public static Lec03 func01(){
					if(you==null){
						you=new Lec03();
					}
					return you;
				}
				
			}
		 * 
		 * 
		 * 
		 * 
		 * 
		 * abstract class Lec08{
				//�߻�Ŭ����
				// - �߻�޼��带 0�� �̻�~
				// �߻�޼��带 �Ȱ������� �ִ�
				int su=1234;
				public Lec08(){
					System.out.println("Lec08 ������");
				}
				
				public void func01(){
					System.out.println("Lec08 func01 run");
				}
				
				public abstract void func02();
			}
		 * 
		 * 
		 * 
		 * abstract class Lec08{
	//�߻�Ŭ����
	// - �߻�޼��带 0�� �̻�~
	// - ������ ��ü�� �����Ұ� **************
	// - ��ӹ޴� ������ �߻�޼��带 �����ؼ� ���
	// �߻�޼��带 �Ȱ������� �ִ�
	// �߻�Ŭ������ ���
	// 1. ����Ŭ������ �߻�Ŭ������ �Ǿ� �߻�Ŭ������ ���
	// 2. �߻�޼��带 �������̵�(- ��ӹ޴� ������ �߻�޼��带 �����ؼ� ���)
	//  - ��ӹ޴� ������ ����� �����ؼ� ����� �� �ִ�
				int su=1234;
				public Lec08(){
					System.out.println("Lec08 ������");
				}
				
				public void func01(){
					System.out.println("Lec08 func01 run");
				}
				// �߻�޼���
				public abstract void func02();
			}
			
			public class Ex08 extends Lec08{
			
				/*
				 * ���
				 *
				public Ex08(){
					super();
					System.out.println("Ex08 ������");
				}
				
				public static void main(String[] args) {
					Lec08 me= new Ex08();
					me.func01();
					me.func02();
				}
				
				public void func02(){
					System.out.println("Ex08 override func02");
				}
			}
		 * 
		 * 
		 * 
		 ******************* ����ó��
		 * 
		 * Scanner sc= new Scanner(System.in);
			try{
				try{
					int su=5/sc.nextInt();
				}catch(java.util.InputMismatchException ex){
					System.out.println("�����Է��� �ƴ�");
				}
			} catch(Exception ex){
				System.out.println("�����߻�");
			}
		 * 
		 * 
		 * 
		 * 
		 * 
			// �������� ����Ŭ����
			class MyErr extends Exception{
				public MyErr(){
					super("2~9���� ���� �ƴ�");
				}
			}
			
			public class Ex05 {
			
				public static void main(String[] args) throws MyErr {
					
					int su=0;
					try{
					gugudan(su);
					}catch(MyErr ex){
			//			System.out.println(ex.getMessage());
						ex.printStackTrace();
					}
					
			
				}
			
				public static void gugudan(int su) throws MyErr{
					if(su>1 && su<10){
						for(int i=1;i<10;i++){
							System.out.println(su+"x"+i+"="+(su*i));
						}			
					}else{
						MyErr err=new MyErr();
						throw err;
					}
				}
				
			}

		 * 
		 * 
		 * 
				class Lec08{}
			
			interface Inter01{
				// ���� �߻�޼��常 ����(��, ����� ������ ����)
				// �������̽��� ���߻�� ���(���߻��ó��)
				int sum=100;
				
				public void func01();// �������̽��� �߻�޼���� public 
				void func02(int a);// �����ص� public
			}
			
			interface Inter02{
				void func03();
			}
			interface Inter03 extends Inter02,Inter01{
				int sum=200;
				void func03();
			}
			interface Inter04{
				//��ӹ޴� Ŭ������ ��üȭ
			}
			public class Ex08 extends Lec08 implements Inter01,Inter03,Inter04 {
			
				public static void main(String[] args) {
					
					
				}
			
				public void func01(){
					
					System.out.println();
				}
				
				public void func02(int a){
					
				}
				
				public void func03(){
					
				}
			}
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
