package org.jsp.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPhonePe {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext("org.jsp.springannotation");
	PhonePe pe=context.getBean("myPhonePe", PhonePe.class);
	pe.open();
}
}
