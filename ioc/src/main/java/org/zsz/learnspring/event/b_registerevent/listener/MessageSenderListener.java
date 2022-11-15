package org.zsz.learnspring.event.b_registerevent.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.zsz.learnspring.event.b_registerevent.event.RegisterSuccessEvent;

/**
 * @author Linus Zhang
 * @create 2022-11-16 00:09
 */
@Slf4j
@Component
public class MessageSenderListener {

  @EventListener
  @Order(Ordered.HIGHEST_PRECEDENCE)
  public void onRegisterSuccess(RegisterSuccessEvent event) {
    log.info("监听到用户注册成功，发送站内信。。。");
  }

}
