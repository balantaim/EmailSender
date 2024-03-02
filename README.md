# This is Spring mail sender example

Before testing it add your gmail account and app password in "application.properties":

spring.mail.username=<gmail>
spring.mail.password=<app pasword>

Change test@abv.bg with your destinaction email.

For the test use "postman.json" collection or cURL:

curl --location --request POST 'http://localhost:8080/send-email?targetEmail=test%40abv.bg'
