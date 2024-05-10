CREATE TABLE dependent (
essn CHAR(9) NOT NULL,
dependent_name VARCHAR(30),
sex CHAR,
bdate DATE,
relationship VARCHAR(15),
PRIMARY KEY (essn, dependent_name),
FOREIGN KEY (essn) REFERENCES employee (ssn)
);