package org.zsz.learnspring.a_original.service.impl;

import java.util.List;
import org.zsz.learnspring.a_original.dao.DemoDao;
import org.zsz.learnspring.a_original.dao.impl.DemoDaoImpl;
import org.zsz.learnspring.a_original.service.DemoService;

/**
 * @author Zhang Shengzhe
 * @create 2022-10-26 14:46
 */
public class DemoServiceImpl implements DemoService {

  private final DemoDao dao = new DemoDaoImpl();

  @Override
  public List<String> findAll() {
    return dao.findAll();
  }

}
