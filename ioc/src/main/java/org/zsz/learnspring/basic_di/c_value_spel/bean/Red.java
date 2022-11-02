package org.zsz.learnspring.basic_di.c_value_spel.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Linus Zhang
 * @create 2022-11-02 23:31
 */
@Component
@Data
public class Red {

  @Value("${red.name}")
  private String name;

  @Value("${red.order}")
  private Integer order;

}

