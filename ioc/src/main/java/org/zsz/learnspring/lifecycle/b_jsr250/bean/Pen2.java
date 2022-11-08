package org.zsz.learnspring.lifecycle.b_jsr250.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author Linus Zhang
 * @create 2022-11-08 23:02
 */
@Component
@Slf4j
@ToString
public class Pen2 {

  private Integer ink;

  public void setInk(Integer ink) {
    this.ink = ink;
  }

  public void open() {
    log.info("init-method - 打开钢笔。。。");
  }

  public void close() {
    log.info("destory-method - 合上钢笔。。。");
  }

  @PostConstruct
  public void addInk() {
    log.info("@PostConstruct - 钢笔中已加满墨水。。。");
    this.ink = 100;
  }

  @PreDestroy
  public void outwellInk() {
    log.info("@PreDestroy - 钢笔中的墨水都放干净了。。。");
    this.ink = 0;
  }

}
