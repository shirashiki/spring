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

#### Settings

These are the Heroku specific settings

Setting | Parameter | File
------ |------ | ---------
Java version | java.runtime.version=1.7 | project root/system.properties


#### Heroku for the very impatient (or lazy)

##### Create App

In the command line, use `heroku create <app name>`. Example:

`heroku create exspring`


##### Deploying App

When creating an App, Heroku creates a git repository for it. Basically what you need to do is to push your changes to this repo. In the Heroku Dashboard, select Apps > Your App > Settings. In Info, you will see the git repository Url which is `git@heroku.com:exspring.git`.





https://devcenter.heroku.com/articles/git#deploying-code
 
