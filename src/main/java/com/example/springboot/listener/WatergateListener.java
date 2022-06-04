package com.example.springboot.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class WatergateListener implements ServletRequestListener{
  @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent){
      System.out.println("1");
  }
  @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent){
      System.out.println("2");
      String name = servletRequestEvent.getServletRequest().getParameter("name");
      System.out.println("name" + name);
  }
}
