package org.zsz.learnspring.basic_di.b_constructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zsz.learnspring.basic_di.b_constructor.bean.Cat;
import org.zsz.learnspring.basic_di.b_constructor.bean.Person;
import org.zsz.learnspring.basic_di.b_constructor.config.InjectByConstructorConfiguration;

/**
 * @author linus
 */
@Slf4j
public class InjectByConstructorAnnoApplication {

  public static void main(String[] args) throws Exception {
    BeanFactory beanFactory = new AnnotationConfigApplicationContext(InjectByConstructorConfiguration.class);
    Person person = beanFactory.getBean(Person.class);
    log.info("person -> {}", person);

    Cat cat = beanFactory.getBean(Cat.class);
    log.info("cat -> {}", cat);

  }

}
