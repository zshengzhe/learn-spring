package org.zsz.learnspring.basic_di.e_jsr250.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.zsz.learnspring.basic_di.e_jsr250.bean.Person;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-03 16:07
 */
@Configuration
@ComponentScan("org.zsz.learnspring.basic_di.e_jsr250.bean")
public class Jsr250Configuration {

  @Bean
  @Primary
  public Person master() {
    return new Person()
        .setName("master");
  }

}
