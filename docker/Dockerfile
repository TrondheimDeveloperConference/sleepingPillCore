FROM openjdk:8
EXPOSE 8083
ADD wait-for-it.sh /
ADD sleepingPillCore.jar /
cmd /wait-for-it.sh db:5432 -- java ${JAVA_OPTS} -jar /sleepingPillCore.jar /sleepingPill.conf
