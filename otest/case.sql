select empno,ename,
	case when deptno=10 then '����'
		when deptno=20 then '��õ'
		when deptno=30 then '����'
		when deptno=40 then '����'
	end as ������
from emp;