package org.jsp.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCredentials {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(UserConfig.class);
	Credentials c=context.getBean("credentials",Credentials.class);
	System.out.println(c);
}
}
