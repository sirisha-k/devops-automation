FROM openjdk:8
EXPOSE 8085
ADD target/springboot-image1-github-actions.jar springboot-image1-github-actions.jar
ENTRYPOINT ["java","-jar","springboot-image1-github-actions.jar"]