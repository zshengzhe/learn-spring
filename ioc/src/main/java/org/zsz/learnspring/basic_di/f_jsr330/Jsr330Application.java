package org.zsz.learnspring.basic_di.f_jsr330;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zsz.learnspring.basic_di.f_jsr330.bean.Cat;
import org.zsz.learnspring.basic_di.f_jsr330.config.Jsr330Configuration;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-03 16:20
 */
@Slf4j
public class Jsr330Application {

  public static void main(String[] args) throws Exception {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(Jsr330Configuration.class);
    Cat cat = ctx.getBean(Cat.class);
    log.info("cat -> {}", cat);
  }

}
