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
run using "java -jar rest-service-0.1.0.jar" <br/>
</p>
<p>
This builds and runs gradle build <br/>
docker build -t web-app .  <br/>
docker run -d -p 8080:8080 --name web-app web-app <br/>
</p>
<p>
Create Dockerfile outside of project folder <br/>
 <br/>
FROM gradle:6.8.2-jdk11  <br/>
COPY --chown=gradle:gradle webflux-app /home/gradle/src  <br/>
WORKDIR /home/gradle/src  <br/>
RUN gradle build --no-daemon  <br/>
EXPOSE 8080  <br/>
CMD ["gradle","run"]  <br/>
  
</p>
