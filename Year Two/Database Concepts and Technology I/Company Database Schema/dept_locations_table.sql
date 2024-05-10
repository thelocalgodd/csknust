CREATE TABLE department_location (
dnumber INT,
dlocation VARCHAR(30),

PRIMARY KEY (dnumber, dlocation),
FOREIGN KEY (dnumber) REFERENCES department(dnumber)
);