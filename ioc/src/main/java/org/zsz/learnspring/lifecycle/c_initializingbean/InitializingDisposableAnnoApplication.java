package org.zsz.learnspring.lifecycle.c_initializingbean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zsz.learnspring.lifecycle.c_initializingbean.config.InitializingDisposableConfiguration;

/**
 * `@PostConstruct` → InitializingBean → init-method
 *
 * @author Linus Zhang
 * @create 2022-11-08 23:07
 */
@Slf4j
public class InitializingDisposableAnnoApplication {

  public static void main(String[] args) {
    log.info("准备初始化IOC容器。。。");
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InitializingDisposableConfiguration.class);
    log.info("IOC容器初始化完成。。。");

    log.info("\n");

    log.info("准备销毁IOC容器。。。");
    context.close();
    log.info("IOC容器销毁完成。。。");
  }

}
