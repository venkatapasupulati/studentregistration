CREATE TABLE course (
  id varchar NOT NULL,
  name varchar NOT NULL
);


CREATE TABLE student (
   id varchar NOT NULL,
  name varchar NOT NULL
);

CREATE TABLE registration (
  registrationId varchar NOT NULL,
  studentId varchar NOT NULL,
  studentName varchar NOT NULL,
  courseId varchar NOT NULL,
  courseName varchar NOT NULL,
  createdDate DATE NOT NULL,
  
);

select A.id from student A 
LEFT JOIN registration B on A.id=B.studentId 
where B.studentId IS NULL