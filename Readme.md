In this spring-boot application, I have developed a simple code to demonstrate 
how to refresh config changes dyanamically without using
spring-cloud . Thanks to contributors of this repo https://github.com/Code2Life/spring-boot-dynamic-config for providing a solution through which
without using spring-cloud we can get external changes dynamically.

**Main library used**
spring-boot-dynamic-config


**How to build**

I prefer building using maven and here is the command I use:
mvn clean install -Dspring.config.import=<External config file path ex:/Documents/app.yml>

**Special annotation used for Dynamic config changes**
@DynamicConfig. For more information about this annotation please refer to this repo https://github.com/Code2Life/spring-boot-dynamic-config

**How to run the app and test dynamic config changes**
java -jar <jarname> --spring.config.import=<External config file path>

Once the app is started, hit this endpoint from browser: http://localhost:8080/names. Api will return student name from the external config file. To test dynamic config change, open your external file and update student name. As soon as you save your changes
in the external config file, you will be able to see this line in your log : dynamic config file has been changed which clearly indicates whatever changes we do in external config file, the library spring-boot-dynamic-config is able to pick those changes. Now if you hit the same endpoint, you should be able to see the updated name 