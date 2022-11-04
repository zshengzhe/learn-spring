package org.zsz.learnspring.basic_di.h_aware.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zsz.learnspring.basic_di.h_aware.bean.AwareTestBean;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-04 10:35
 */
@Configuration
public class AwareConfiguration {

  @Bean
  public AwareTestBean bbb() {
    return new AwareTestBean();
  }

}
