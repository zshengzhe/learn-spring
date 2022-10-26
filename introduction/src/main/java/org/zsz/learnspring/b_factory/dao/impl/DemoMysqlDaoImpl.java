package org.zsz.learnspring.b_factory.dao.impl;

import java.util.Arrays;
import java.util.List;
import org.zsz.learnspring.b_factory.dao.DemoDao;

/**
 * @author Zhang Shengzhe
 * @create 2022-10-26 14:50
 */
public class DemoMysqlDaoImpl implements DemoDao {

  @Override
  public List<String> findAll() {
    // jdbc operations ......
    System.out.println("DemoMysqlDaoImpl findAll run ......");
    return Arrays.asList("aaa", "bbb", "ccc");
  }
}
