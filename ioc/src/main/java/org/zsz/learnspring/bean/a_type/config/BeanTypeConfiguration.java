package org.zsz.learnspring.bean.a_type.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.zsz.learnspring.bean.a_type.bean.Child;
import org.zsz.learnspring.bean.a_type.bean.ToyFactoryBean;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-04 15:13
 */
@Configuration
@ComponentScan("org.zsz.learnspring.bean.a_type.bean")
public class BeanTypeConfiguration {

  @Bean
  public Child child() {
    return new Child();
  }

//  @Bean
//  public Toy ball() {
//    return new Ball("ball");
//  }

  @Bean
  public ToyFactoryBean toyFactory() {
    return new ToyFactoryBean(child());
  }

}
