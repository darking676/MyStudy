--create [or replace] trigger Ʈ���Ÿ�
--���� [befor | after] ������ [insert | update | delete ] on ���̺��
create or replace trigger pl16
	after insert or update on ex16		
begin
	dbms_output.put_line('���ο� ���� ����');
end;
/