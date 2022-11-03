package org.zsz.learnspring.basic_di.g_complexfield.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-03 16:21
 */
@Component("miaomiao")
@Data
public class Cat {

  @Value("miaomiao")
  private String name;

}
