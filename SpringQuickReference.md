## Spring Quick Reference

#### Notes

This is my personal guide, for the original documentation go to: http://spring.io/docs


### How to...

#### Maven: Compiling and packaging in Eclipse

The example application contains unit tests which assumes the application is running.
- Run com.github.shirashiki.exspring.Application as a java application. Wait Jetty to come online.
- In Eclipse, right click on your project
- Run As
- Maven build...
- Fill in the goals you want. To create a package, write 'package' in Goals
- Hit Run
- The resulting jar file will be generated in the target folder.

Resource:
http://stackoverflow.com/questions/10313171/how-to-do-mvn-compile-and-mvn-package-with-m2e-in-eclipse


### Configuration Annotations

**@Autowired**: use this to wire a bean. This is part of the dependency injection capabilities in Spring.

**@ComponentScan**: used to indicate which package to search.

**@EnableAutoConfiguration**: makes Spring look for the AutoWired annotations.


### Misc

**H2 Database**

http://www.h2database.com/html/tutorial.html#spring

- [Support for Profiles](http://www.opencredo.com/2014/02/24/experiences-with-spring-boot)
- [App config](http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html)
- [Multiple datasources](http://stackoverflow.com/questions/23590855/spring-boot-data-hibernate-different-datasources)
- [Data Acess](http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#howto-data-access)
- [Spring Data Multiple databases](http://scattercode.co.uk/2013/11/18/spring-data-multiple-databases/)
- READ THIS: http://www.jayway.com/2014/02/16/spring-propertysource/
- Passing property file as a  when running:
$ java -jar myproject.jar --spring.config.name=other.properties
- [Jackson object mapper config](http://www.jworks.nl/2013/08/21/register-a-custom-jackson-objectmapper-using-spring-javaconfig/)
- http://stackoverflow.com/questions/20648706/spring-jackson-joda-time-how-to-specify-the-serialization-deserialization-f

(the last one is promising!!!)
http://www.joda.org/joda-time/



**Creating and using bean definitions**
http://docs.spring.io/spring-javaconfig/docs/1.0.0.m3/reference/html/creating-bean-definitions.html


**How to use Java and XML to configure Spring**

http://docs.spring.io/spring-javaconfig/docs/1.0.0.m3/reference/html/combining-config-approaches.html


**H2 database server mode and Spring**

http://stackoverflow.com/questions/1503079/start-the-h2-database-in-server-mode-via-spring


**H2 database in memory mode cannot be accessed by Console**

http://stackoverflow.com/questions/5077584/h2-database-in-memory-mode-cannot-be-accessed-by-console
