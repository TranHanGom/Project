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