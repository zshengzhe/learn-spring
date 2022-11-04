package org.zsz.learnspring.bean.b_scope.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.zsz.learnspring.bean.b_scope.bean.Child;
import org.zsz.learnspring.bean.b_scope.bean.Toy;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-04 15:26
 */
@Slf4j
@Component
@ComponentScan("org.zsz.learnspring.bean.b_scope.bean")
public class BeanScopeConfiguration {

  @Bean
  public Child child1(Toy toy) {
    return new Child()
        .setToy(toy);
  }


  @Bean
  public Child child2(Toy toy) {
    return new Child()
        .setToy(toy);
  }

}