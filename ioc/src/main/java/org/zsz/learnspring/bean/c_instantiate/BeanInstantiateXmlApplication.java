package org.zsz.learnspring.bean.c_instantiate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zsz.learnspring.bean.c_instantiate.bean.Car;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-04 15:44
 */
@Slf4j
public class BeanInstantiateXmlApplication {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean/bean-instantiate.xml");
    context.getBeansOfType(Car.class)
        .forEach((name, car) -> log.info(name + " : " + car));
    // 静态工厂本身不会被注册到 IOC 容器中
  }

}
