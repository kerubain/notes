#how to test
#Windows
#insert
curl --user user1@domain.com:123 -H "Content-Type: application/json" -X POST --data "{\"username\":\"user1@domain.com\",\"title\":\"mydog3\",\"note\":\"hansom3\"}" http://localhost:8080/api/v1/notes
#notes by user
curl --user user1@domain.com:123 -H "Content-Type: application/json" -X GET http://localhost:8080/api/v1/notes

#single note
curl --user user1@domain.com:123 -H "Content-Type: application/json" -X GET http://localhost:8080/api/v1/note?idNote=1
curl --user user2@domain.com:123 -H "Content-Type: application/json" -X GET http://localhost:8080/api/v1/note?idNote=1


