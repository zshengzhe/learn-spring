package org.zsz.learnspring.basic_di.d_autowired;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zsz.learnspring.basic_di.d_autowired.bean.Cat;
import org.zsz.learnspring.basic_di.d_autowired.bean.Dog;
import org.zsz.learnspring.basic_di.d_autowired.config.AutoWiredConfiguration;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-03 16:03
 */
@Slf4j
public class AutoWiredApplication {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AutoWiredConfiguration.class);
    Dog dog = context.getBean(Dog.class);
    log.info("dog -> {}", dog);

    Cat cat = context.getBean(Cat.class);
    log.info("cat -> {}", cat);
  }

}
