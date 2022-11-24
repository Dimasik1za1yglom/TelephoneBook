--liquibase formatted sql

--changeset telephone_book:1
create table telephone_contact
(
    id         serial primary key,
    last_name  varchar(100),
    first_name varchar(100),
    patronymic varchar(100),
    birthday   date
);

--changeset telephone_book:2
create table telephone
(
    id         serial primary key,
    number     varchar (20),
    contact_id integer,
    foreign key (contact_id) references telephone_contact (id)
)
