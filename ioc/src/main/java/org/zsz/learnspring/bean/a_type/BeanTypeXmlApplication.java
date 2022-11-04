package org.zsz.learnspring.bean.a_type;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zsz.learnspring.bean.a_type.bean.Toy;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-04 15:08
 */
@Slf4j
public class BeanTypeXmlApplication {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean/bean-type.xml");
    Toy toy = context.getBean(Toy.class);
    log.info("toy -> {}", toy);
  }

}
