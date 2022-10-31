package org.zsz.learnspring.basic_dl.e_beannames;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class BeannamesApplication {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("basic_dl/quickstart-withanno.xml");
    Arrays.stream(context.getBeanDefinitionNames())
        .map(context::getBean)
        .forEach(bean -> log.info("{}", bean));
  }

}