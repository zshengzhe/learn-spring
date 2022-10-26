package org.zsz.learnspring.b_factory.service.impl;

import java.util.List;
import org.zsz.learnspring.b_factory.dao.DemoDao;
import org.zsz.learnspring.b_factory.dao.impl.DemoDaoImpl;
import org.zsz.learnspring.b_factory.service.DemoService;

/**
 * @author Zhang Shengzhe
 * @create 2022-10-26 14:46
 */
public class DemoServiceImpl implements DemoService {

  private DemoDao dao = new DemoDaoImpl();

  @Override
  public List<String> findAll() {
    return dao.findAll();
  }

}
