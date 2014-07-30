DROP VIEW v_library/
DROP VIEW v_author/
DROP VIEW v_book/

DROP TRIGGER t_triggers_trigger/

DROP TABLE t_dates/
DROP TABLE t_triggers/
DROP TABLE t_book_to_book_store/
DROP TABLE t_book_store/
DROP TABLE t_book/
DROP TABLE t_book_details/
DROP TABLE t_author/
DROP TABLE t_language/
DROP TABLE t_directory/
DROP TABLE x_test_case_2025/
DROP TABLE x_test_case_71/
DROP TABLE x_test_case_64_69/
DROP TABLE x_test_case_85/
DROP TABLE t_986_1/
DROP TABLE t_986_2/
DROP TABLE x_unused/
DROP TABLE t_exotic_types/
DROP TABLE t_639_numbers_table/
DROP TABLE t_658_ref/
DROP TABLE t_658_11/
DROP TABLE t_658_21/
DROP TABLE t_658_31/
DROP TABLE t_658_12/
DROP TABLE t_658_22/
DROP TABLE t_658_32/
DROP TABLE t_725_lob_test/
DROP TABLE t_785/
DROP TABLE "T_2845_CASE_sensitivity"/
DROP TABLE t_unsigned/
DROP TABLE t_booleans/
DROP TABLE t_identity/
DROP TABLE t_identity_pk/

CREATE TABLE t_identity_pk (
  id SERIAL PRIMARY KEY CONSTRAINT pk_t_identity_pk,
  val int
)
/

CREATE TABLE t_identity (
  id SERIAL,
  val int
)
/

CREATE TABLE t_dates (
  id int not null PRIMARY KEY CONSTRAINT pk_t_dates,
  d date,
  t datetime year to fraction,
  ts datetime year to fraction,
  d_int int,
  ts_bigint bigint
)
/

CREATE TABLE t_booleans (
  id int not null PRIMARY KEY CONSTRAINT pk_t_booleans,
  one_zero int,
  true_false_lc varchar(5),
  true_false_uc varchar(5),
  yes_no_lc varchar(3),
  yes_no_uc varchar(3),
  y_n_lc char(1),
  y_n_uc char(1),
  vc_boolean varchar(1),
  c_boolean char(1),
  n_boolean int
)
/

CREATE TABLE t_unsigned (
  u_byte smallint,
  u_short int,
  u_int bigint,
  u_long decimal(20)
)
/

DROP SEQUENCE s_trigger_id/
CREATE SEQUENCE s_trigger_id/

CREATE TABLE t_triggers (
  id_generated int not null PRIMARY KEY CONSTRAINT pk_t_triggers,
  id int,
  counter int
)
/

CREATE TABLE t_directory (
  id           INT NOT NULL PRIMARY KEY CONSTRAINT pk_t_directory,
  parent_id    INT,
  is_directory INT,
  "name"       varchar(50),

  FOREIGN KEY (PARENT_ID) REFERENCES t_directory(ID) ON DELETE CASCADE
)
/

CREATE TABLE t_language (
  cd CHAR(2) NOT NULL,
  description VARCHAR(50),
  description_english VARCHAR(50),
  id INTEGER NOT NULL PRIMARY KEY CONSTRAINT pk_t_language
)
/


CREATE TABLE t_725_lob_test (
  ID int NOT NULL PRIMARY KEY CONSTRAINT pk_t_725_lob_test,
  LOB BLOB NULL
)
/

CREATE TABLE t_785 (
  ID int,
  NAME varchar(50),
  VALUE varchar(50)
)
/

CREATE TABLE "T_2845_CASE_sensitivity" (
  id int NOT NULL PRIMARY KEY CONSTRAINT pk_t_2845_case_sensitivity,
  
  insensitive int,
  "UPPER" int,
  "lower" int,
  "Mixed" int
)
/

CREATE TABLE t_author (
  ID INT NOT NULL PRIMARY KEY CONSTRAINT pk_t_author,
  FIRST_NAME VARCHAR(50),
  LAST_NAME VARCHAR(50) NOT NULL,
  DATE_OF_BIRTH DATE,
  YEAR_OF_BIRTH INT,
  ADDRESS VARCHAR(200)
)
/

CREATE TABLE t_book_details (
    ID INT NOT NULL PRIMARY KEY CONSTRAINT pk_t_book_details
)
/

CREATE TABLE t_book (
  ID INT NOT NULL PRIMARY KEY CONSTRAINT pk_t_book,
  AUTHOR_ID INT NOT NULL,
  co_author_id int,
  DETAILS_ID INT,
  TITLE VARCHAR(100) NOT NULL,
  PUBLISHED_IN INT NOT NULL,
  LANGUAGE_ID INT NOT NULL DEFAULT 1,
  CONTENT_TEXT TEXT,
  CONTENT_PDF BLOB,

  FOREIGN KEY (AUTHOR_ID) REFERENCES T_AUTHOR(ID),
  FOREIGN KEY (CO_AUTHOR_ID) REFERENCES T_AUTHOR(ID),
  FOREIGN KEY (DETAILS_ID) REFERENCES T_BOOK_DETAILS(ID),
  FOREIGN KEY (LANGUAGE_ID) REFERENCES T_LANGUAGE(ID)
)
/


CREATE TABLE t_book_store (
  name VARCHAR(100) NOT NULL PRIMARY KEY CONSTRAINT uk_t_book_store_name
)
/

CREATE TABLE t_book_to_book_store (
  book_store_name VARCHAR(100) NOT NULL,
  book_id INTEGER NOT NULL,
  stock INTEGER,

  PRIMARY KEY (book_store_name, book_id) ,
  FOREIGN KEY (book_store_name) REFERENCES t_book_store (name) ON DELETE CASCADE,
  FOREIGN KEY (book_id) REFERENCES t_book (id) ON DELETE CASCADE
)
/


CREATE TABLE x_unused (
  ID INT NOT NULL,
  NAME VARCHAR(10) NOT NULL,
  BIG_INTEGER DECIMAL(25),
  ID_REF INT,
  CLASS INT,
  FIELDS INT,
  TABLE INT,
  CONFIGURATION INT,
  U_D_T INT,
  META_DATA INT,
  VALUES INT,
  TYPE0 INT,
  PRIMARY_KEY INT,
  PRIMARYKEY INT,
  NAME_REF VARCHAR(10),
  "FIELD 737" DECIMAL(25, 2),

  PRIMARY KEY(ID, NAME),
  UNIQUE(ID),
  FOREIGN KEY(ID_REF, NAME_REF) REFERENCES X_UNUSED(ID, NAME)
)
/

CREATE TABLE t_exotic_types (
  ID INT NOT NULL,
  UU CHAR(36),
  
  PRIMARY KEY(ID)
)
/

CREATE TABLE t_639_numbers_table (
  ID INT NOT NULL,
  SHORT SMALLINT,
  "INTEGER" INT,
  "LONG" BIGINT,
  BYTE_DECIMAL DECIMAL(2, 0),
  SHORT_DECIMAL DECIMAL(4, 0),
  INTEGER_DECIMAL DECIMAL(9, 0),
  LONG_DECIMAL DECIMAL(18, 0),
  BIG_INTEGER DECIMAL(22, 0),
  BIG_DECIMAL DECIMAL(22, 5),
  "FLOAT" REAL,
  "DOUBLE" FLOAT,

  PRIMARY KEY(ID)
)
/

CREATE TABLE x_test_case_64_69 (
  ID INT NOT NULL,
  UNUSED_ID INT,

  PRIMARY KEY(ID),
  FOREIGN KEY(UNUSED_ID) REFERENCES X_UNUSED(ID)
)
/

CREATE TABLE x_test_case_71 (
  ID INT NOT NULL,
  TEST_CASE_64_69_ID INT,

  PRIMARY KEY(ID),
  FOREIGN KEY(TEST_CASE_64_69_ID) REFERENCES X_TEST_CASE_64_69(ID)
)
/

CREATE TABLE x_test_case_85 (
  id int NOT NULL,
  x_unused_id int,
  x_unused_name VARCHAR(10),

  PRIMARY KEY(ID),
  FOREIGN KEY(x_unused_id, x_unused_name) REFERENCES X_UNUSED(id, name)
)
/

CREATE TABLE x_test_case_2025 (
  ref_id int NOT NULL,
  ref_name VARCHAR(10) NOT NULL,
  
  FOREIGN KEY(ref_id) REFERENCES x_test_case_85(ID),
  FOREIGN KEY(ref_id) REFERENCES x_test_case_71(ID),
  FOREIGN KEY(ref_id, ref_name) REFERENCES X_UNUSED(id, name)
)
/

CREATE VIEW V_LIBRARY (AUTHOR, TITLE) AS
SELECT T_AUTHOR.FIRST_NAME || ' ' || T_AUTHOR.LAST_NAME, T_BOOK.TITLE
FROM T_AUTHOR JOIN T_BOOK ON T_BOOK.AUTHOR_ID = T_AUTHOR.ID
/

CREATE VIEW v_author AS
SELECT * FROM t_author
/

CREATE VIEW v_book AS
SELECT * FROM t_book
/

