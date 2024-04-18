package org.jsp.SpringAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBatch {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("batch.xml");
	Batch batch=context.getBean("batch", Batch.class);
	System.out.println("Initializing using setter");
	System.out.println("Names : "+batch.getNames());
	System.out.println("Phone Numbers : "+batch.getPhone_ns());
	System.out.println("Details : "+batch.getDetails());
	System.out.println("----------------");
	System.out.println("Initializing using constructor");
	Batch batch1=context.getBean("batch1", Batch.class);
	System.out.println("Names : "+batch1.getNames());
	System.out.println("Phone Numbers : "+batch1.getPhone_ns());
	System.out.println("Details : "+batch1.getDetails());
}
}
