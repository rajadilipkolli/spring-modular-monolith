SET search_path TO catalog;

create sequence product_id_seq start with 100 increment by 50;

create table products
(
    id bigint default nextval('catalog.product_id_seq') not null,
    code        text not null unique,
    name        text not null,
    description text,
    price       numeric not null,
    primary key (id)
);
