CREATE TABLE  booklist (
  id SERIAL,
  name VARCHAR(50) NOT NULL,
  annotation VARCHAR NOT NULL,
  author VARCHAR(50) NOT NULL,
  picture VARCHAR(500) NOT NULL,
  capacity INT(20) NOT NULL,
  pubdate DATE NOT NULL,
  PRIMARY KEY (id)
);

