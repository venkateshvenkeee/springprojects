package org.jsp.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBank {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
	BankAccount account=context.getBean(BankAccount.class);
	System.out.println(account);
}
}
