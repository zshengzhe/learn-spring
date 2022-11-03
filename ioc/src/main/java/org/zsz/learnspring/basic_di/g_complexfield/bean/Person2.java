package org.zsz.learnspring.basic_di.g_complexfield.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Zhang Shengzhe
 * @create 2022-11-03 17:43
 */
@Component
@Data
public class Person2 {

  @Value("#{new String[] {'linus', 'zhangsan'}}")
  private String[] names;

  @Value("#{{'110', '119'}}")
  private List<String> tels;

  @Value("#{{@miaomiao, new org.zsz.learnspring.basic_di.g_complexfield.bean.Cat()}}")
  private Set<Cat> cats;

  @Value("#{{'8.00': '起床', '9.00': @miaomiao.name, '14:00': new org.zsz.learnspring.basic_di.g_complexfield.bean.Cat(), '18:00': '睡觉'}}")
  private Map<String, Object> events;

  @Value("#{{'sex': 'male', 'age': '18'}}")
  private Properties props;

}
