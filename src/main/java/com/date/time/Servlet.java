package com.date.time;


import java.io.PrintWriter;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
   This servlet prints out the current date and time.
*/
@WebServlet(urlPatterns = { "/home" })
public class Servlet extends HttpServlet
{
   public void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException
   {
      // get information
      String now = new Date().toString();

      // set content type to HTML
      response.setContentType("text/html");

      // print formatted information
      PrintWriter out = response.getWriter();

      String title = "Current Time";
      out.println("<html><head><title>");
      out.println(title);
      out.println("</title></head><body><h1>");
      out.print(title);
      out.println("</h1><p>The current time is: ");
      out.println(now);
      out.println("</p></body></html>");

      out.close();
   }
}
