--loop�ݺ���
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