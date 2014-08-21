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


