CREATE TABLE public.roles
(
  roleid integer NOT NULL,
  role character varying(10),
  CONSTRAINT roles_pkey PRIMARY KEY (roleid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.roles
  OWNER TO postgres;

  CREATE UNIQUE INDEX roles_fkindex1
  ON public.roles
  USING btree
  (roleid);
  

CREATE TABLE public.users
(
  userid integer NOT NULL,
  roleid integer NOT NULL,
  username character varying(20),
  password character varying(40),
  CONSTRAINT users_pkey PRIMARY KEY (userid),
  CONSTRAINT fk_users_roles FOREIGN KEY (roleid)
      REFERENCES public.roles (roleid) MATCH SIMPLE
      ON UPDATE RESTRICT ON DELETE RESTRICT
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.users
  OWNER TO postgres;

-- Index: public.users_fkindex1

-- DROP INDEX public.users_fkindex1;
CREATE UNIQUE INDEX users_fkindex2
  ON public.users
  USING btree
  (userid);
  
CREATE UNIQUE INDEX users_fkindex1
  ON public.users
  USING btree
  (roleid);



