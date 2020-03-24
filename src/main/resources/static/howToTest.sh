#how to test
#Windows
#insert
curl --user user1@domain.com:123 -H "Content-Type: application/json" -X POST --data "{\"title\":\"mydog4\",\"note\":\"hansom4\"}" http://localhost:8080/api/v1/notes
#notes by user
curl --user user1@domain.com:123 -H "Content-Type: application/json" -X GET http://localhost:8080/api/v1/notes

#single note
curl --user user1@domain.com:123 -H "Content-Type: application/json" -X GET http://localhost:8080/api/v1/note?idNote=1
#wrong user
curl --user user2@domain.com:123 -H "Content-Type: application/json" -X GET http://localhost:8080/api/v1/note?idNote=1

#update
curl --user user1@domain.com:123 -H "Content-Type: application/json" -X PUT --data "{\"idNote\":1,\"title\":\"mydog\",\"note\":\"hansom\"}" http://localhost:8080/api/v1/notes
#wrong user
curl --user user2@domain.com:123 -H "Content-Type: application/json" -X PUT --data "{\"idNote\":1,\"title\":\"mydog41\",\"note\":\"hansom41\"}" http://localhost:8080/api/v1/notes

#delete
curl --user user1@domain.com:123 -H "Content-Type: application/json" -X DELETE http://localhost:8080/api/v1/notes?idNote=1
#wrong user
curl --user user2@domain.com:123 -H "Content-Type: application/json" -X DELETE http://localhost:8080/api/v1/notes?idNote=1
