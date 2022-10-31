package org.zsz.learnspring.basic_dl.f_lazylookup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zsz.learnspring.basic_di.a_quickstart_set.bean.Cat;
import org.zsz.learnspring.basic_dl.d_withanno.bean.Dog;

@Slf4j
public class ImmediatlyLookupApplication {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("basic_dl/quickstart-lazylookup.xml");
    Cat cat = context.getBean(Cat.class);
    log.info("cat -> {}", cat);

//      Dog dog;
//      try {
//          dog = context.getBean(Dog.class);
//      } catch (NoSuchBeanDefinitionException e) {
//          dog = new Dog();
//      }

    Dog dog = context.containsBean("dog") ? (Dog) context.getBean("dog") : new Dog();
    log.info("dog -> {}", dog);
  }

}