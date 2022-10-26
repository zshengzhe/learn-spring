package org.zsz.learnspring.c_reflect.service.impl;

import java.util.List;
import org.zsz.learnspring.c_reflect.dao.DemoDao;
import org.zsz.learnspring.c_reflect.factory.BeanFactory;
import org.zsz.learnspring.c_reflect.service.DemoService;

/**
 * @author Zhang Shengzhe
 * @create 2022-10-26 14:46
 */
public class DemoServiceImpl implements DemoService {

  private final DemoDao dao = BeanFactory.getDemoDao();

  @Override
  public List<String> findAll() {
    return dao.findAll();
  }

}
