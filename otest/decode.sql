--���ڴ� 3���̻�, Ȧ��������
select empno,ename
	,decode(deptno,
		10,'����',
		20,'��õ',
		30,'����',
		40,'����') as ������
from emp;
