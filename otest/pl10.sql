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