package org.jsp.SpringAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycleByApplicationContext {
	public static void main(String[] args) {
//	ApplicationContext context=new ClassPathXmlApplicationContext("lifecycle.xml");
//	System.out.println("--------");
//	System.out.println(context.getBean("demo"));
//	System.out.println(context.getBean("demo"));
//	System.out.println(context.getBean("demo"));
//	System.out.println(context.getBean("demo"));
//	((ClassPathXmlApplicationContext) context).close();

		ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle1.xml");
		System.out.println("--------");
		System.out.println(context.getBean("demo1"));
		System.out.println(context.getBean("demo1"));
		((ClassPathXmlApplicationContext) context).close();
	}
}
