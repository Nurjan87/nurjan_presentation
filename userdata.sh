#!/bin/bash
yum install httpd -y
echo "This is my project, I have written a simple terraform file that creates ec2_instance and installs apache then prints this message! :)" >> /var/www/html/index.html
systemctl restart httpd
systemctl enable httpd 
