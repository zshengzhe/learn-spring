package org.zsz.learnspring.basic_dl.b_bytype;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zsz.learnspring.basic_dl.b_bytype.bean.Person;
import org.zsz.learnspring.basic_dl.b_bytype.dao.DemoDao;

@Slf4j
public class QuickstartByTypeApplication {

  public static void main(String[] args) {
    BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart-bytype.xml");

    Person person = factory.getBean(Person.class);
    log.info("person -> {}", person);

    DemoDao dao = factory.getBean(DemoDao.class);
    log.info("dao::findAll -> {}", dao.findAll());
  }

}
