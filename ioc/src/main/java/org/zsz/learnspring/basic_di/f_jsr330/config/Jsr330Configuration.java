package org.zsz.learnspring.basic_di.f_jsr330.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.zsz.learnspring.basic_di.f_jsr330.bean.Person;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-03 16:22
 */
@Configuration
@ComponentScan("org.zsz.learnspring.basic_di.f_jsr330.bean")
public class Jsr330Configuration {

  @Bean
  public Person person() {
    return new Person()
        .setName("person");
  }

  @Bean
  public Person admin() {
    return new Person()
        .setName("admin");
  }

}
