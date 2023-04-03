package com.piyush.springlcloud.functions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;


@SpringBootApplication
public class FunctionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FunctionsApplication.class, args);
    }

    /**
     * Write a function which will be exposed to Http endpoint
     */
    @Bean
    public Function<Integer, Integer> factorial(){
        return value -> fact(value);
    }

    private Integer fact(Integer value) {

        if(value <=2){
            return value;
        }else {
            return value*fact(value-1);
        }
    }
}
