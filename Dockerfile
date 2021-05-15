FROM tomcat:8

COPY /build/libs/*.war /usr/local/tomcat/webapps/
