package org.zsz.learnspring.lifecycle.d_prototype;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zsz.learnspring.lifecycle.d_prototype.bean.Pen;
import org.zsz.learnspring.lifecycle.d_prototype.config.PrototypeLifecycleConfiguration;

/**
 * @author Linus Zhang
 * @create 2022-11-08 23:15
 */
@Slf4j
public class PrototypeLifecycleAnnoApplication {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrototypeLifecycleConfiguration.class);
    log.info("IOC init success...");

    log.info("Get a Pen instance");
    Pen pen = context.getBean(Pen.class);
    log.info("Get Pen success...");

    log.info("Ready destroy Pen...");
    context.getBeanFactory().destroyBean(pen);
    log.info("Pen destroy success...");
  }

}
