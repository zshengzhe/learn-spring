package org.zsz.learnspring.basic_dl.c_oftype;

import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zsz.learnspring.basic_dl.c_oftype.dao.DemoDao;

@Slf4j
public class OfTypeApplication {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("basic_dl/quickstart-oftype.xml");

    Map<String, DemoDao> beans = context.getBeansOfType(DemoDao.class);
    beans.forEach((beanName, bean) -> log.info("{} : {}", beanName, bean.toString()));
  }

}
