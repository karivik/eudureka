FROM devopsedu/webapp

MAINTAINER "Devops Dev"

RUN apt-get update

#Install git
RUN apt-get install -y git

WORKDIR /var/www/html
#Run cd /var/www/html

RUN rm /var/www/html/index.html
RUN rm /var/www/html/index.php

Run git clone https://github.com/karivik/Phpdemo.git .

CMD apachectl -D FOREGROUND