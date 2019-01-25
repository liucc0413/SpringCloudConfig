package com.learn.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    public static void main(String[] args) {
        ApplicationContext context =SpringApplication.run(ConfigServerApplication.class, args);
//        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
//        jdbcTemplate.execute("delete from properties");
//        jdbcTemplate.execute("INSERT INTO properties VALUES(1, 'foo', 'databasetest', 'service-hi', 'dev', 'master')");
    }

}

