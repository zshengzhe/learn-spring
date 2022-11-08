package org.zsz.learnspring.lifecycle.b_jsr250.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author Linus Zhang
 * @create 2022-11-08 22:57
 */
@Component
@ToString
public class Pen {

  private Integer ink;

  @PostConstruct
  public void addInk() {
    this.ink = 100;
  }

  @PreDestroy
  public void outwellInk() {
    this.ink = 0;
  }

}
