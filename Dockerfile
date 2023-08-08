
#Lệnh này sẽ pull một Docker image (ở đây là adoptopenjdk/openjdk11:latest) để tạo ra một base image layer,
#các lệnh tiếp theo trong Dockerfile sẽ được thực thi trên base image layer này. Dockerfile bắt buộc phải bắt đầu với FROM.
FROM adoptopenjdk/openjdk11:latest
#WORKDIR Các lệnh tiếp theo trong Dockerfile sẽ được thực hiện trong folder mà lệnh
#WORKDIR định nghĩa, trường hợp này là folder /workspace.
WORKDIR /workspace
#Thực hiện copy file jar ở folder target vào folder /workspace/ bên trong container.
COPY target/*-SNAPSHOT.jar /workspace/app.jar
#ENV: Sử dụng để truyền biến môi trường vào bên trong container, trường hợp này là TZ="Asia/Ho_Chi_Minh".
ENV TZ="Asia/Ho_Chi_Minh"
#EXPOSE: Sẽ quy định cổng mà container sẽ lắng nghe và tiếp nhận traffic, trường hợp này là port 8080.
EXPOSE 8080
#ENTRYPOINT: Khi container start thì lệnh bên trong ENTRYPOINT sẽ được thực thi, trường hợp này là chạy file jar.
ENTRYPOINT ["java","-jar","/workspace/app.jar"]