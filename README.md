# BabyNames

BabyNames is just a dummy app for ask friends or family what is their preferred name for your 
future child. You can add new names for boys or girls and they can vote for their preferred 
one. 
The project is developed with [Spring Roo](http://www.springsource.org/spring-roo) (v. 1.1.5), 
using several of its features:

* JPA integration
* Spring Security
* Spring MVC integration
* JSON
* Auto JUnit test generation

Also, I added other features like AJAX and a bit of testing using [Cucumber](http://cukes.info/)
for Java (just for evaluation).

Of course, I'm sure that things could be implemented in another manner, even better than it is. 
Every suggestion will be welcome.

## Database storage

I integrated Hypersonic DB in memory. But you can change it and the easiest way to do that is using Spring
Roo' shell with the command:

``persistence setup --provider HIBERNATE --database <DATABASE>``

*Remember to use [TAB] key for autocompletion in commands.*

## Security

Security setup is just the default integration done by Roo' Spring Security Add-on. So, you have the 
security configuration in file src/main/resources/META-INF/spring/applicationContext-security.xml.

Login with admin/admin for role admin, and user/user for role user.

## How to run

The project is a Maven project. You can run the application using the Tomcat Maven plugin that is set up in 
pom.xml. Invoke the following command in the system shell.

``mvn tomcat:run`` 

## TODO

There are some things to do.

* To improve JSON requests handling. I noticed that due to Spring MVC exception handling, with the current
JSON methods in Names controller, if an Exception is thrown, the implemented method doesn't catch it and
the AJAX method (in view) doesn't receive an HTTP error code but an HTTP 200 code, because Spring MVC is 
redirecting to an error web page showing the exception there.
* Implement delete/edit in view for role admin. Well, it is implemented with the default Roo generation, 
you can access via http://localhost:8080/names/list. But I'd like to add an interface in the main page, 
like the thumb-up icon and modal dialogs forms.