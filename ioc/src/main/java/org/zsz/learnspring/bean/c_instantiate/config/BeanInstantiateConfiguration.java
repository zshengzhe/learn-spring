package org.zsz.learnspring.bean.c_instantiate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.zsz.learnspring.bean.c_instantiate.bean.BallFactoryBean;
import org.zsz.learnspring.bean.c_instantiate.bean.Car;
import org.zsz.learnspring.bean.c_instantiate.bean.CarInstanceFactory;
import org.zsz.learnspring.bean.c_instantiate.bean.CarStaticFactory;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-04 15:38
 */
@Configuration
@ComponentScan("org.zsz.learnspring.bean.c_instantiate.bean")
public class BeanInstantiateConfiguration {

  @Bean
  public BallFactoryBean ballFactory() {
    return new BallFactoryBean();
  }

  @Bean
  public Car car2() {
    return CarStaticFactory.newCar();
  }

  @Bean
  public CarInstanceFactory carInstanceFactory() {
    return new CarInstanceFactory();
  }

  @Bean
  public Car car3(CarInstanceFactory carInstanceFactory) {
    return carInstanceFactory.newCar();
  }

}
