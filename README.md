Simple [Bootique](http://bootique.io) app demonstrating the Bootique MVC Model with Jetty, Jersey and Mustache.

Simply build the app in your IDE or use Maven

```
mvn clean package
```
Enter the following to launch the app in Maven.

```bash
/project/root/$ java -jar target/bootique-mvc-demo-1.0-SNAPSHOT.jar 
```

The app is configured with arguments `"--server", "--config=classpath:bootique.yml".`  After launching the app in your IDE or with Maven, go to

```bash
http://localhost:9000/
```
