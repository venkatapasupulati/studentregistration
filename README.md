# studentregistration
I have created a spring boot project and configured spring-data-jpa in it. I have used JPARepository for different tables which helps in eliminating boilerplate code involved in managing hibernate.
1.	Created a Table student with id and name.
2.	Created a table Course with id and name.
3.	Created a table registration which has student name, student id, course name, course id and registration id.
4.	Created a StudentVO which has student id and list of courses he wants to register. Inserts student information in student table and iterates through the list of courses and inserts in to registration table.
5.	To delete a student first remove all the entries from the registration table and then remove the entry from student table.
