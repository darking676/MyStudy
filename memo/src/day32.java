
public class day32 {

	/*
	 * 
	 * db 
	 * ��������
	 * select * from (select dname,loc from dept);
	 * select * from emp inner join dept on emp.deptno=dept.deptno;
	 * select deptno,dname,loc,(select sysdate from dual) from dept;
	 * select empno,ename from emp where sal>(select avg(sal) from emp);
	 * select empno,ename from emp where empno in(select empno from emp where sal<1800);
	 * 
	 * ���̺� ����
	 * create table ���̺�� as (select �÷��� from ���̺��);
	 * create table copydept2 as(select deptno,loc from dept);
	 * create table copydept5 as(select * from dept where 1<0);
	 * where false �� �ϸ� ������ ���� �ȵ�
	 * insert into copydept5 (select * from dept); ����� �����Ҽ��� ����
	 * 
	 * update copydept5 set loc=(select loc from dept where deptno=50) where deptno=60;
	 * 
	 * insert into copudept5 values((select max(deptno)+10 from dept),'��Ʈȫ��','����');
	 * 
	 * 
	 * 	drop table ex13;
		create table ex13(
			num number primary key,
			name varchar2(9)
		);
		--������
		--������ ȣ��: ��������.nextval
		--������� ī��Ʈ: ��������.currval
		--start with ��: ������ ����
		--increment by ��: ����ŭ ����
		--maxvalue ��: �ִ밪
		--minvalue ��: �ּҰ�
		-- cycle || nocycle : �ƽ����� ��ȯdefault nocycle
		-- cache || nocache : default 2
		drop sequence ex13_seq;
		create sequence ex13_seq 
		start with 100 
		increment by 10 
		maxvalue 150
		cycle
		nocache;
		
	 * 
	 * insert into ex13 values(ex13_seq.nextval,'text1');
	 * commit; Ʈ����ǽ���
	 * 
	 * ��������
	 * create user class06 identified by user06;
	 * grant create session to class06;
	 * greant create table to class06;
	 * 
	 * alter user calss06 quota 1m on USERS;
	 * 
	 * savepoint sv1; 
	 * rollback to sv1;
	 * 
	 * create view view_dept as select * from dept;
	 * select empno,ename,loc from emp inner join dept on emp.deptno=dept.deptno)
	 * select view view as (������));/����� ������
	 * 
	 * create view view_dept2 as(select * from dept) with read only;
	 * 
	 * distinct �ߺ� ����
	 * 
	 * create or replace view view_dept as (select * from dept where dname like '%A%');
	 * create or replace view view_dept2 as (select * from dept where dname like '%A%');
	 * ������ ���� ������ ��ü
	 * 
	 * create force view view_dept2 as (select * from dept);
	 * 
	 * index �����Ͱ� ������ ������ ã�� ���
	 * select * from ex08 where tel='02';
	 * 
	 * set serveroutput on; �������� output�� �������� ǰ
	 * pl01
	 * declare
			--������ ����
			num number(3);
			name varchar2(9);
		begin
			--���๮
			num := 1234;
			name := '�ѱ۷�';
			dbms_output.put_line('hello oracle'||num||name);
		end;
		/
	 * 
	 * 
	 * pl02
	 * declare
			num number;
			name varchar2(30);
		begin
			select empno,ename into num,name from emp where empno=7839;
			dbms_output.put_line('���'||num);
			dbms_output.put_line('�̸�'||name);
		end;
		/
	 * 
	 * pl03
	 * declare
			type mytype is record(
				empno emp.empno%type,
				ename emp.ename%type
			);
			one_record mytype;
		begin
			select empno,ename into one_record from emp where empno=7839;
			dbms_output.put_line('���:'||one_record.empno);
			dbms_output.put_line('�̸�:'||one_record.ename);
		end;
		/
	 * 
	 * 
	 * pl04
	 * --if���ǹ�
		declare
			num number(1);
		begin
			num :=1;
			if(num=1) then dbms_output.put_line('num=1');
			--end if;
			elsif(num=2) then dbms_output.put_line('num=2');
			elsif(num=3) then dbms_output.put_line('num=3');
			else dbms_output.put_line('1~3���� �ƴմϴ�');	
			end if;
			
		end;
		/
	 * 
	 * 
	 * pl05
	 * --loop�ݺ���
		declare 
			num number;
		begin
			num := 0;
			loop
				num := num+1;
				dbms_output.put_line('�ݺ�:'||num);
				if(num=5) then exit;
				end if;
			end loop;
		end;
		/
	 * 
	 * 
	 * pl06
	 * --while �ݺ���
		declare
			num number :=0;
		begin
			while(num<4) loop
				dbms_output.put_line('�ݺ�:'||num);
				num := num+1;
			end loop;
		end;
		/
	 * 
	 * 
	 * pl07
	 * --for ��
		declare
		begin
			for num in 1..5 loop
				dbms_output.put_line('num:'||num);
			end loop;
		end;
		/
	 * 
	 * 
	 * pl09
		declare
			type myarr1 is table 
				of dept.dname%type 
				index by binary_integer;
			type myarr2 is table 
				of dept.loc%type 
				index by binary_integer;
			arr1 myarr1;
			arr2 myarr2;
			cnt binary_integer :=0;
		begin
			for i in (select dname,loc from dept) loop
				cnt :=cnt+1;
				arr1(cnt) := i.dname;
				arr2(cnt) := i.loc;
			end loop;
				dbms_output.put_line('dname         loc');
				dbms_output.put_line('------------------------------');
			for j in 1..cnt loop
				dbms_output.put_line(arr1(j)||'     '||arr2(j));
			end loop;
		end;
		/
	 * 
	 * 
	 * pl10
	 * 
		create or replace procedure func01
		(num number)
		is
			--��������
		begin
			for i in 1..num loop
				dbms_output.put_line('test'||i);
			end loop;
		end;
		/
	 * 
	 * start pl10.sql
	 * execute func01(5)
	 * exec func01(2)
	 * 
	 * 1. ����� �̸��� �޿��� �Ի����ڸ��� ����ϴ� sql
	 * select ename, sal, hiredate from emp;
	 * 2. �޿��� 3000�̻� �޴� ����� ������ȣ�� �̸�
	 * select empno, ename from emp where sal>=3000;
	 * 3. emp�߿��� �μ���ȣ�� 10���� ����� ���� ��������� ���
	 * select * from emp where deptno=10;
	 * 4. emp�߿��� �޿��� 2000�̸��� �Ǵ� ����� ���� �߿��� 
	 * ����� �̸�,�޿��� ���
	 * select empno, ename, sal from emp where sal<2000;
	 * 5.�̸��� MILLER�� ����� �����ȣ�� ������ ������ ���
	 * select empno,ename,job from emp where ename='MILLER';
	 * 6. �����ȣ�� 7844�̰ų� 7654�̰ų� 7521�� ���
	 * select ename from emp where empno in(7844,7654,7521);
	 * 7. �޿��� 1000���� 3000 ���̿� �ִ� ���
	 * select ename from emp where sal between 1000 and 3000;
	 * 8. �޿��� 1500�� 2500 ������ ����� ���, �̸�, �޿��� ���
	 * select empno,ename,sal from emp where sal between 1500 and 2500;
	 * 9. �̸��� A�� �������� ���� ����� ���, �̸��� ���
	 * select empno,ename from emp where ename not like '%A%';
	 * 10. emp�߿� ���ʽ� ���ǰ� �ȵȻ���� ������ 10%�λ��ϴ� ���
	 * 	�̸�,����,���ʽ�,�λ��,����+�λ��
	 * select ename,sal,comm,sal*0.1 as �λ��,sal+(sal*0.1) from emp where comm is null;
	 * 11. ����� ¦���� ����� �̸��� job�� ���
	 * select ename,job from emp where mod(empno,2)=0;
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
	}

}
