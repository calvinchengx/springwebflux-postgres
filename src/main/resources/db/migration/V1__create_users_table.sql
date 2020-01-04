CREATE SEQUENCE public.users_id_seq;

CREATE TABLE users (
  id BIGINT NOT NULL DEFAULT nextval('users_id_seq'::regclass),
  username VARCHAR(256) NOT NULL UNIQUE,
  password TEXT NOT NULL,
  created TIMESTAMP WITHOUT TIME ZONE,
  PRIMARY KEY (id)
);

ALTER SEQUENCE public.users_id_seq OWNED BY users.id;