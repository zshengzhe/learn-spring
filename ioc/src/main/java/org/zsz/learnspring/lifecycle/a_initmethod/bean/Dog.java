package org.zsz.learnspring.lifecycle.a_initmethod.bean;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Linus Zhang
 * @create 2022-11-08 22:40
 */
@Slf4j
@Data
@Accessors(chain = true)
public class Dog {

  private String name;

  public void init() {
    log.info(name + "init...");
  }

  public void destroy() {
    log.info(name + "destroy...");
  }

}
