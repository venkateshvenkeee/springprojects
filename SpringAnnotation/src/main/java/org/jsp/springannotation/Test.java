package org.jsp.springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.register(Bike.class);
	context.refresh();
	Bike b=context.getBean("bike",Bike.class);
	b.start();
}
}
