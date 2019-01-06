FROM maven:3.6.0-jdk-8-alpine as MAVEN_TOOL_CHAIN

COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package -Dmaven.test.skip

FROM openjdk:8-jdk-alpine
EXPOSE 8083
ADD docker/wait-for-it.sh /wait-for-it.sh
COPY --from=MAVEN_TOOL_CHAIN /tmp/target/sleepingPillCore-1.0.TDC-jar-with-dependencies.jar /sleepingPillCore.jar
CMD /wait-for-it.sh db:5432 -- java ${JAVA_OPTS} -jar /sleepingPillCore.jar /sleepingPill.conf
