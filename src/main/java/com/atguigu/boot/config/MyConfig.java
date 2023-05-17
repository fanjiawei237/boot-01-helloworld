package com.atguigu.boot.config;

import com.atguigu.boot.bean.Person;
import com.atguigu.boot.bean.Pet;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:beans.xml")
@Configuration(proxyBeanMethods =true)
public class MyConfig {


    @Bean("helloPet")
    public Pet  getPet(){

        return new Pet("tom",7);
    }

    @Bean("getPerson")
    public Person getPerson(){
        Person person= new Person("范佳威", 25);
        person.setPet(getPet());
        return person;
    }





}
