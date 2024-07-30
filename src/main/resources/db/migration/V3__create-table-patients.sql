CREATE SEQUENCE IF NOT EXISTS public.patients_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1;

CREATE TABLE IF NOT EXISTS public.patients
(
    id bigint NOT NULL DEFAULT nextval('patients_id_seq'::regclass),
    name varchar(100) not null,
    email varchar(100) not null,
    cpf varchar(15) not null,
    phone_number varchar(20) not null,
    line1 varchar(100) not null,
    line2 varchar(100) not null,
    zipcode varchar(20) not null,
    city varchar(100) not null,
    state char(2) not null,
    number varchar(20),

    primary key(id)
);