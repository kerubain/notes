#how to test
#Windows
curl --user user1@domain.com:123 -H "Content-Type: application/json" -X POST --data "{\"username\":\"user1@domain.com\",\"title\":\"mydog3\",\"note\":\"hansom3\"}" http://localhost:8080/api/v1/notes

