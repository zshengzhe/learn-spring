package org.zsz.learnspring.basic_di.d_autowired.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.zsz.learnspring.basic_di.d_autowired.bean.Cat;
import org.zsz.learnspring.basic_di.d_autowired.bean.Person;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-03 16:07
 */
@Configuration
@ComponentScan("org.zsz.learnspring.basic_di.d_autowired.bean")
public class AutoWiredConfiguration {

  @Bean
  public Cat cat(Person person) {
    return new Cat()
        .setName("mimi")
        .setPerson(person);
  }

  @Bean
  @Primary
  public Person master() {
    return new Person()
        .setName("master");
  }

}
