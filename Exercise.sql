create database Exercise;
use Exercise;

CREATE TABLE REGIONS(
REGION_ID INTEGER PRIMARY KEY,
REGION_NAME VARCHAR(25));

CREATE TABLE COUNTRIES(
COUNTRY_ID CHAR(2) PRIMARY KEY,
COUNTRY_NAME VARCHAR(40),
REGION_ID INTEGER,
FOREIGN KEY(REGION_ID) REFERENCES REGIONS(REGION_ID));

CREATE TABLE LOCATIONS(
LOCATION_ID INTEGER PRIMARY KEY,
STREET_ADDRESS VARCHAR(25),
POSTAL_CODE VARCHAR(12),
CITY VARCHAR(30),
STATE_PROVINCE VARCHAR(12),
COUNTRY_ID CHAR(2),
FOREIGN KEY(COUNTRY_ID) REFERENCES COUNTRIES(COUNTRY_ID));

CREATE TABLE JOBS(
JOB_ID VARCHAR(10) PRIMARY KEY,
JOB_TITLE VARCHAR(35),
MIN_SALARY INTEGER,
MAX_SALARY INTEGER);

CREATE TABLE JOB_GRADES(
GRADE_LEVEL VARCHAR(2) PRIMARY KEY,
LOWEST_SAL INTEGER,
HIGHEST_SAL INTEGER);

CREATE TABLE DEPARTMENTS(
DEPARTMENT_ID INTEGER PRIMARY KEY,
DEPARTMENT_NAME VARCHAR(20),
MANAGER_ID INTEGER,
LOCATION_ID INTEGER,
FOREIGN KEY(LOCATION_ID) REFERENCES LOCATIONS(LOCATION_ID));

CREATE TABLE EMPLOYEES(
EMPLOYEE_ID INTEGER PRIMARY KEY,
FIRST_NAME VARCHAR(20),
LAST_NAME VARCHAR(25),
EMAIL VARCHAR(25),
PHONE_NUMBER VARCHAR(20),
HIRE_DATE DATE,
JOB_ID VARCHAR(10),
SALARY INTEGER,
COMMISSION_PCT INTEGER,
MANAGER_ID INTEGER,
DEPARTMENT_ID INTEGER,
FOREIGN KEY(JOB_ID) REFERENCES JOBS(JOB_ID),
FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENTS(DEPARTMENT_ID));

CREATE TABLE JOB_HISTORY(
EMPLOYEE_ID INTEGER,
START_DATE DATE,
END_DATE DATE,
JOB_ID VARCHAR(10),
DEPARTMENT_ID INTEGER,
PRIMARY KEY(EMPLOYEE_ID, START_DATE),
FOREIGN KEY(EMPLOYEE_ID) REFERENCES EMPLOYEES(EMPLOYEE_ID),
FOREIGN KEY(JOB_ID) REFERENCES JOBS(JOB_ID));

SELECT * FROM REGIONS;
SELECT * FROM COUNTRIES;
SELECT * FROM LOCATIONS;
SELECT * FROM JOBS;
SELECT * FROM JOB_GRADES;
SELECT * FROM DEPARTMENTS;
SELECT * FROM EMPLOYEES;
SELECT * FROM JOB_HISTORY;

-- DROP TABLE REGIONS;
-- DROP TABLE COUNTRIES;
-- DROP TABLE LOCATIONS;
-- DROP TABLE JOBS;
-- DROP TABLE JOB_GRADES;
-- DROP TABLE DEPARTMENTS;
-- DROP TABLE EMPLOYEES;
-- DROP TABLE JOB_HISTORY;
INSERT INTO regions (REGION_ID, REGION_NAME) VALUES
(1, 'Europe'),
(2, 'Americas'),
(3, 'Asia'),
(4, 'Middle East and Africa'),
(5, 'Australia'),
(6, 'South America');

INSERT INTO countries (COUNTRY_ID, COUNTRY_NAME, REGION_ID) VALUES
('US', 'United States', 2),
('CA', 'Canada', 2),
('DE', 'Germany', 1),
('IN', 'India', 3),
('AU', 'Australia', 5),
('BR', 'Brazil', 6);

INSERT INTO locations (LOCATION_ID, STREET_ADDRESS, POSTAL_CODE, CITY, STATE_PROVINCE, COUNTRY_ID) VALUES
(100, '1234 Elm St', '94103', 'San Francisco', 'CA', 'US'),
(101, '5678 Oak St', 'V6E 2T6', 'Vancouver', 'BC', 'CA'),
(102, '9 Main St', '10115', 'Berlin', NULL, 'DE'),
(103, '22 Wall St', '400001', 'Mumbai', 'MH', 'IN'),
(104, '10 Beach Rd', '2000', 'Sydney', 'NSW', 'AU'),
(105, '45 Central Ave', '01000', 'São Paulo', 'SP', 'BR');

INSERT INTO departments (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID) VALUES
(10, 'Administration', 200, 100),
(20, 'Marketing', 201, 101),
(30, 'IT', 202, 102),
(40, 'Finance', 203, 103),
(50, 'Human Resources', 204, 104),
(60, 'Sales', 205, 105);

INSERT INTO employees (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID) VALUES
(200, 'John', 'Doe', 'jdoe@example.com', '1234567890', '2021-05-15', 'IT_PROG', 80000, NULL, NULL, 30),
(201, 'Jane', 'Smith', 'jsmith@example.com', '0987654321', '2019-07-22', 'HR_REP', 60000, NULL, 200, 50),
(202, 'Paul', 'Allen', 'pallen@example.com', '5554443333', '2020-03-01', 'MK_MAN', 90000, NULL, 201, 20),
(203, 'Linda', 'Brown', 'lbrown@example.com', '4443332222', '2018-11-12', 'SA_REP', 75000, 0.05, 202, 60),
(204, 'Chris', 'Wilson', 'cwilson@example.com', '2221110000', '2017-09-30', 'AC_ACCOUNT', 70000, NULL, 203, 40),
(205, 'Emma', 'Taylor', 'etaylor@example.com', '3332221111', '2023-01-20', 'IT_PROG', 85000, NULL, 200, 30);

INSERT INTO jobs (JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY) VALUES
('IT_PROG', 'Programmer', 60000, 120000),
('HR_REP', 'HR Representative', 50000, 90000),
('MK_MAN', 'Marketing Manager', 80000, 150000),
('SA_REP', 'Sales Representative', 40000, 100000),
('AC_ACCOUNT', 'Accountant', 55000, 110000),
('FI_MAN', 'Finance Manager', 95000, 180000);

INSERT INTO job_history (EMPLOYEE_ID, START_DATE, END_DATE, JOB_ID, DEPARTMENT_ID) VALUES
(200, '2019-01-15', '2021-05-14', 'AC_ACCOUNT', 40),
(201, '2017-05-10', '2019-07-21', 'SA_REP', 60),
(202, '2018-08-05', '2020-02-29', 'HR_REP', 50),
(203, '2015-04-01', '2018-11-11', 'MK_MAN', 20),
(204, '2016-10-20', '2017-09-29', 'IT_PROG', 30),
(205, '2020-06-10', '2023-01-19', 'FI_MAN', 40);

INSERT INTO job_grades (GRADE_LEVEL, LOWEST_SAL, HIGHEST_SAL) VALUES
('A', 40000, 60000),
('B', 60001, 80000),
('C', 80001, 100000),
('D', 100001, 120000),
('E', 120001, 150000),
('F', 150001, 180000);

SELECT * FROM REGIONS;
SELECT * FROM COUNTRIES;
SELECT * FROM LOCATIONS;
SELECT * FROM JOBS;
SELECT * FROM JOB_GRADES;
SELECT * FROM DEPARTMENTS;
SELECT * FROM EMPLOYEES;
SELECT * FROM JOB_HISTORY;

ALTER TABLE jobs
ADD GRADE_LEVEL VARCHAR(2);
-- Q12
ALTER TABLE jobs
ADD CONSTRAINT fk_grade_level FOREIGN KEY (GRADE_LEVEL)
REFERENCES job_grades(GRADE_LEVEL);

UPDATE jobs
SET GRADE_LEVEL = CASE
    WHEN JOB_ID = 'IT_PROG' THEN 'C'
    WHEN JOB_ID = 'HR_REP' THEN 'B'
    WHEN JOB_ID = 'MK_MAN' THEN 'D'
    WHEN JOB_ID = 'SA_REP' THEN 'B'
    WHEN JOB_ID = 'AC_ACCOUNT' THEN 'C'
    WHEN JOB_ID = 'FI_MAN' THEN 'E'
END;

INSERT INTO job_grades (GRADE_LEVEL, LOWEST_SAL, HIGHEST_SAL) VALUES
('AA', 40000, 60000),
('BB', 60001, 80000),
('CC', 80001, 100000),
('DD', 100001, 120000),
('EE', 120001, 150000),
('FF', 150001, 180000);

INSERT INTO jobs (JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY, GRADE_LEVEL) VALUES
('IT PROG', 'Programmer', 60000, 120000, 'C'),
('HR REP', 'HR Representative', 50000, 90000, 'B'),
('MK MAN', 'Marketing Manager', 80000, 150000, 'D'),
('SA REP', 'Sales Representative', 40000, 100000, 'B'),
('AC ACCOUNT', 'Accountant', 55000, 110000, 'C'),
('FI MAN', 'Finance Manager', 95000, 180000, 'E');
-- Q3
SELECT L.LOCATION_ID, L.STREET_ADDRESS, L.CITY, L.STATE_PROVINCE, C.COUNTRY_NAME
FROM LOCATIONS L INNER JOIN COUNTRIES C ON L.COUNTRY_ID = C.COUNTRY_ID
ORDER BY L.LOCATION_ID;
-- Q4
SELECT FIRST_NAME, LAST_NAME, DEPARTMENT_ID
FROM EMPLOYEES;
-- Q5  I DIDNT INSERT INTO HAVE JAPEN, SO I FIND Australia
SELECT E.FIRST_NAME, E.LAST_NAME, E.JOB_ID, E.DEPARTMENT_ID
FROM EMPLOYEES E
INNER JOIN DEPARTMENTS D ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
INNER JOIN LOCATIONS L ON D.LOCATION_ID = L.LOCATION_ID
INNER JOIN COUNTRIES C ON L.COUNTRY_ID = C.COUNTRY_ID
WHERE C.COUNTRY_NAME = 'Australia';
-- Q6
SELECT E.EMPLOYEE_ID, E.LAST_NAME AS EMPLOYEE_LAST_NAME, 
       E.MANAGER_ID, M.LAST_NAME AS MANAGER_LAST_NAME
FROM EMPLOYEES E
LEFT JOIN EMPLOYEES M ON E.MANAGER_ID = M.EMPLOYEE_ID
ORDER BY E.EMPLOYEE_ID;

