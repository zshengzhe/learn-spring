package org.zsz.learnspring.basic_di.e_jsr250.bean;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

/**
 * @author linus
 */
@Component("administrator")
@Data
@Accessors(chain = true)
public class Person {

  private String name = "administrator";

}
