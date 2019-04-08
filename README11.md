
## ADDED the docker command

#### 1) Build the docker using gradle

##### sudo ./gradlew build docker

###### sudo docker build -F <docker file> -t <docker image>

####2)Show the docker image in docker registery

sudo docker images

####3)Run the docker image

sudo docker run -p 8080:8080 -t <imagefile> or Image id

#### 4) Stop Docker
sudo docker stop my_container    (sudo docker stop 637e96694734)
####5) See the docker process
sudo docker ps
