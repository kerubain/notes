#how to test
#Windows
curl -H "Content-Type: application/json" -X POST --data "{\"username\":\"user1@domain.com\",\"title\":\"mydog\",\"note\":\"hansom\"}" http://localhost:8080/api/v1/notes

#later
curl --user user1@domain.com:123 -H "Content-Type: application/json" -X POST --data "{\"username\":\"user1@domain.com\",\"title\":\"jton9\",\"note\":\"guapo9\"}" http://localhost:8080/api/v1/notes