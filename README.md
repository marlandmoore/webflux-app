# webflux-app

gradle build
gradle run
http://localhost:8080/service/hello?name=World

mvn clean
mvn install
code is in target directory
run using java -jar rest-service-0.1.0.jar

This builds and runs gradle build
docker build -t app . 
docker run -d -p 8080:8080 --name webflux-app webflux-app
