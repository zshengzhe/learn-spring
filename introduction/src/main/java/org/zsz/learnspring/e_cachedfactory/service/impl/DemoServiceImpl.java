package org.zsz.learnspring.e_cachedfactory.service.impl;

import java.util.List;
import org.zsz.learnspring.e_cachedfactory.dao.DemoDao;
import org.zsz.learnspring.e_cachedfactory.factory.BeanFactory;
import org.zsz.learnspring.e_cachedfactory.service.DemoService;

/**
 * @author Zhang Shengzhe
 * @create 2022-10-26 14:46
 */
public class DemoServiceImpl implements DemoService {

  private final DemoDao dao = (DemoDao) BeanFactory.getBean("demoDao");

  @Override
  public List<String> findAll() {
    return dao.findAll();
  }

}
