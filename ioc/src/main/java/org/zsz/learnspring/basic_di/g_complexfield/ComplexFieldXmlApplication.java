package org.zsz.learnspring.basic_di.g_complexfield;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zsz.learnspring.basic_di.g_complexfield.bean.Person;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-03 17:35
 */
@Slf4j
public class ComplexFieldXmlApplication {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("basic_di/complexfield/inject-complexfield.xml");
    Person person = context.getBean(Person.class);
    log.info("person -> {}", person);
  }

}
