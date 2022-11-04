package org.zsz.learnspring.bean.b_scope.bean;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-04 15:25
 */
@Data
@Accessors(chain = true)
public class Child {

  private Toy toy;

}
