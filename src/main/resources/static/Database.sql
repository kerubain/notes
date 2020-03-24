--mysql -h localhost -u root -p

create DATABASE NOTES;
use NOTES;

CREATE USER 'notes'@'localhost' IDENTIFIED BY 'mysecret';
GRANT ALL PRIVILEGES ON *.* TO 'notes'@'localhost' IDENTIFIED BY 'mysecret' WITH GRANT OPTION;



--Add users
-- got to https://bcrypt-generator.com/ to generate passwords
INSERT INTO USERS (username, password, create_time, update_time) VALUES ('user1@domain.com','$2y$10$aHYV6.W7AWNv1niCoeDPd.tqxIG3bEQDh1rcf0qvAqTzYHGcqMkVS', NOW(), NULL);
INSERT INTO USERS (username, password, create_time, update_time) VALUES ('user2@domain.com','$2y$10$aHYV6.W7AWNv1niCoeDPd.tqxIG3bEQDh1rcf0qvAqTzYHGcqMkVS', NOW(), NULL);
INSERT INTO USERS (username, password, create_time, update_time) VALUES ('user3@domain.com','$2y$10$aHYV6.W7AWNv1niCoeDPd.tqxIG3bEQDh1rcf0qvAqTzYHGcqMkVS', NOW(), NULL);
