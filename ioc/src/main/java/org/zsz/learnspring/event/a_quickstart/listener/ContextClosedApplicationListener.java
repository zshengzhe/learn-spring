package org.zsz.learnspring.event.a_quickstart.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Linus Zhang
 * @create 2022-11-15 23:54
 */
@Slf4j
@Component
public class ContextClosedApplicationListener {

  @EventListener
  public void onContextClosedEvent(ContextClosedEvent event) {
    log.info("ContextClosedApplicationListener监听到ContextClosedEvent事件");
  }

}
