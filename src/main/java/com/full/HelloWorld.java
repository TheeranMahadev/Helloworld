package com.full;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HelloWorld extends HttpServlet
{

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException 
  {
    PrintWriter out = resp.getWriter();
    out.println("Hello hai from the gradle!!!!!!!");
    out.println("Hello hai from the gradle!!!!!!!");

   
    
  
  }
}
