-- ==========================================
-- 1. DROP EXISTING DATABASE
-- ==========================================
-- Deletes the database if it already exists
DROP DATABASE IF EXISTS college_db;


-- ==========================================
-- 2. CREATE DATABASE
-- ==========================================
-- Creates a new database named college_db
CREATE DATABASE college_db;


-- ==========================================
-- 3. SELECT DATABASE
-- ==========================================
-- Selects college_db as the database to use
USE college_db;


-- ==========================================
-- 4. CREATE DEPARTMENTS TABLE
-- ==========================================
-- Stores department information
-- department_id is the primary key and auto-increments
-- department_name cannot be NULL and must be unique

CREATE TABLE departments(
    department_id INT PRIMARY KEY AUTO_INCREMENT,
    department_name VARCHAR(50) NOT NULL UNIQUE
);


-- ==========================================
-- 5. CREATE STUDENTS TABLE
-- ==========================================
-- Stores student information
-- department_id is a foreign key connected to departments table

CREATE TABLE students(
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    age INT,
    city VARCHAR(50),
    email VARCHAR(100) UNIQUE,
    department_id INT,

    FOREIGN KEY(department_id)
        REFERENCES departments(department_id)
);


-- ==========================================
-- 6. CREATE COURSES TABLE
-- ==========================================
-- Stores course information
-- credits has a default value of 3
-- department_id connects courses with departments

CREATE TABLE courses (
    course_id INT PRIMARY KEY AUTO_INCREMENT,
    course_name VARCHAR(100) NOT NULL,
    credits INT DEFAULT 3,
    department_id INT,

    FOREIGN KEY(department_id)
        REFERENCES departments(department_id)
);


-- ==========================================
-- 7. CREATE ENROLLMENTS TABLE
-- ==========================================
-- Stores which student enrolled in which course
-- student_id references students table
-- course_id references courses table
-- marks stores student's marks

CREATE TABLE enrollments (
    enrollment_id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    course_id INT,
    marks INT,

    FOREIGN KEY (student_id)
        REFERENCES students(student_id),

    FOREIGN KEY (course_id)
        REFERENCES courses(course_id)
);


-- ==========================================
-- 8. DISPLAY ALL TABLES
-- ==========================================
-- Shows all tables available in the database

SHOW TABLES;


-- ==========================================
-- 9. INSERT DEPARTMENT DATA
-- ==========================================
-- Inserts three departments into departments table

INSERT INTO departments(department_name)
VALUES
('Computer Science'),
('Artificial Intelligence'),
('Electronics');


-- ==========================================
-- 10. INSERT STUDENT DATA
-- ==========================================
-- Inserts student details into students table

INSERT INTO students(name, age, city, email, department_id)
VALUES
('siri', 20, 'bangalore', 'siribv1101@gmail.com', 1),
('chandu', 22, 'bangalore', 'chandu@gmail.com', 1),
('sai', 21, 'madakasira', 'sai@gmail.com', 2),
('narendra', 23, 'kadapa', 'narendra21@gmail.com', 2),
('murali', 19, 'tirupati', 'muralikrishna@gmail.com', 3);


-- ==========================================
-- 11. INSERT COURSE DATA
-- ==========================================
-- Inserts course details into courses table

INSERT INTO courses(course_name, credits, department_id)
VALUES
('Java Programming', 4, 1),
('Data Structures', 4, 1),
('Database Management', 3, 1),
('Computer Networks', 3, 2),
('Digital Electronics', 4, 3);


-- ==========================================
-- 12. DISPLAY DEPARTMENTS
-- ==========================================
-- Displays all records from departments table

SELECT * FROM departments;


-- ==========================================
-- 13. DISPLAY COURSES
-- ==========================================
-- Displays all records from courses table

SELECT * FROM courses;


-- ==========================================
-- 14. DISPLAY STUDENTS
-- ==========================================
-- Displays all records from students table

SELECT * FROM students;


-- ==========================================
-- 15. INSERT ENROLLMENT DATA
-- ==========================================
-- Inserts student-course enrollment details and marks

INSERT INTO enrollments(student_id, course_id, marks)
VALUES
(1, 1, 85),
(1, 2, 90),
(1, 3, 88),
(2, 1, 75),
(2, 2, 90),
(2, 3, 89),
(3, 1, 78),
(3, 2, 67),
(3, 3, 98),
(4, 1, 78),
(4, 2, 89),
(4, 3, 84),
(5, 1, 89),
(5, 2, 90),
(5, 3, 83);


-- ==========================================
-- 16. DISPLAY ENROLLMENTS
-- ==========================================
-- Displays all enrollment records

SELECT * FROM enrollments;


-- ==========================================
-- 17. DISPLAY STUDENTS
-- ==========================================
-- Displays all student records

SELECT * FROM students;


-- ==========================================
-- 18. SELECT SPECIFIC COLUMNS
-- ==========================================
-- Displays only student name and age

SELECT name, age
FROM students;


-- ==========================================
-- 19. WHERE CONDITION
-- ==========================================
-- Finds students whose age is greater than 20

SELECT *
FROM students
WHERE age > 20;


-- ==========================================
-- 20. SELECT CITY AND EMAIL
-- ==========================================
-- Displays only city and email of students

SELECT city, email
FROM students;


-- ==========================================
-- 21. AND OPERATOR
-- ==========================================
-- Finds students whose age is greater than 18
-- AND whose city is Bangalore

SELECT *
FROM students
WHERE age > 18
AND city = 'Bangalore';


-- ==========================================
-- 22. OR OPERATOR
-- ==========================================
-- Finds students from Bangalore OR Madakasira

SELECT *
FROM students
WHERE city = 'bangalore'
OR city = 'madakasira';


-- ==========================================
-- 23. BETWEEN OPERATOR
-- ==========================================
-- Finds students whose age is between 20 and 22
-- BETWEEN includes both 20 and 22

SELECT *
FROM students
WHERE age BETWEEN 20 AND 22;


-- ==========================================
-- 24. IN OPERATOR
-- ==========================================
-- Finds students whose city is either Bangalore or Madakasira

SELECT *
FROM students
WHERE city IN ('bangalore', 'madakasira');


-- ==========================================
-- 25. LIKE OPERATOR - STARTING WITH S
-- ==========================================
-- Finds students whose name starts with S

SELECT *
FROM students
WHERE name LIKE 'S%';


-- ==========================================
-- 26. LIKE OPERATOR - ENDING WITH A
-- ==========================================
-- Finds students whose name ends with A

SELECT *
FROM students
WHERE name LIKE '%A';


-- ==========================================
-- 27. DISTINCT
-- ==========================================
-- Displays unique cities without duplicates

SELECT DISTINCT city
FROM students;


-- ==========================================
-- 28. ORDER BY ASCENDING
-- ==========================================
-- Displays students from youngest to oldest

SELECT *
FROM students
ORDER BY age ASC;


-- ==========================================
-- 29. ORDER BY DESCENDING
-- ==========================================
-- Displays students from oldest to youngest

SELECT *
FROM students
ORDER BY age DESC;


-- ==========================================
-- 30. ORDER BY + LIMIT
-- ==========================================
-- Displays the top 2 oldest students

SELECT *
FROM students
ORDER BY age DESC
LIMIT 2;


-- ==========================================
-- AGGREGATE FUNCTIONS
-- ==========================================


-- ==========================================
-- 31. COUNT()
-- ==========================================
-- Counts the total number of students

SELECT COUNT(*) AS total_students
FROM students;


-- ==========================================
-- 32. AVG()
-- ==========================================
-- Calculates the average age of students

SELECT AVG(age) AS average_age
FROM students;


-- ==========================================
-- 33. MAX()
-- ==========================================
-- Finds the maximum age

SELECT MAX(age) AS maximum_age
FROM students;


-- ==========================================
-- 34. MIN()
-- ==========================================
-- Finds the minimum age

SELECT MIN(age) AS minimum_age
FROM students;


-- ==========================================
-- 35. SUM()
-- ==========================================
-- Calculates the sum of all student IDs

SELECT SUM(student_id) AS sum_student
FROM students;


-- ==========================================
-- 36. GROUP BY
-- ==========================================
-- Counts the number of students in each city

SELECT city, COUNT(*) AS student_count
FROM students
GROUP BY city;


-- ==========================================
-- 37. GROUP BY + HAVING
-- ==========================================
-- Displays only cities having 2 or more students

SELECT city, COUNT(*) AS student_count
FROM students
GROUP BY city
HAVING COUNT(*) >= 2;


-- ==========================================
-- JOINS
-- ==========================================


-- ==========================================
-- 38. LEFT JOIN
-- ==========================================
-- Displays student names along with their department names
-- LEFT JOIN keeps all students even if department is missing

SELECT s.name, d.department_name
FROM students s
LEFT JOIN departments d
ON s.department_id = d.department_id;


-- ==========================================
-- 39. MULTIPLE JOIN
-- ==========================================
-- Displays student name, course name and marks
-- Joins students, enrollments and courses tables

SELECT s.name, c.course_name, e.marks
FROM students s
JOIN enrollments e
ON s.student_id = e.student_id
JOIN courses c
ON e.course_id = c.course_id;


-- ==========================================
-- 40. CASE STATEMENT
-- ==========================================
-- Categorizes marks into Excellent, Good, Pass or Fail

SELECT
    s.name,
    e.marks,
    CASE
        WHEN e.marks >= 90 THEN 'Excellent'
        WHEN e.marks >= 75 THEN 'Good'
        WHEN e.marks >= 50 THEN 'Pass'
        ELSE 'Fail'
    END AS result
FROM students s
JOIN enrollments e
ON s.student_id = e.student_id;


-- ==========================================
-- 41. UPDATE
-- ==========================================
-- Changes the city of student whose ID is 1

UPDATE students
SET city = 'madakasira'
WHERE student_id = 1;


-- ==========================================
-- 42. DISPLAY UPDATED DATA
-- ==========================================
-- Displays students after UPDATE

SELECT * FROM students;


-- ==========================================
-- 43. DELETE
-- ==========================================
-- Deletes the enrollment record whose ID is 9

DELETE FROM enrollments
WHERE enrollment_id = 9;


-- ==========================================
-- 44. DISPLAY ENROLLMENTS AFTER DELETE
-- ==========================================
-- Displays remaining enrollment records

SELECT * FROM enrollments;


-- ==========================================
-- SUBQUERIES
-- ==========================================


-- ==========================================
-- 45. SUBQUERY - ABOVE AVERAGE AGE
-- ==========================================
-- Finds students whose age is greater than
-- the average age of all students

SELECT *
FROM students
WHERE age > (
    SELECT AVG(age)
    FROM students
);


-- ==========================================
-- 46. SUBQUERY - HIGHEST MARKS
-- ==========================================
-- Finds the enrollment record having the highest marks

SELECT *
FROM enrollments
WHERE marks = (
    SELECT MAX(marks)
    FROM enrollments
);


-- ==========================================
-- 47. CREATE INDEX
-- ==========================================
-- Creates an index on the city column
-- Index improves search performance on city

CREATE INDEX idx_student_city
ON students(city);


-- ==========================================
-- 48. CREATE VIEW
-- ==========================================
-- Creates a virtual table containing
-- student details and department name

CREATE VIEW student_details AS
SELECT
    s.student_id,
    s.name,
    s.city,
    d.department_name
FROM students s
JOIN departments d
ON s.department_id = d.department_id;