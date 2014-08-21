## Example Spring Maven Project

### Project Objective

Laboratory to test and document the process of setting up and run a Spring boot application running at Heroku.

### Components

Component | Detail | Comments
------ |------ | ----------------------------------
Java | Java 1.7 | In the server will use openJDK 1.7
Eclipse | Eclipse Luna 4.4.0 |
Eclipse | m2e plugin | Maven to Eclipse, adds Maven support
Hosting | Heroku | Because we will provide Heroku the functionality to monitor
Build tool | Maven | Needed for Heroku
Servlet container | Jetty | Needed for Heroku


### Heroku

These are the Heroku specific settings

Setting | Parameter | File
------ |------ | ---------
Java version | java.runtime.version=1.7 | project root/system.properties
