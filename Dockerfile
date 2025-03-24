# Dockerfile
FROM openjdk:17-jdk-slim

# 빌드된 JAR 파일을 컨테이너에 복사
COPY ./build/libs/demo-0.0.1-SNAPSHOT.jar app.jar

# JAR 파일 실행
ENTRYPOINT ["java", "-jar", "/app.jar"]
