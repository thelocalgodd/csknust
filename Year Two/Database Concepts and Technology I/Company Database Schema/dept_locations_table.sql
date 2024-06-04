CREATE TABLE dept_locations
(
    dnumber INT,
    dlocation VARCHAR(30),

    PRIMARY KEY (dnumber, dlocation),
    FOREIGN KEY (dnumber) REFERENCES department(dnumber)
);