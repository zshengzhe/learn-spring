package org.zsz.learnspring.e_cachedfactory.factory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author Zhang Shengzhe
 * @create 2022-10-26 14:49
 */
public class BeanFactory {

  // 缓存区，保存已经创建好的对象
  private static final Map<String, Object> BEAN_MAP = new HashMap<>();

  private static Properties PROPERTIES;

  // 使用静态代码块初始化properties，加载factory_d.properties文件
  static {
    PROPERTIES = new Properties();
    try {
      PROPERTIES.load(BeanFactory.class.getClassLoader().getResourceAsStream("e_cachedfactory/factory.properties"));
    } catch (IOException e) {
      throw new ExceptionInInitializerError("BeanFactory initialize error, cause: " + e.getMessage());
    }
  }

  public static Object getBean(String beanName) {
    // 双检锁保证beanMap中确实没有beanName对应的对象
    if (!BEAN_MAP.containsKey(beanName)) {
      synchronized (BeanFactory.class) {
        if (!BEAN_MAP.containsKey(beanName)) {
          // 过了双检锁，证明确实没有，可以执行反射创建
          try {
            Class<?> beanClazz = Class.forName(PROPERTIES.getProperty(beanName));
            Object bean = beanClazz.newInstance();
            // 反射创建后放入缓存再返回
            BEAN_MAP.put(beanName, bean);
          } catch (ClassNotFoundException e) {
            throw new RuntimeException("BeanFactory have not [" + beanName + "] bean!", e);
          } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException("[" + beanName + "] instantiation error!", e);
          }
        }
      }
    }
    return BEAN_MAP.get(beanName);
  }

}
