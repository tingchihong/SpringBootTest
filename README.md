# Assessment-test

Primary goals of the assessment are:
* Ease of maintainability and readability
* Expose API for Client (Example: to be test via Postman. Please provide the Postman Collection.)
* Each api required to log REQUEST & RESPONSE info into logs file.
* Connect to database, preferred with MSSQL database
* @transactional is required implement in the project.
* GET method API with Pagination
* Expose API nested calling another API from 3rd party.


This is a [Spring Boot](https://spring.io/guides/gs/spring-boot) application built using [Maven](https://spring.io/guides/gs/maven/).
You can build a jar file and run it from the command line:


```
git clone https://github.com/tingchihong/Assessment-test.git
cd Assessment-test
./mvnw package
java -jar target/*.jar
```

## Database configuration
You could start MsSql locally with whatever installer works for your OS, or with docker:

```
docker run -d --name Test -e 'ACCEPT_EULA=Y' -e 'SA_PASSWORD=myPassw0rd' -p 1433:1433 microsoft/mssql-server-linux
```


### Prerequisites
The following items should be installed in your system:
* Java 8 or newer (full JDK not a JRE).
* git command line tool (https://help.github.com/articles/set-up-git)
* Your preferred IDE 
  * Eclipse with the m2e plugin. Note: when m2e is available, there is an m2 icon in `Help -> About` dialog. If m2e is
  not there, just follow the install process here: https://www.eclipse.org/m2e/
  * [Spring Tools Suite](https://spring.io/tools) (STS)
  * IntelliJ IDEA
  * [VS Code](https://code.visualstudio.com)
  
## API exposed
refer [Postman Collection](https://www.getpostman.com/collections/826cafd0ccb93bf0fb68)
