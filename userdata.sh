#!/bin/bash
yum install httpd -y
echo "hello class" >> /var/www/html/index.html
systemctl restart httpd
systemctl enable httpd 
