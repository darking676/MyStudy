create or replace function pl15
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