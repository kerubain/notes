#how to test
#Windows
#insert
curl --user user1@domain.com:123 -H "Content-Type: application/json" -X POST --data "{\"username\":\"user1@domain.com\",\"title\":\"mydog3\",\"note\":\"hansom3\"}" http://localhost:8080/api/v1/notes
#notes by user
curl --user user1@domain.com:123 -H "Content-Type: application/json" -X GET http://localhost:8080/api/v1/notes


