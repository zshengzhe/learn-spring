package org.zsz.learnspring.basic_di.i_lazyinject.bean;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-04 11:03
 */
@Component
public class Dog {

  private Person person;

  @Autowired
  public void setPerson(ObjectProvider<Person> person) {
    // 如果没有Bean，则采用缺省策略创建
    this.person = person.getIfAvailable(Person::new);
  }

}
