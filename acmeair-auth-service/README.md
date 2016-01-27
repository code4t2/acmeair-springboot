## run auth-service

```
java -jar -Dspring.profiles.active=cloudify -Dvcap.services.config-service.credentials.uri=http://9.186.89.190:8888 -DVCAP_SERVICES='{"mongo":{"credentials":{"url":"mongodb://9.186.89.186:27017/acmeair"}}}' acmeair-auth-service-2.0.0-SNAPSHOT.war
``` 
