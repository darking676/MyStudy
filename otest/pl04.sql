--if���ǹ�
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