FROM tomcat:8

COPY libs/*.war /usr/local/tomcat/webapps/
