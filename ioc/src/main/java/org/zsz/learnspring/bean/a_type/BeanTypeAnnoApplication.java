package org.zsz.learnspring.bean.a_type;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zsz.learnspring.bean.a_type.bean.Toy;
import org.zsz.learnspring.bean.a_type.bean.ToyFactoryBean;
import org.zsz.learnspring.bean.a_type.config.BeanTypeConfiguration;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-04 14:13
 */
@Slf4j
public class BeanTypeAnnoApplication {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(BeanTypeConfiguration.class);
//    context.getBeansOfType(Toy.class)
//        .forEach((name, toy) -> log.info("toy name :" + name + ", " + toy));
    Toy toy = context.getBean(Toy.class);
    log.info("toy -> {}", toy);

    log.info("toyFactory -> {}", context.getBean("&toyFactory"));
  }

}
