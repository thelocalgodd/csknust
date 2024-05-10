CREATE TABLE employee (
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
    -- FOREIGN KEY (super_ssn) REFERENCES employee(ssn) 
    );