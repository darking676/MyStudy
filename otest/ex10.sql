drop table ex10;
create table ex10(
	num number,
	gender varchar2(3) check(gender in ('��','��')),
	nalja date default sysdate
);