package org.zsz.learnspring.basic_di.b_constructor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zsz.learnspring.basic_di.b_constructor.bean.Cat;
import org.zsz.learnspring.basic_di.b_constructor.bean.Person;

/**
 * @author linus
 */
@Configuration
public class InjectByConstructorConfiguration {

  @Bean
  public Person person() {
    return new Person("test-person-anno-byconstructor", 18);
  }

  @Bean
  public Cat cat() {
    return new Cat("test-son-anno", person());
  }

}
