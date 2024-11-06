

drop table if exists adeptaSororitas cascade ;


create table adeptaSororitas (cod integer, nome varchar(15), puntos integer);
insert into adeptaSororitas values ('0','squad',105);
insert into adeptaSororitas values ('1','dominion',125);
insert into adeptaSororitas values ('2','seraphim',90);
insert into adeptaSororitas values ('3','zephyrim',85);
insert into adeptaSororitas values ('4','exorcist',190);
insert into adeptaSororitas values ('5','celestine',160);
insert into adeptaSororitas values ('6','imagifier',65);


select * from adeptaSororitas;