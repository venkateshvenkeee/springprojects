package org.jsp.SpringAutowiring;

import java.util.List;
import java.util.Properties;

public class MySessionFactory {
	private MyDataSource dataSource;
	private List<String> mappingResource;
	private Properties hibernateProperties;
	public MyDataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(MyDataSource dataSource) {
		this.dataSource = dataSource;
	}
	public List<String> getMappingResource() {
		return mappingResource;
	}
	public void setMappingResource(List<String> mappingResource) {
		this.mappingResource = mappingResource;
	}
	public Properties getHibernateProperties() {
		return hibernateProperties;
	}
	public void setHibernateProperties(Properties hibernateProperties) {
		this.hibernateProperties = hibernateProperties;
	}

}
