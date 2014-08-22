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


### How to create a clean project

The idea here was to create a Spring project as close as possible to the Spring standard, enven though the final objective was to deploy at Heroku. I favoured instructions from Spring, if you check the Maven pom, there is no relation to the one from Heroku. The idea is to have a project you can deploy in environments other than Heroku, without PaaS dependencies.

**General steps from a project from scratch**

- Add m2e plugin to your Eclipse
- In Eclipse, Project > New > Maven Project
- In the New Maven project screen, check "Create a simple project (skip archetype selection)".
- Fill the following page with Group Id, Artifact Id, etc. Packaging is jar.
- Click Finish. This will create an empty Maven project.
- Update the Maven pom.xml having as a reference the Maven pom from this project, and you will be good!



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

When creating an App, Heroku creates a git repository for it. Basically what you need to do is to push your changes to this repo. In the Heroku Dashboard, select Apps > Your App > Settings. In Info, you will see the git repository Url which is `git@heroku.com:<your app>.git`. In this example, the repo is git@heroku.com:exspring.git.

**Deployment technique 1**

I am using this technique as at this moment each Github repo is hosting multiple Eclipse projects.

- Select a folder in your workstation: select a folder which will host Heroku repos.
- In this folder clone the Heroku repo: in the folder, execute `git clone git@heroku.com:exspring.git`. This will create a folder underneath your current, containing the repo.
- In the first clone, you will be cloning an empty repo. Add a .gitignore file, so you you not upload garbage to heroku.
- Copy the contents of your Eclipse project to the repo. Files which are in the root in the Eclipse project need to be in the root in the repo.
- Go to the repo directory in your machine, then add and push content:
```
git add -A
git commit -m 'deployment commit example'
git push origin master
```
- When you do the push, Heroku will build your app.


**Deployment technique 2**

In this scenario, your git repository should contain one project only, so you can add heroku as remote repo and do the push.

http://stackoverflow.com/questions/15231937/heroku-and-github-at-the-same-time

 
##### Accessing the App

In the Heroku Dashboard select Apps > Your App > Settings, then go to domains. you will see a domain with name like `<your app>.herokuapp.com`. To test, put in the browser:

http://exspring.herokuapp.com/greeting?name=Canadiens



#### References
[Deploy and run Spring at Heroku]
(https://devcenter.heroku.com/articles/getting-started-with-spring-mvc-hibernate#visit-your-application)
