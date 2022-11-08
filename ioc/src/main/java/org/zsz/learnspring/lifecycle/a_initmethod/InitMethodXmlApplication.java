package org.zsz.learnspring.lifecycle.a_initmethod;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class InitMethodXmlApplication {

  public static void main(String[] args) throws Exception {
    log.info("准备初始化IOC容器。。。");
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycle/bean-initmethod.xml");
    log.info("IOC容器初始化完成。。。");

    log.info("\n");

    log.info("准备销毁IOC容器。。。");
    context.close();
    log.info("IOC容器销毁完成。。。");
  }

}
