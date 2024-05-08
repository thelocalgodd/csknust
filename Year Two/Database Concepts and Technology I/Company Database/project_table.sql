CREATE TABLE project (
pname VARCHAR(30),
pnumber INT PRIMARY KEY,
plocation VARCHAR(50),
dnum INT NOT NULL,
FOREIGN KEY (dnum) REFERENCES department (dnumber)
);