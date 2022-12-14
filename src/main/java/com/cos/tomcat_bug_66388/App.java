package com.cos.tomcat_bug_66388;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Set;

/**
 * @author Réda Housni Alaoui
 */
public class App implements ServletContainerInitializer {

  public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
    Enumeration<URL> resources;
    try {
      resources = getClass().getClassLoader().getResources("a a.txt");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    while (resources.hasMoreElements()) {
      URL element = resources.nextElement();
      assert element != null;
    }
  }
}
