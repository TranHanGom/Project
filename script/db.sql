

-- DROP TABLE public.content;

CREATE TABLE public.content
(
    id integer NOT NULL,
    header character varying(50) COLLATE pg_catalog."default" NOT NULL,
    content character varying(14000) COLLATE pg_catalog."default" NOT NULL,
    "created date" timestamp without time zone NOT NULL,
    created_user character varying(50) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT content_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.content
    OWNER to postgres;
INSERT INTO public.content (
id, header, content, "created date", created_user) VALUES (
'1'::integer, 'header 1'::character varying, 'content'::character varying, '2020-09-21 03:00:00'::timestamp without time zone, 'HAN'::character varying)
 returning id;