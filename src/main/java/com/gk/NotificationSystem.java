package com.gk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.gk")
@Configuration
public class NotificationSystem
{
    public static void main( String[] args )
    {
        ApplicationContext ctx= new AnnotationConfigApplicationContext(NotificationSystem.class);
              for(String s: ctx.getBeanDefinitionNames()) {
                  System.out.println(s);
              }
    }
}
