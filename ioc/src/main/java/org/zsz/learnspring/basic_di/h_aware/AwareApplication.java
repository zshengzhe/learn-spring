package org.zsz.learnspring.basic_di.h_aware;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zsz.learnspring.basic_di.h_aware.bean.AwareTestBean;
import org.zsz.learnspring.basic_di.h_aware.config.AwareConfiguration;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-04 10:35
 */
@Slf4j
public class AwareApplication {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AwareConfiguration.class);

    AwareTestBean bbb = context.getBean(AwareTestBean.class);
    bbb.printBeanNames();
    log.info("-------------");
    log.info("beanName -> {}", bbb.getBeanName());
  }

}
