## Couch Project

### Technical Details


Stories starting with P are related to the project, they do not produce a shippable feature

Component | Detail | Comments
------ |------ | ----------------------------------
Java | Java 1.7 | In the server will use openJDK 1.7
Sprint Artifact | spring-boot-starter-parent 1.1.5.RELEASE| Because wants to use security features
Hosting | Heroku | Because we will provide Heroku the functionality to monitor


### Notes

#### How Eclipse project was created

- Create a Maven project.
- Adjust the Maven pom.xml adding Spring boot features, and setting the java version.
- For Heroku: in the project root, add Procfile and system.properties files.


### Resources

- [Sprint Boot cloud deployment: Heroku](http://docs.spring.io/spring-boot/docs/1.1.5.RELEASE/reference/htmlsingle/#cloud-deployment-heroku)
- [Modify pom.xml to include JDK compiler version](http://stackoverflow.com/questions/16723533/modify-pom-xml-to-include-jdk-compiler-version)