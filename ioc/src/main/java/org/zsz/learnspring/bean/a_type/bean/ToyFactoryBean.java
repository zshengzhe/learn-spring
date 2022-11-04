package org.zsz.learnspring.bean.a_type.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-04 11:24
 */
@Slf4j
public class ToyFactoryBean implements FactoryBean<Toy> {

  private final Child child;

  public ToyFactoryBean(Child child) {
    log.info("ToyFactory Init...");
    this.child = child;
  }

  @Override
  public Toy getObject() throws Exception {
    switch (child.getWantToy()) {
      case "ball":
        return new Ball("ball");
      case "car":
        return new Car("car");
      default:
        return null;
    }
  }

  @Override
  public Class<Toy> getObjectType() {
    return Toy.class;
  }

}
