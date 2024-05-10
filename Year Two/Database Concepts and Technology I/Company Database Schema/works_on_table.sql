CREATE TABLE works_on (
essn CHAR(9) NOT NULL,
pno INT,
hours INT,

PRIMARY KEY (essn, pno),
FOREIGN KEY (pno) REFERENCES project(pnumber),
FOREIGN KEY (essn) REFERENCES employee (ssn)
);