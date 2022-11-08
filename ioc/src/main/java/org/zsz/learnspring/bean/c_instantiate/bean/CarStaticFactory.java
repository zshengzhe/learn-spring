package org.zsz.learnspring.bean.c_instantiate.bean;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-04 15:54
 */
public class CarStaticFactory {

  public static Car newCar() {
    return new Car();
  }

}
