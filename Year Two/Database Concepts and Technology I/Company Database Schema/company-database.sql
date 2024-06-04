CREATE DATABASE databasename

USE databasename

CREATE TABLE employee
(
    fname VARCHAR(15) NOT NULL,
    minit VARCHAR(1),
    lname VARCHAR(15) NOT NULL,
    ssn CHAR(9) PRIMARY KEY,
    bdate DATE,
    address VARCHAR(50),
    sex CHAR,
    salary DECIMAL(10, 2),
    super_ssn CHAR(9),
    dno INT
        FOREIGN KEY (super_ssn) REFERENCES employee(ssn)
);


CREATE TABLE department
(
    dname VARCHAR(50) NOT NULL,
    dnumber INT PRIMARY KEY,
    mgr_ssn CHAR(9),
    mgr_start_date DATE,

    FOREIGN KEY (mgr_ssn) REFERENCES employee (ssn)
);


ALTER TABLE employee
ADD FOREIGN KEY (dno) REFERENCES department(dnumber)


CREATE TABLE dept_locations
(
    dnumber INT,
    dlocation VARCHAR(30),

    PRIMARY KEY (dnumber, dlocation),
    FOREIGN KEY (dnumber) REFERENCES department(dnumber)
);


CREATE TABLE project
(
    pname VARCHAR(30),
    pnumber INT PRIMARY KEY,
    plocation VARCHAR(50),
    dnum INT NOT NULL,
    FOREIGN KEY (dnum) REFERENCES department (dnumber)
);

CREATE TABLE works_on
(
    essn CHAR(9) NOT NULL,
    pno INT,
    hours INT,

    PRIMARY KEY (essn, pno),
    FOREIGN KEY (pno) REFERENCES project(pnumber),
    FOREIGN KEY (essn) REFERENCES employee (ssn)
);


CREATE TABLE dependent
(
    essn CHAR(9) NOT NULL,
    dependent_name VARCHAR(30),
    sex CHAR,
    bdate DATE,
    relationship VARCHAR(15),
    PRIMARY KEY (essn, dependent_name),
    FOREIGN KEY (essn) REFERENCES employee (ssn)
);


