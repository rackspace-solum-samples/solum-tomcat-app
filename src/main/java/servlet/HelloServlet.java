package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyServlet", urlPatterns = {"/"})
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
      String port = System.getenv("PORT");
      String user = System.getenv("user");
      String password = System.getenv("password");
      String key = System.getenv("key");

      req.setAttribute("port", port);
      req.setAttribute("user", user);
      req.setAttribute("password", password);
      req.setAttribute("key", key);

      req.getRequestDispatcher("/home.jsp").forward(req, resp);
    }
    
}
