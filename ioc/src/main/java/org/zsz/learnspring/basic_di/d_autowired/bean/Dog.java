package org.zsz.learnspring.basic_di.d_autowired.bean;

import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-03 16:04
 */
@Component
@Data
@Accessors(chain = true)
public class Dog {

  @Value("dogdog")
  private String name;

  @Autowired
  @Qualifier("administrator")
  private Person person;

  @Autowired
  private Person administrator;

  @Autowired
  private List<Person> people;

}
