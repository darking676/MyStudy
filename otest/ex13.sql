drop table ex13;
		create table ex13(
			num number primary key,
			name varchar2(9)
		);
		--������
		--������ ȣ��: ��������.nextval
		--������� ī��Ʈ: ��������.currval
		--start with ��: ������ ����
		--increment by ��: ����ŭ ����
		drop sequence ex13_seq;
		create sequence ex13_seq start with 100 increment by 10;