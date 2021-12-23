FROM tomcat:8.0-jre 

LABEL maintainer="Somers Matthews"

# Copy the .war file to the tomcat webapp directory
ADD target/FrontControllerDemo.war /usr/local/tomcat/webapps

# EXPOSE the prot 8080 

EXPOSE 8080

CMD ["catalina.sh". "run"]