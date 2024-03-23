# docker-spring-boot

Demonstrates how to dockerize a spring-boot application

### Step1: Create a docker image
- Run following command. This will create a docker image `docker-spring-boot` and uploaded it to docker-hub you logged in.   
``` docker build -t docker-spring-boot .```
  - Where docker-spring-boot is the name of the image we want to upload to docker-hub.
  - Where `.` represents all files in current folder.

### Step2: Run docker-spring-boot application as container
- Run following command, to run the image you just created.
  ``` docker run -it -p 8080:8080 docker-spring-boot ```

### Step3: Accessing application
- App should start on port `8080`, So hit `http://localhost:8080/users` on your browser.


