package org.zsz.learnspring.basic_di.h_aware.bean;

import java.util.Arrays;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-04 10:33
 */
@Slf4j
public class AwareTestBean implements ApplicationContextAware, BeanNameAware {

  @Getter
  private String beanName;

  private ApplicationContext context;

  public void printBeanNames() {
    Arrays.stream(context.getBeanDefinitionNames())
        .forEach(name -> log.info("{}", name));
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.context = applicationContext;
  }

  @Override
  public void setBeanName(String name) {
    this.beanName = name;
  }

}
