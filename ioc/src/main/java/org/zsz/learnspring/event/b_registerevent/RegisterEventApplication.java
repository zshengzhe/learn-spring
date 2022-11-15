package org.zsz.learnspring.event.b_registerevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zsz.learnspring.event.b_registerevent.service.RegisterService;

/**
 * @author Linus Zhang
 * @create 2022-11-16 00:13
 */
public class RegisterEventApplication {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.zsz.learnspring.event.b_registerevent");
    RegisterService registerService = context.getBean(RegisterService.class);
    registerService.register("Linus");
  }

}
