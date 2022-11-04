package org.zsz.learnspring.bean.b_scope;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zsz.learnspring.bean.b_scope.bean.Child;
import org.zsz.learnspring.bean.b_scope.config.BeanScopeConfiguration;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-04 15:27
 */
@Slf4j
public class BeanScopeAnnoApplication {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(BeanScopeConfiguration.class);
    context.getBeansOfType(Child.class)
        .forEach((name, toy) -> log.info(name + " : " + toy));
  }

}
