package org.zsz.learnspring.lifecycle.d_prototype.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.zsz.learnspring.lifecycle.d_prototype.bean.Pen;

/**
 * @author Linus Zhang
 * @create 2022-11-08 23:14
 */
@Configuration
public class PrototypeLifecycleConfiguration {

  @Bean(initMethod = "open", destroyMethod = "close")
  @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
  public Pen pen() {
    return new Pen();
  }

}
