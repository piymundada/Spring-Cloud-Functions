# spring-cloud-functions
``
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-function-web</artifactId>
</dependency>
``

Once you define a function, you also need to expose it as a @Bean.


##Testing 
open terminal and hit curl command

``
curl localhost:8080/factorial -H "content-Type: text/plain" -d 5
``


To learn more about the AWS adapter, refer to the link given below.
https://docs.spring.io/spring-cloud-function/docs/3.0.14.RELEASE/reference/html/aws.html
