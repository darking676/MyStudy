declare
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