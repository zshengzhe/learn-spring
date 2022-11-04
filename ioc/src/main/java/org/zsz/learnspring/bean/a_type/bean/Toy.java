package org.zsz.learnspring.bean.a_type.bean;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-04 11:22
 */
@Slf4j
@ToString
public abstract class Toy {

  private final String name;

  protected Toy(String name) {
    log.info("create a toy: " + name);
    this.name = name;
  }

}
