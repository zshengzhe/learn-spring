package org.zsz.learnspring.basic_di.c_value_spel.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Linus Zhang
 * @create 2022-11-02 23:28
 */
@Component
@Data
public class Black {

  @Value("black-value-anno")
  private String name;

  @Value("0")
  private Integer order;

}
