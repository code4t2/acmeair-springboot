# Spring Boot to MongoDB Setup Instructions 

This document will walk through the steps required to configure the Acme Air sample application and Spring Boot to use MongoDB. These instructions build upon the information from the [Spring Boot instructions document](SpringBoot_Instructions.md). 


## Build the Acme Air codebase to use the morphia service 

To communicate with MongoDB, Acme Air uses the [Morphia](http://mongodb.github.io/morphia/) MongoDB driver. Acme Air needs to be built using with this service specified. 


```text
./gradlew -Pservice=morphia clean build
```

Further details for building the Acme Air codebase can be found [here](Build_Instructions.md).


## Modify the Environment variable as MongoDB configuration to Spring Boot application. 

Add the configuration information so Spring Boot application knows how to connect to MongoDB. 
```text
export VCAP_SERVICES='{"mongo":[{"credentials":{"url":"mongodb://localhost:27017/acmeair"}}]}'
```



## Configure and start MongoDB

See the MongoDB [Manual](http://docs.mongodb.org/manual/) for more information on using MongoDB. 

## Start Liberty and Load the database.

Follow the remaining steps in the [Spring Boot instructions document](SpringBoot_Instructions.md).
