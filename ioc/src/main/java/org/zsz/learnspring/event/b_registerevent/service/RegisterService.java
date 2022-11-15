package org.zsz.learnspring.event.b_registerevent.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;
import org.zsz.learnspring.event.b_registerevent.event.RegisterSuccessEvent;

/**
 * @author Linus Zhang
 * @create 2022-11-16 00:10
 */
@Slf4j
@Service
public class RegisterService implements ApplicationEventPublisherAware {

  private ApplicationEventPublisher publisher;

  public void register(String userName) {
    // 用户注册的动作。。。
    log.info(userName + "注册成功。。。");
    // 发布事件
    publisher.publishEvent(new RegisterSuccessEvent(userName));
  }

  @Override
  public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
    this.publisher = applicationEventPublisher;
  }
}
