package org.zsz.learnspring.lifecycle.a_initmethod.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zsz.learnspring.lifecycle.a_initmethod.bean.Dog;

/**
 * @author Linus Zhang
 * @create 2022-11-08 22:45
 */
@Configuration
public class InitMethodConfiguration {

  @Bean(initMethod = "init", destroyMethod = "destroy")
  public Dog dog() {
    return new Dog()
        .setName("wangwang");
  }

}
