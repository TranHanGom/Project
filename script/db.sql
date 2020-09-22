CREATE TABLE public."user"
(
    "Username" character(10) COLLATE pg_catalog."default" NOT NULL,
    "Lastname" character(10) COLLATE pg_catalog."default" NOT NULL,
    "Firstname" character(10) COLLATE pg_catalog."default" NOT NULL,
    "Role" text COLLATE pg_catalog."default" NOT NULL,
    "Age" integer NOT NULL,
    "DateOfBirth" date NOT NULL,
    "Email" character varying COLLATE pg_catalog."default" NOT NULL,
    "DayOfRegistration" date,
    password text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT user_pkey PRIMARY KEY ("Username")
);

INSERT INTO public."user" (
"Username", "Lastname", "Firstname", "Role", "Age", "DateOfBirth", "Email", "DayOfRegistration", password) VALUES (
'hangom', 'tran', 'han', 'user'::text, '22'::integer, '1998-11-29'::date, 'joyhan283@gmail.com'::character varying, '2020-9-22'::date, '12345'::text)
 returning "Username";
INSERT INTO public."user" (
"Username", "Lastname", "Firstname", "Role", "Age", "DateOfBirth", "Email", password) VALUES (
'admin', 'Do', 'Tu', 'admin'::text, '24'::integer, '1996-11-29'::date, 'tudo@gmail.com'::character varying, '56789'::text)
 returning "Username";