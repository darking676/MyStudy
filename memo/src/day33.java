
public class day33 {

	/*
	 *
		create or replace procedure pl11
		--���ڼ���
		--su in number ���� ������ in / out���ڵ� �ִ�
		(su number)
		is
		--��������
			--num number(1);
		begin
		--���๮	
			num :=su;
			if(num =1) then
			dbms_output.put_line('num=1');
			elseif(num=2) then
			dbms_output.put_line('num=1');
			else
			dbms_output.put_line('num=1 or num=2 �� �ƴ�');
			end if;
		end;
		/
	 *
	 * @ pl11.sql
	 * execute pl11
	 *
	 *
	 *
	 *create or replace procedure pl11
		--���ڼ���
		(su out number)
		is
		--��������
			num number(1);
		begin
		--���๮	
			num :=7;
			su :=num+10;
		end;
		/
	 *
	 * variable var_su number; ���� ����
	 * execute pl11(:var_su); ���� ����
	 * print var_su; ���� ���
	 *
	 *
	 *create or replace procedure pl12(
			num in emp.empno%type,
			var_ename out emp.ename%type,
			var_job out emp.job%type
		)
		is
			
		begin
			select ename,job into var_ename,var_job from emp where empno=num;
		
		end;
		/
	 *
	 * variable var_ename varchar2(10);
	 * variable var_job varchar2(10);
	 * execute pl12(7839,:vname,:vjob);
	 *
	 *
	 *
	 *
	 *declare
			myrow emp%rowtype;
			--Ŀ�� ����
			coursor c is select empno,ename from emp where empno=7839;
		begin
			--Ŀ�� ����
			open c;
			--Ŀ�� ��ġ;
			fetch c into myrow.empno,myrow.ename;
			close c;
		end;
		/
	 *
	 *
		declare
			myrow emp%rowtype;
			--Ŀ�� ����
			cursor c is select empno,ename from emp;
		begin
			--Ŀ�� ����
			open c;
			--Ŀ�� ��ġ;
			for i in 1..5 loop
			fetch c into myrow.empno,myrow.ename;
			dbms_output.put_line('empno='||myrow.empno);
			dbms_output.put_line('ename='||myrow.ename);
			end loop;
			close c;
		end;
		/
	 *
	 *
	 *declare
			myrow emp%rowtype;
			--Ŀ�� ����
			cursor c is select empno,ename from emp;
		begin
			--Ŀ�� ����
			open c;
			--Ŀ�� ��ġ;
			loop
			fetch c into myrow.empno,myrow.ename;
		
			exit when c%notfound;
		
			dbms_output.put_line('empno='||myrow.empno);
			dbms_output.put_line('ename='||myrow.ename);
			end loop;
			close c;
		end;
		/
	 *
	 *
	 *create or replace procedure pl14
		is
			i emp%rowtype;
			cursor c is select empno,ename from emp;
		begin
			for i in c loop
				dbms_output.put_line('empno='||i.empno);
				dbms_output.put_line('ename='||i.ename);
			end loop;
		end;
		/
	 *
	 *
	 *
	 *
	 *create or replace function pl15
		(no emp.empno%type)
		--out �Ұ� in �� ����
		
		--���� ���� �ϳ��� ����,�ݵ�� ���� ���� ����
			return emp.ename%type
		--is �տ��� ; ����
		is
			dat date;
			name emp.ename%type;
		begin
			--select sysdate into dat from dual;
			--���ο��� insert, update, delete �Ұ�
			--update emp set ename='test' where empno=no;
			select ename into name from emp where empno=no;
			--���� ���� ������ ������ ������ Ÿ�԰� ��ġ
			return name;
		end;
		/
	 *
	 *
		--create [or replace] trigger Ʈ���Ÿ�
		--���� [befor | after] ������ [insert | update | delete ] on ���̺��
		create or replace trigger pl16
			after insert or update on ex16		
		begin
			dbms_output.put_line('���ο� ���� ����');
		end;
		/
	 *
	 *
	 *
		create or replace package pl17
		is
			procedure proc1;
			procedure proc2(no emp.empno%type);
		end;
		/
		create or replace package body pl17
		is
		------------------------------------------
			procedure proc1
			is
			begin
				dbms_output.put_line('proc1 ����1');
			end;
		-----------------------------------------------
			procedure proc2(
				no emp.empno%type
			)
			is
				mylow emp%rowtype;
			begin
				select empno,job into mylow.ename,mylow.job from emp where empno=no;
				dbms_output.put_line('ename='||mylow.ename);
				dbms_output.put_line('job='||mylow.job);
			end;
		end;
		/
	 *
	 *
	 * �տ� rownum�� �ϸ� ������ ����
	 * select rownum,empno,ename from emp;
	 * select rownum,empno,ename from emp where rownum<6;
	 * select * from (select rownum as rn,empno,ename form emp) where rn>5 and rn<11;
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
