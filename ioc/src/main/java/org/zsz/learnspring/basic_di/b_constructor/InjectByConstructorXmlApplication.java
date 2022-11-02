package org.zsz.learnspring.basic_di.b_constructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zsz.learnspring.basic_di.b_constructor.bean.Cat;
import org.zsz.learnspring.basic_di.b_constructor.bean.Person;

/**
 * @author linus
 */
@Slf4j
public class InjectByConstructorXmlApplication {

  public static void main(String[] args) throws Exception {
    BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_di/inject-constructor.xml");
    Person person = beanFactory.getBean(Person.class);
    log.info("person -> {}", person);

    Cat cat = beanFactory.getBean(Cat.class);
    log.info("cat -> {}", cat);
  }

}
