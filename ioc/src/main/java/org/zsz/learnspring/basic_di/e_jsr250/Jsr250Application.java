package org.zsz.learnspring.basic_di.e_jsr250;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zsz.learnspring.basic_di.e_jsr250.bean.Bird;
import org.zsz.learnspring.basic_di.e_jsr250.config.Jsr250Configuration;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-03 16:03
 */
@Slf4j
public class Jsr250Application {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Jsr250Configuration.class);
    Bird bird = context.getBean(Bird.class);
    log.info("bird -> {}", bird);
  }

}
