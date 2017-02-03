FROM ubuntu:14.04

RUN apt-get update
RUN sudo apt-get install -y software-properties-common python-software-properties
RUN apt-get update
RUN apt-get install -y git-all
RUN apt-get install -y libxss1
RUN apt-get install -y maven
RUN apt-get install -y openjdk-7-jdk openjdk-7-doc openjdk-7-jre-lib
RUN apt-get install -y firefox=28.0+build2-0ubuntu2

ENV JAVA_HOME /usr/lib/jvm/default-java

COPY startup.sh /
RUN chmod 755 /startup.sh
ENTRYPOINT ["/startup.sh"]
