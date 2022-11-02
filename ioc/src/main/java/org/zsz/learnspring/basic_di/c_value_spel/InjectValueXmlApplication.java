package org.zsz.learnspring.basic_di.c_value_spel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zsz.learnspring.basic_di.c_value_spel.bean.Black;
import org.zsz.learnspring.basic_di.c_value_spel.bean.Green;
import org.zsz.learnspring.basic_di.c_value_spel.bean.Red;
import org.zsz.learnspring.basic_di.c_value_spel.bean.White;

/**
 * @author linus
 */
@Slf4j
public class InjectValueXmlApplication {

  public static void main(String[] args) throws Exception {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_di/value/inject-value.xml");
    Black black = ctx.getBean(Black.class);
    log.info("simple value : " + black);

    Red red = ctx.getBean(Red.class);
    log.info("properties value : " + red);

    Green green = ctx.getBean(Green.class);
    log.info("use spel bean property : " + green);

    White white = ctx.getBean(White.class);
    log.info("use spel methods : " + white);
  }

}
