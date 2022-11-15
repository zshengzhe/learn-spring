package org.zsz.learnspring.event.a_quickstart;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Linus Zhang
 * @create 2022-11-15 23:53
 */
@Slf4j
public class QuickstartListenerApplication {

  public static void main(String[] args) {
    log.info("准备初始化IOC容器。。。");
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("org.zsz.learnspring.event.a_quickstart");
    log.info("IOC容器初始化完成。。。");
    ctx.close();
    log.info("IOC容器关闭。。。");
  }

}
