package org.zsz.learnspring.bean.c_instantiate.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-04 15:36
 */
public class BallFactoryBean implements FactoryBean<Ball> {

  @Override
  public Ball getObject() throws Exception {
    return new Ball();
  }

  @Override
  public Class<Ball> getObjectType() {
    return Ball.class;
  }

}
