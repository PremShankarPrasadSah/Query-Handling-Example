# Axon-Query-Handling-Example
# System requirements

    Open JDK 11
    Maven
    Docker
# Clone Project
```
Clone git@github.com:PremShankarPrasadSah/Query-Handling-Example.git and import project
mvn clean install
docker-compose up --build
```

# Test API from swagger UI
```
http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/query-controller/findById
```
# To verify mongodb collection
```
sudo su 
mongo
show dbs
use bank_schema
db.user.find()
```