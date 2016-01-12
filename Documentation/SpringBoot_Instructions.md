# Spring Boot Setup Instructions 

If you have not already done so, read through the [instructions for building the codebase](Build_Instructions.md) first. 


## Choose a Data Service
The Acme Air sample application is able to utilize several types of data services. 
Choose one of the following -
* [MongoDB](SpringBoot_to_Mongo_Instructions.md)



## Start the Spring Boot application

* Start the Spring Boot application
Windows:
```text
cd $ACMEAIR_SRCDIR\acmeair-webapp\build\libs\
java -jar acmeair-webapp-1.1.0-SNAPSHOT.war
```

Linux:
```text
cd $ACMEAIR_SRCDIR/acmeair-webapp/build/libs/
java -jar acmeair-webapp-1.1.0-SNAPSHOT.war
```

## Look at the application
* Load the following url:
```text
http://localhost:8080/index.html
```


## Now we will load sample data using the web loader

Click on the "configure the Acme Air environment." link at the bottom of the page, or alternatively go to 
```text
http://localhost:8080/loader.html
```

You can change the value for how many customers you wish to have loaded.  The default of 200 customer to load will be displayed. 
* After clicking on the "Load the Database" button you should see output that indicates flights and customers (200) were loaded. 


You will now be able to log in, click on the "Acme Air Home" link at either the top or bottom of the page to return to the welcome page. 

* Login (use the provided credentials), search for flights (suggest today between Paris and New York), book the flights, use the checkin link to cancel the bookings one at a time, view your account profile


