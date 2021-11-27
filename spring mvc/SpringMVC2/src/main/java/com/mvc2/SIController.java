package com.mvc2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servletpage")
public class SIController extends HttpServlet {
   private static final long serialVersionUID = 1L;


        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                     throws ServletException, IOException {
              int principle = Integer.parseInt(request.getParameter("principle"));
         int time = Integer.parseInt(request.getParameter("time"));
              int rate = Integer.parseInt(request.getParameter("rate"));
           float SI = ((principle*time*rate)/(float)100);
            request.setAttribute("Result", SI);
            request.getRequestDispatcher("Result.jsp").forward(request, response);
         

       }

}