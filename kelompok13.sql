create database db_happytravelling;
use db_happytravelling;
create table t_user
(
    username varchar(50),
    pwd      varchar(50),
    roleid   int
);
create table t_role
(
    roleid   int,
    roledesc varchar(50)
);
create table t_login
(
    username  varchar(50),
    roleid    int,
    lastlogin datetime,
    isactive  tinyint(1)
);
create table t_booking
(
    idbooking        int,
    username         varchar(50),
    fromlocation     varchar(50),
    tolocation       varchar(50),
    depature         varchar(50),
    returndate       varchar(50),
    numberpassangers int
);
create table t_bandara
(
    idbandara int,
    location  varchar(50)
);

insert into t_role
values (1, 'Admin');
insert into t_role
values (2, 'Non-admin');

SELECT *
FROM t_user;
