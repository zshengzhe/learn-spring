package org.zsz.learnspring.basic_di.a_quickstart_set;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zsz.learnspring.basic_di.a_quickstart_set.bean.Cat;
import org.zsz.learnspring.basic_di.a_quickstart_set.bean.Person;

/**
 * @author Zhang Shengzhe
 * @create 2022-10-31 10:37
 */
@Slf4j
public class QuickstartInjectBySetXmlApplication {

  public static void main(String[] args) {
    BeanFactory factory = new ClassPathXmlApplicationContext("basic_di/inject-set.xml");
    Person person = factory.getBean(Person.class);
    log.info("person -> {}", person);

    Cat cat = factory.getBean(Cat.class);
    log.info("cat -> {}", cat);
  }

}
