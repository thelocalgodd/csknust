CREATE TABLE department (
dname VARCHAR(50) NOT NULL,
dnumber INT PRIMARY KEY,
mgr_ssn CHAR(9),
mgr_start_date DATE,

FOREIGN KEY (mgr_ssn) REFERENCES employee (ssn)
);