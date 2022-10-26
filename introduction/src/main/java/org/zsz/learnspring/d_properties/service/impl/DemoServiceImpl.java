package org.zsz.learnspring.d_properties.service.impl;

import java.util.List;
import org.zsz.learnspring.d_properties.dao.DemoDao;
import org.zsz.learnspring.d_properties.factory.BeanFactory;
import org.zsz.learnspring.d_properties.service.DemoService;

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
