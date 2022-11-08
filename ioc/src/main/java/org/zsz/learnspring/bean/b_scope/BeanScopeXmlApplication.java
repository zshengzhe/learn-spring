package org.zsz.learnspring.bean.b_scope;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zsz.learnspring.bean.b_scope.bean.Child;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-04 15:40
 */
@Slf4j
public class BeanScopeXmlApplication {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean/bean-scope.xml");
    context.getBeansOfType(Child.class)
        .forEach((name, toy) -> log.info(name + " : " + toy));
  }

}
