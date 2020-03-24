--mysql -h localhost -u root -p

create DATABASE NOTES;
use NOTES;

CREATE USER 'notes'@'localhost' IDENTIFIED BY 'mysecret';
GRANT ALL PRIVILEGES ON *.* TO 'notes'@'localhost' IDENTIFIED BY 'mysecret' WITH GRANT OPTION;
