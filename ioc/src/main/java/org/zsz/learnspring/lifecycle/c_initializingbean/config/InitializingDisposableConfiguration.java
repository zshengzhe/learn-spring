package org.zsz.learnspring.lifecycle.c_initializingbean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zsz.learnspring.lifecycle.c_initializingbean.bean.Pen3;

/**
 * @author Linus Zhang
 * @create 2022-11-08 23:09
 */
@Configuration
public class InitializingDisposableConfiguration {

  @Bean(initMethod = "open", destroyMethod = "close")
  public Pen3 pen() {
    return new Pen3();
  }

}
