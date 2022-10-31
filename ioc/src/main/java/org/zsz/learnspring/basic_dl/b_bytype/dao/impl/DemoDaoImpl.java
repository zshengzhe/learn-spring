package org.zsz.learnspring.basic_dl.b_bytype.dao.impl;

import java.util.Arrays;
import java.util.List;
import org.zsz.learnspring.basic_dl.b_bytype.dao.DemoDao;

public class DemoDaoImpl implements DemoDao {

  @Override
  public List<String> findAll() {
    return Arrays.asList("aaa", "bbb", "ccc");
  }

}
