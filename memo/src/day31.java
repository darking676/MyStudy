
public class day31 {

	/*
	 * db
	 * ��Ű�� ��� desc emp;
	 * select instr('java','a',2,2) from dual;  /ã����/���۰�/(�ߺ���)���°
	 * select ename from emp where ename like'____';
	 * select ename from emp from where length(ename)=4;
	 * select ename from emp where instr(ename,'N')=length(ename);
	 * select lpad('oracle',20,'#') from dual;
	 * select rpad('oracle',20,'#') from dual;
	 * select rpad(lpad(1000,20/2,'#'),20,'#') from dual;
	 * select '                 abc            'from dual;
	 * select trim('      abc         ') from dual;
	 * select trim('a' from 'aaaaaaabbbbccccccaaaaaaaaa') from dual;
	 * select trim('#' from '#########1000#########') from dual;
	 * select sysdate from dual;
 	 * select sysdate - hiredate from emp;
	 * select trunc(sysdate - hiredate),sysdate,hiredate from emp;
	 * select sysdate+100 from dual;
	 * select add_months(sysdate,3) from dual;
	 * select next_day(sysdate,'������') from dual;
	 * select next_day(sysdate,1) from dual; /1�� ��
	 * select next_day(sysdate,7) from dual;/ 7�� ��
	 * select trunc(sysdate,'month')from dual; ���� ��
	 * select trunc(sysdate,'year')from dual; ���� ��
	 * select to_char(sysdate,'month mm dy hh:mi:ss')from dual;
	 * select to_char(sysdate,'hh:mi:ss')from dual;
	 * select to_char(sysdate,'pm hh:mi:ss')from dual;
	 * select to_date(20180808,'YYYYMMDD')-syksdate from dual;
	 * select to_date(20180808,'YYYY-MM-DD')-sysdate from dual;
	 * select ename,to_char(sal,'0,000') from emp; 0���� ǥ��
	 * select ename,to_char(sal,'9,999') from emp; ������ ��ǥ��
	 * select ename,to_char(sal,'s9,999.99') from emp; s�� ��ȣ 
	 * select to_number('$1,234','$9,999')+1 from dual;
	 * select to_char(3.145,'L9,999,999.99') from dual;
	 * select ename,sal,comm,sal+nvl(comm,0) as �Ѽ��ɾ� from emp;
	 * select deptno,nvl(loc,'����') from dept;
	 * 
	 * select empno,ename
		,decode(deptno,
			10,'����',
			20,'��õ',
			30,'����',
			40,'����') as ������
		from emp;
	 * 
	 * decode(�÷�,case1,value1,...) --���ڴ� 3���̻�, Ȧ��������
	 * 
	 * select empno,ename,
			case when deptno=10 then '����'
				when deptno=20 then '��õ'
				when deptno=30 then '����'
				when deptno=40 then '����'
			end as ������
		from emp;
	 * 
	 * 
	 * select ename,job,sal,decode(job,'CLERK',
	 * sal*1.05,'SALESMAN',sal*1.1,'MANAGER',sal*1.15,
	 * 'ANALYST',sal*1.2) as �λ��ıݾ� from emp;
	 * 
	 * create talbe ���̺��(�÷��� �ڷ���,,��);
	 * ����(�ִ�38~40) number,number(�ڸ���),number(����,�Ҽ�������);
	 * ����(1~2000byte) char(����),varchar2(����)
	 * ��¥(�ð�) date
	 * rlxk
	 * long����(varchar:~2gb)
	 * lob(���̳ʸ�������:~2gb)
	 * 
	 * select tname from tab; ������ �ִ� ���̺� ��ȸ
	 * 
	 * alter table ex06 add(nalja date); ��Ű�� �߰�
	 * alter table ex06 add(num1 number,num2 number);��Ű�� �߰� 
	 * alter table ex06 drop column num2; �÷� ����
	 * alter table ex06 modify(nalja number);  Ÿ�� ����
	 * 
	 * unique ���ߺ��Ұ�
	 * create table ex02(
		num number unique,
		name varchar2(30) unique
		);
	 * 
	 * 
	 * drop table ex03;
		create table ex03(
		num number unique not null,
		name varchar2(30) unique not null
		);
		insert into ex03 values(1,'test1');
		insert into ex03 values(2,'test2');
		insert into ex03 values(3,'test3');
		insert into ex03 values(4,'test4');
		insert into ex03 values(5,'test5');
		select * from ex03
		;
	 * 
	 * 
	 drop table ex04;
		create table ex04(
		--num number primary key,
		num number constraint ex04_num_pk primary key,
		name varchar2(9) not null unique
		);
	 * 
	 * 
	 * ����Ŭ primay key - ���̺�� 1�� ����
	 * �������Ǹ���Ģ
	 * constraint Ŭ������_�÷���_���������(pk,nn,u,fk)
	 * 
	 * alter table ex04 disable constraint ex04_num_pk;
	 * alter table ex04 enable constraint ex04_num_pk;
	 * ALTER TABLE ex04 ADD CONSTRAINT ex04_num_pk PRIMARY KEY(num);
	 * 
	 * 
	 * --�θ����̺�
		create table ex08(
		num number primary key,
		loc verchar2(6),
		tel varchar2(13)
		);
		insert into ex08 values(1,'����','02');
		insert into ex08 values(2,'�λ�','042');
		insert into ex08 values(3,'�뱸','032');
	 * 
	 * 
		--�ڽ� ���̺�
		create table ex09(
		sabun number primary key,
		name varchar2(9) not null,
		--num number references ex08(num)
		num number constraint ex09_num_fk references ex08(num)
		);
	 * 
	 * 
	 * 
	 * drop table ex10;
		create table ex10(
			num number default 0,
			sub varchar2(30) default '�������',
			nalja date
		);
	 * 
	 * drop table ex10;
		create table ex10(
			num number,
			gender varchar2(3) check(gender in ('��','��'),
			nalja date default sysdate
		);
	 * 
	 * 
	 * select * from emp,dept where emp.deptno=dept.deptno;
	 * select A.ename,B.loc from emp A,dept B where A.deptno=B.deptno;
	 * select A.ename,B.loc from emp A,dept B where A.deptno=B.deptno and A.ename='SMITH';
	 * select A.ename,B.loc from emp A,dept B where A.deptno=B.deptno(+);
	 * select * from emp A,emp B where A.mgr=B.empno;
	 * select A.ename �����,B.ename ��� from emp A,emp B where A.mgr=B.empno;
	 * select * from emp cross join dept; ũ�ν� ���� ǥ��
	 * select * from emp inner join dept on emp.deptno=dept.deptno;
	 * select * from emp A natural join dept B where ename='SMITH';
	 *
	 * select * from ex11 natural join ex12; ������ ���� ����
	 * select * from ex11 inner join ex12 on ex11.num=ex12.num;
	 * select * from ex11 ,ex12 where ex11.num=ex12.num(+); outer join
	 * select * from ex11 left outer join ex12 on ex11.num=ex12.num;
	 * select * from ex11 right outer join ex12 on ex11.num=ex12.num;
	 * 
	 * select * from ex11 right outer join ex12 on ex11.num=ex12.num where ex11.num is null;
	 * select * from ex11 left outer join ex12 on ex11.num=ex12.num where ex12.num is null;
	 * 
	 * select * from ex11 full outer join ex12 on ex11.num=ex12.num;
	 * select * from ex11 full outer join ex12 on ex11.num=ex12.num where ex12.num is null or ex11.num is null;
	 * 
	 * select * from ex11 full outer join ex12 using(num);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

	}

}
