package org.jsp.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDataSource {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(DataSourceConfig.class);
	MyDataSource ds=context.getBean(MyDataSource.class);
	ds.display();
}
}
