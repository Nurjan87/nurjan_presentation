#!/bin/bash
yum install httpd -y
echo "hello class are you kiding me" >> /var/www/html/index.html
systemctl restart httpd
systemctl enable httpd 
