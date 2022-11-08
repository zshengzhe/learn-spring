package org.zsz.learnspring.lifecycle.a_initmethod.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Linus Zhang
 * @create 2022-11-08 22:36
 */
@Slf4j
@Data
public class Cat {

  private String name;

  public Cat() {
    log.info("Cat call construct method...");
  }

  public void setName(String name) {
    log.info("call setName...");
    this.name = name;
  }

  public void init() {
    log.info(name + "init...");
  }

  public void destroy() {
    log.info(name + "destroy...");
  }

}
