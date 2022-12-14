package com.cos.tomcat_bug_66388.war;

import static java.util.Objects.*;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import java.util.Set;

/**
 * @author Réda Housni Alaoui
 */
public class App implements ServletContainerInitializer {

  public void onStartup(Set<Class<?>> c, ServletContext ctx) {
    String resourceName = "/a a.txt";
    requireNonNull(
        getClass().getResource(resourceName), "Could not find '%s'".formatted(resourceName));

    System.out.println("Found '%s'".formatted(resourceName));
  }
}
