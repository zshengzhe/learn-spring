package org.zsz.learnspring.basic_dl.d_withanno;

import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zsz.learnspring.basic_dl.d_withanno.anno.Color;

@Slf4j
public class WithAnnoApplication {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("basic_dl/quickstart-withanno.xml");
    Map<String, Object> beans = context.getBeansWithAnnotation(Color.class);
    beans.forEach((beanName, bean) -> log.info("{} : {}", beanName, bean.toString()));
  }

}