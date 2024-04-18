package org.jsp.SpringAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSessionFactory {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("session-factory.xml");
		MySessionFactory factory = context.getBean("mysessionfactory", MySessionFactory.class);
		System.out.println("Password : " + factory.getDataSource().getPassword());
		System.out.println("URL : " + factory.getDataSource().getUrl());
		System.out.println("UserName : " + factory.getDataSource().getUsername());
		System.out.println("Driver Name : " + factory.getDataSource().getDriverClassName());
		System.out.println("Hibernate Properties : " + factory.getHibernateProperties());
		System.out.println("Resources : " + factory.getMappingResource());
	}
}
