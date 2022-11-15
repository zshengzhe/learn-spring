package org.zsz.learnspring.event.b_registerevent.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author Linus Zhang
 * @create 2022-11-16 00:07
 */
public class RegisterSuccessEvent extends ApplicationEvent {

  /**
   * Create a new {@code ApplicationEvent}.
   *
   * @param source the object on which the event initially occurred or with which the event is associated (never {@code null})
   */
  public RegisterSuccessEvent(Object source) {
    super(source);
  }

}
