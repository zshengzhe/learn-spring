package org.zsz.learnspring.basic_di.b_constructor.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author linus
 */
@Data
@AllArgsConstructor
public class Cat {

  private String name;

  private Person father;

}
