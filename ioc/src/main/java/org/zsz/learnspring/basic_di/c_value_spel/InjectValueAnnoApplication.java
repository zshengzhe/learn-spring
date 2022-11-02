package org.zsz.learnspring.basic_di.c_value_spel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zsz.learnspring.basic_di.c_value_spel.bean.Black;
import org.zsz.learnspring.basic_di.c_value_spel.bean.Red;
import org.zsz.learnspring.basic_di.c_value_spel.config.InjectValueConfiguration;

/**
 * @author Linus Zhang
 * @create 2022-11-02 23:29
 */
@Slf4j
public class InjectValueAnnoApplication {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(InjectValueConfiguration.class);
    Black black = context.getBean(Black.class);
    log.info("black -> {}", black);

    Red red = context.getBean(Red.class);
    log.info("red -> {}", red);
  }

}
