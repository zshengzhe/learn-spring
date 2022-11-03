package org.zsz.learnspring.basic_di.g_complexfield;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zsz.learnspring.basic_di.g_complexfield.bean.Person2;
import org.zsz.learnspring.basic_di.g_complexfield.config.ComplexFieldConfiguration;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-03 17:50
 */
@Slf4j
public class ComplexFieldAnnoApplication {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComplexFieldConfiguration.class);
    Person2 person = context.getBean(Person2.class);
    log.info("person -> {}", person);
  }

}
