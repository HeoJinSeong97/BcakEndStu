select * from all_tables;
create table test(
a int primary key,
b varchar(10)
);
drop table test;
insert into test values(1, 'ȫ�浿');
insert into test values(2, '�Ӳ���');

create table student(
snum int primary key,
name varchar(10) not null,
score int default 0
);

select * from student;

