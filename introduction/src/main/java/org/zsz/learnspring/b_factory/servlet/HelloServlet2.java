package org.zsz.learnspring.b_factory.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.zsz.learnspring.b_factory.service.DemoService;
import org.zsz.learnspring.b_factory.service.impl.DemoServiceImpl;

/**
 * @author Zhang Shengzhe
 * @create 2022-10-26 14:41
 */
@WebServlet(urlPatterns = "/hello-servlet2")
public class HelloServlet2 extends HttpServlet {

  private final DemoService service = new DemoServiceImpl();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.getWriter().println(service.findAll().toString());
  }

}
