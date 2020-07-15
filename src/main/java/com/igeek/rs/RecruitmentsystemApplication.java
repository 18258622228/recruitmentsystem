package com.igeek.rs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.igeek.rs.dao"})
public class RecruitmentsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecruitmentsystemApplication.class, args);
    }

}
