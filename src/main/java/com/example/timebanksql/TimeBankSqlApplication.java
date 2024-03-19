package com.example.timebanksql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.timebanksql.mapper")
public class TimeBankSqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimeBankSqlApplication.class, args);
    }

}
