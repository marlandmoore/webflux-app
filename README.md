# webflux-app
docker build -t app . 


docker run -d -p 8080:8080 --name webflux-app webflux-app
