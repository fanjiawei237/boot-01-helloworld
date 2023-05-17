package com.atguigu.boot;


import com.atguigu.boot.bean.Person;
import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);


       Person p = run.getBean("haha",Person.class);

        System.out.println(p);

    }
}
