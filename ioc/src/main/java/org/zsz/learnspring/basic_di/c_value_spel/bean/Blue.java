package org.zsz.learnspring.basic_di.c_value_spel.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Linus Zhang
 * @create 2022-11-02 23:41
 */
@Component
@Data
public class Blue {

  @Value("#{'blue-value-byspel'}")
  private String name;

  @Value("#{2}")
  private Integer order;
}
