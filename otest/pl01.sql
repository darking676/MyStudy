declare
	--������ ����
	num number(3);
	name varchar2(9);
begin
	--���๮
	num := 123;
	name := '�ѱ۷�';
	dbms_output.put_line('hello oracle'||num||name);
end;
/