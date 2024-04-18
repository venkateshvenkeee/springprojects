package org.jsp.springautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CheckBalance {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(SpringAutowiringConf.class);
	PhonePe p=context.getBean(PhonePe.class);
	System.out.println(p.getAccount().getBalance());
}
}
