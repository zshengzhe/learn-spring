package org.zsz.learnspring.a_original.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.zsz.learnspring.a_original.service.DemoService;
import org.zsz.learnspring.a_original.service.impl.DemoServiceImpl;

/**
 * @author Zhang Shengzhe
 * @create 2022-10-26 14:41
 */
@WebServlet(urlPatterns = "/hello-servlet1")
public class HelloServlet1 extends HttpServlet {

  private final DemoService service = new DemoServiceImpl();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.getWriter().println(service.findAll().toString());
  }

}
