
public class day29 {

	/*
	 * 
	 * 
	 * ���������� ����Ŭ db�� �������
	 * 
	 * unzip -q orc~~~~
	 * 
	 * yum install libaio bc flex �� ��ġ�� �ؾ���
	 * �ּһ���� �޸�2g�� �÷�����
	 * 
	 * cd Disk1
	 * rpm -i  orc~~~~
	 * 
	 *  /etc/init.d/oracle-xe configure
	 *  ���� ��Ʈ
	 *  ���� ��������Ʈ
	 *  �ý����� ��й�ȣ
	 *  ���ý� ��� ų������ y
	 *  
	 *   /u01/~~?~/~/~/~/bin/~.env.sh
	 * 
	 * cd /u01/app/oracle/
	 * . /u01/app/oracle/product/11.2.0/xe/bin/oracle_env.sh
	 * sqlplus
	 * connect system/oracle �Է�
	 * 
	 * //////////////////////////////
	 * �ȵǼ� �����쿡�� ����Ŭdb��ġ
	 * ���� 2�� ���� ����Ŭ ��ġ, scott
	 * 
	 * 
	 * cmd run..
	 * 
	 * 	sql ������/��й�ȣ  scott/tiger
	 * 
	 * ���̺� ��
	 * desc ���̺��;
	 * 
	 * 1.�������-select ��
	 * select * from ���̺��;
	 * select �÷���,�÷��� from ���̺��;
	 * �÷� as ��Ī,�÷� as ��Ī ����
	 * select all �÷��� from ���̺��; 
	 * select distinct �÷��� from ���̺��; �ߺ����� �ѹ��� 
	 * select * from ���̺�� where ����
	 * where <> ^= != not������
	 * 
	 * sql���� and �� or���� �켱������ ����
	 * 
	 * in ����
	 * like ����ã�� ���ϵ�% like '___D';
	 * select ename from emp where ename like '%A%';
	 * % �ƹ��ų� 0���̻� _ �ƹ��ų� �ϳ��� ����
	 * 
	 * null�� ��ü�ϴ� is null / is not null
	 * select ename, comm from emp where com is null;
	 * null �� ������ ���ڵ� ������ ���Ѵ�.
	 * 
	 * select * from emp where ���� order by �÷�
	 * 
	 * select * from emp order by �÷���; ��������/
	 * select * from emp order by �÷��� asc/desc;/
	 * 
	 * 2. �߰�insert
	 * insert into ���̺�� (�÷�,�÷�) values(��,��);
	 * insert into ���̺�� values(��,��);
	 * 
	 * 3.�������� ���� delete
	 * delete from ���̺�� where ����;
	 * 
	 * 4.�������� ���� update
	 * update  ���̺�� set �÷���=��,�÷���=��... where ����;
	 * 
	 * 
	 * 
	 * ���̺� ����
	 * create table ���̺��(�÷��� �ڷ���,..);
	 * create table ���̺��(
	 * �÷��� �ڷ���,
	 * �÷��� �ڷ���,
	 * ...
	 * );
	 * �ڷ���
	 * ���� - number, number(�ڸ���),number(��ü�ڸ���,�Ҽ����ڸ���)
	 * ���ڿ� - char,varchar2(����) /mysql�� varchar�� ���� ����Ŭ�� ������ ������� ����
	 * ��¥ - date
	 * 
	 * truncfate table ���̺��;
	 * ���̺� �߸� ������ �߸�
	 * 
	 * drop table ���̺��;
	 * ���̺� ����
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
