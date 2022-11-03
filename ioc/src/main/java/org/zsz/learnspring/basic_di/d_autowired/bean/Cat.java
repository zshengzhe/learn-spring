package org.zsz.learnspring.basic_di.d_autowired.bean;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author linus
 */
@Data
@Accessors(chain = true)
public class Cat {

  private String name;

  private Person person;

}
