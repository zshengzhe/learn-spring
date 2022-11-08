package org.zsz.learnspring.lifecycle.c_initializingbean.bean;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author Linus Zhang
 * @create 2022-11-08 23:05
 */
@Component
@Slf4j
@ToString
public class Pen implements InitializingBean, DisposableBean {

  private Integer ink;

  @Override
  public void afterPropertiesSet() throws Exception {
    log.info("钢笔中已加满墨水。。。");
    this.ink = 100;
  }

  @Override
  public void destroy() throws Exception {
    log.info("钢笔中的墨水都放干净了。。。");
    this.ink = 0;
  }

}
