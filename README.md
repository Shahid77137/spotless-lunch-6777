# spotless-lunch-6777

Domain Description:
In an educational Institute, there are several batches running every day for
same/different batches. It will be difficult for the Faculties and admin to know the status
of every batch. So the Automated Batch management System will of which batch is
assigned to which faculty.
Types of users:
Administrator
Faculty
Role of Administrator:
Note: Don't create a table to store the credentials of the administrator. Keep the
username and password fixed for admin (like username: ‘admin’ password: ‘admin’)
Login to his account
Create the batch with batch id, course name, number of seats, batch start date, and
duration. (Assume no batches are running parallel)

Batch Monitoring System 2
Update the batch using batch id according to the requirement like course, number of
seats, duration and changing start date
Assign faculty to batch from available faculties (make sure to maintain date from
which batch is assigned to faculty)
View particular Batch by batch id.
See the batch details by faculty id
View all batches list along with details to which they are assigned.
Delete a batch
Logout his account
Role of Faculty:
Register using faculty_id, first_name, last_name, username, pasword, mobile_no &
address
Log in to his/her account using username, and password.
See the batches assigned (Display batch id, course name, start date, duration, date
when batch assigned to him)
Logout his account
Delete account
Note:
1. Based on the above requirements you have to design a database. You are free to
add any number of fields in tables as per the requirement & additional features.
2. Kindly maintain the relationship among the tables like batch & faculty. A batch can
be assignment to more than one faculty and one faculty can take more than one
batch
3. Kindly throw the appropriate exception for any invalid data entry like duplicate
faculty_id and batch_id.
4. Always use the auto_increment column as the primary key and the same column
should be a foreign key in another table. For faculty_id and batch_id you can

Batch Monitoring System 3

specify constraints to be sure that they should not be duplicates and must have a
value.
5. In each table, create a field is_deleted of int type. If this field has a value of 1 means
the record is considered deleted otherwise it should have a value of 0. You do not
have to use a delete query to delete a record because deletion means here just
setting the value of is_deleted 0. The records for which is_deleted is 1 they will
never be visible to the user and admin i.e.; these records will remain idle in the
database forever.
6. Kindly prepare ER-Diagram & database credentials must be read from the
properties file do not put them in code.
7. The project must be started from one class and shouldn't be started again and
again for different use cases.
Additional Features (Great to have but not compulsory)
1. Allow faculties to add details about the topics that are covered in a session of batch
2. If multiple batches are running at the same time then make sure a faculty should not
be in multiple batch at the same time

Technology used:
JAVA
JDBC
MySQL


Enhanced entity-relationship (EER)
<img align="right" alt="coding" width="1100" Height="400" src="https://user-images.githubusercontent.com/87129673/212978835-a169a8e7-e92f-43a1-af15-6922438fd43b.png">
