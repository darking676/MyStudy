--while �ݺ���
declare
	num number :=0;
begin
	while(num<4) loop
		dbms_output.put_line('�ݺ�:'||num);
		num := num+1;
	end loop;
end;
/