package org.zsz.learnspring.basic_di.g_complexfield.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import lombok.Data;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-03 17:17
 */
@Data
public class Person {

  private String[] names;

  private List<String> tels;

  private Set<Cat> cats;

  private Map<String, Object> events;

  private Properties props;

}
