CREATE SEQUENCE IF NOT EXISTS public.doctors_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1;

CREATE TABLE IF NOT EXISTS public.doctors
(
    id bigint NOT NULL DEFAULT nextval('doctors_id_seq'::regclass),
    name varchar(100) not null,
    email varchar(100) not null,
    cro varchar(15) not null,
    speciality varchar(100) not null,
    line1 varchar(100) not null,
    line2 varchar(100) not null,
    zipcode varchar(20) not null,
    city varchar(100) not null,
    state char(2) not null,
    number varchar(20),

    primary key(id)
);