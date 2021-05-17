# Base image
FROM java:latest

# depandancies
 COPY ./bawa-restful-webservices-0.0.1-SNAPSHOT.jar ./
RUN sh
# RUN java -jar bawa-restful-webservices-0.0.1-SNAPSHOT.jar
# command to run
# CMD ["sh"]
EXPOSE 8089
CMD java -jar -Dserver.port=8089 bawa-restful-webservices-0.0.1-SNAPSHOT.jar