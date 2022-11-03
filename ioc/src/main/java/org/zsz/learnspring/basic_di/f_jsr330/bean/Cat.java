package org.zsz.learnspring.basic_di.f_jsr330.bean;

import javax.inject.Inject;
import javax.inject.Named;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-03 16:21
 */
@Component
@Data
public class Cat {

  @Value("mimi")
  private String name;

  // 等同于@Autowired
  @Inject
  // 等同于@Qualifier
  @Named("admin")
  private Person master;

}
