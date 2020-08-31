package com.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@org.springframework.boot.autoconfigure.SpringBootApplication
@EnableAutoConfiguration


public class SpringBootApplication {
    public static void main( String[] args )
    {
        SpringApplication.run(SpringBootApplication.class, args);
    }
}
