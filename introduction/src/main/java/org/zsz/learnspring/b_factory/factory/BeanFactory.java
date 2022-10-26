package org.zsz.learnspring.b_factory.factory;

import org.zsz.learnspring.b_factory.dao.DemoDao;
import org.zsz.learnspring.b_factory.dao.impl.DemoMysqlDaoImpl;

/**
 * @author Zhang Shengzhe
 * @create 2022-10-26 14:49
 */
public class BeanFactory {

  public static DemoDao getDemoDao() {
    return new DemoMysqlDaoImpl();
  }

}
