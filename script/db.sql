CREATE TABLE content
(
    id integer NOT NULL,
    header character varying(50) COLLATE pg_catalog."default" NOT NULL,
    content character varying(14000) COLLATE pg_catalog."default" NOT NULL,
    created_date timestamp without time zone NOT NULL,
    created_user character varying(50) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT content_pkey PRIMARY KEY (id)
);
INSERT INTO "content" 
 VALUES (
1, 'Welcome', 'Mor Family is a software company ','2020-09-21 00:00:00','HAN')


CREATE TABLE "role"
(
	role_id integer PRIMARY KEY,
    role_name VARCHAR ( 50 ) NOT NULL
);

CREATE TABLE "user"
(
    user_id serial PRIMARY KEY,
	username VARCHAR ( 50 ) UNIQUE NOT NULL,
	password VARCHAR ( 50 ) NOT NULL,
    last_name VARCHAR ( 50 ) NOT NULL,
    first_name VARCHAR ( 50 ) NOT NULL,
    age integer NOT NULL,
    date_of_birth date NOT NULL,
    email VARCHAR ( 255 ) UNIQUE NOT NULL,
    day_of_registration TIMESTAMP NOT NULL,
	role_id integer NOT NULL,
   	FOREIGN KEY (role_id)
      REFERENCES role(role_id)
);

INSERT INTO "role" 
 VALUES (1, 'ADMIN') ,(2, 'USER') 
INSERT INTO "user"
 VALUES (1,'tranhan', '12345', 'Tran', 'Han', '23', '1998-11-29', 'joyhan283@gmail.com', '2020-09-23 ', '1'),
 (2,'hangom', '5678', 'Truong', 'Dang', '20', '2020-11-29', 'admin83@gmail.com', '2020-09-2', '2')