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


**Creating and using bean definitions**
http://docs.spring.io/spring-javaconfig/docs/1.0.0.m3/reference/html/creating-bean-definitions.html


**How to use Java and XML to configure Spring**

http://docs.spring.io/spring-javaconfig/docs/1.0.0.m3/reference/html/combining-config-approaches.html


**H2 database server mode and Spring**

http://stackoverflow.com/questions/1503079/start-the-h2-database-in-server-mode-via-spring


**H2 database in memory mode cannot be accessed by Console**

http://stackoverflow.com/questions/5077584/h2-database-in-memory-mode-cannot-be-accessed-by-console
