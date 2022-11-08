package org.zsz.learnspring.bean.c_instantiate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zsz.learnspring.bean.c_instantiate.bean.Car;
import org.zsz.learnspring.bean.c_instantiate.config.BeanInstantiateConfiguration;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-04 15:39
 */
@Slf4j
public class BeanInstantiateAnnoApplication {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanInstantiateConfiguration.class);
    context.getBeansOfType(Car.class)
        .forEach((name, car) -> log.info(name + " : " + car));
  }

}
