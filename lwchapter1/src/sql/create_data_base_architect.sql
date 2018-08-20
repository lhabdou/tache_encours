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


-- création des taches 


  CREATE TABLE public.TaskCategories(
  
  taskCategoryID integer NOT NULL,
  taskCategory character varying(20),

  CONSTRAINT TaskCategories_pkey PRIMARY KEY (taskCategoryID)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.TaskCategories
  OWNER TO postgres;

-- Index: public.users_fkindex1

-- DROP INDEX public.users_fkindex1;
CREATE UNIQUE INDEX TaskCategories_fkindex1
  ON public.TaskCategories
  USING btree
  (taskCategoryID);


  CREATE TABLE public.Tasks
(
  taskID integer NOT NULL,
  taskCategoryID integer NOT NULL,
  userID integer NOT NULL,
  description varchar(500),
  completed boolean,
  dateCreated date,
  dateCompleted date, 
  dateScheduled date,
  
  
  CONSTRAINT Tasks_pkey PRIMARY KEY (taskID),
  CONSTRAINT fk_Tasks_users FOREIGN KEY (userID)
      REFERENCES public.users (userID) MATCH SIMPLE
      ON UPDATE RESTRICT ON DELETE RESTRICT,
  CONSTRAINT fk_Tasks_taskCategories FOREIGN KEY (taskCategoryID)
      REFERENCES public.taskCategories(taskCategoryID) MATCH SIMPLE
      ON UPDATE RESTRICT ON DELETE RESTRICT
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.Tasks
  OWNER TO postgres;

-- Index: public.users_fkindex1

-- DROP INDEX public.users_fkindex1;
CREATE UNIQUE INDEX tasks_fkindex1
  ON public.Tasks
  USING btree
  (taskID);
  
CREATE UNIQUE INDEX tasks_fkindex2
  ON public.Tasks
  USING btree
  (userID);

CREATE UNIQUE INDEX tasks_fkindex3
  ON public.Tasks
  USING btree
  (taskCategoryID);





