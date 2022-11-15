package org.zsz.learnspring.event.a_quickstart.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Linus Zhang
 * @create 2022-11-15 23:51
 */
@Slf4j
@Component
public class ContextRefreshedApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    log.info("ContextRefreshedApplicationListener监听到ContextRefreshedEvent事件");
  }
}
