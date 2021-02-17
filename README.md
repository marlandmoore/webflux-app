# webflux-app

<p>
gradle build <br/>
gradle run <br/>
http://localhost:8080/service/hello?name=World <br/>
</p>
<p>
mvn clean <br/>
mvn install <br/>
code is in target directory <br/>
run using java -jar rest-service-0.1.0.jar <br/>
</p>
<p>
This builds and runs gradle build
docker build -t web-app . 
docker run -d -p 8080:8080 --name web-app web-app
</p>
