/* �������� ���α׷�
kor=95
eng=69
math=87
............
��� ���
�հ� : XXX
��� : XX.XX
���� : A����
............
������ ���
A���� : ��� 90�̻�
B���� : ��� 80�̻�
C���� : ��� 70�̻�
D���� : ��� 60�̻�
F���� : ��� 60�̸�
*/
class Ex07{

  public static void main(String[] args){
	int kor=95;
	int eng=69;
	int math=87;
	int sum=0;
	double avg=0;
	char igrade,sgrade;

	sum=kor+eng+math;
	avg=sum*100/3/100.0;

	igrade='0';
//if��
	if(avg>=90){
		igrade='A';
	} else if(avg>=80){
		igrade='B';
	} else if(avg>=70){
		igrade='C';
	} else if(avg>=60){
		igrade='D';
	} else {
		igrade='F';
	} //if end
//switch��
	switch((int)avg/10){
		case 10:
		case 9:
			sgrade='A';
		break; 
		case 8:
			sgrade='B';
		break;
		case 7:
			sgrade='C';
		break;
		case 6:
			sgrade='D';
		break;
		default:
			sgrade='F';
		break;
	} //switch end
//���
	System.out.println("...............");
	System.out.println("if��� ���");
	System.out.println("�հ� :"+sum);
	System.out.println("��� :"+avg);
	System.out.println("���� :"+igrade+"����");
	System.out.println("...............");
	System.out.println("...............");
	System.out.println("switch��� ���");
	System.out.println("�հ� :"+sum);
	System.out.println("��� :"+avg);
	System.out.println("���� :"+sgrade+"����");
	System.out.println("...............");

  } //main end

} //class end