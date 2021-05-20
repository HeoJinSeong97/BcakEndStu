select * from all_tables;
create table test(
a int primary key,
b varchar(10)
);
drop table test;
insert into test values(1, 'È«±æµ¿');
insert into test values(2, 'ÀÓ²©Á¤');

create table student(
snum int primary key,
name varchar(10) not null,
score int default 0
);

select * from student;

