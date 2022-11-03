package org.zsz.learnspring.basic_di.e_jsr250.bean;

import javax.annotation.Resource;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-03 16:17
 */
@Component
@Data
public class Bird {

  @Resource(name = "master")
  private Person person;

}
