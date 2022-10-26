package org.zsz.learnspring.c_reflect.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.zsz.learnspring.c_reflect.factory.BeanFactory;
import org.zsz.learnspring.c_reflect.service.DemoService;
import org.zsz.learnspring.c_reflect.service.impl.DemoServiceImpl;

/**
 * @author Zhang Shengzhe
 * @create 2022-10-26 14:41
 */
@WebServlet(urlPatterns = "/hello-servlet3")
public class HelloServlet3 extends HttpServlet {

  private final DemoService service = BeanFactory.getDemoService();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.getWriter().println(service.findAll().toString());
  }

}
