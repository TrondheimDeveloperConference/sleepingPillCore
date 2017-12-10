FROM openjdk:8
EXPOSE 8083
ADD sleepingPill.conf /
ADD sleepingPillCore.jar /
cmd java ${JAVA_OPTS} -jar /sleepingPillCore.jar /sleepingPill.conf
