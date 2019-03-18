ADDED the docker command
0)build the docker
sudo ./gradlew build docker

1) Show the docker image in docker register
sudo docker images

2)Run the docker image
sudo docker run -p 8080:8080 -t com.test/test

