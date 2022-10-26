package org.zsz.learnspring.c_reflect.factory;

import org.zsz.learnspring.c_reflect.dao.DemoDao;
import org.zsz.learnspring.c_reflect.service.DemoService;

/**
 * @author Zhang Shengzhe
 * @create 2022-10-26 14:49
 */
public class BeanFactory {

  public static DemoService getDemoService() {
    try {
      return (DemoService) Class.forName("org.zsz.learnspring.c_reflect.service.impl.DemoServiceImpl").newInstance();
    } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
      e.printStackTrace();
      throw new RuntimeException("DemoService instantiation error, cause: " + e.getMessage());
    }
  }

  public static DemoDao getDemoDao() {
    try {
      return (DemoDao) Class.forName("org.zsz.learnspring.c_reflect.dao.impl.DemoMysqlDaoImpl").newInstance();
    } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
      e.printStackTrace();
      throw new RuntimeException("DemoDao instantiation error, cause: " + e.getMessage());
    }
  }

}
