package org.jsp.springannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyDataSource {
	@Value(value="${dbuser.username}")
	private String username;
	@Value(value="${dbuser.password}")
	private String password;
	@Value(value="${dbuser.url}")
	private String url;
	@Value(value="${dbuser.driverClassName}")
	private String driverClassName;
	@Value(value="${dbuser.mappingResource}")
	private String mappingResource;
	@Value(value="${dbuser.hbm2ddl}")
	private String hbm2ddl;
	@Value(value="${dbuser.dialect}")
	private String dialect;
	@Value(value="${dbuser.format_sql}")
	private String format_sql;
	@Value(value="${dbuser.show_sql}")
	private String show_sql;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public String getMappingResource() {
		return mappingResource;
	}
	public void setMappingResource(String mappingResource) {
		this.mappingResource = mappingResource;
	}
	public String getHbm2ddl() {
		return hbm2ddl;
	}
	public void setHbm2ddl(String hbm2ddl) {
		this.hbm2ddl = hbm2ddl;
	}
	public String getDialect() {
		return dialect;
	}
	public void setDialect(String dialect) {
		this.dialect = dialect;
	}
	public String getFormat_sql() {
		return format_sql;
	}
	public void setFormat_sql(String format_sql) {
		this.format_sql = format_sql;
	}
	public String getShow_sql() {
		return show_sql;
	}
	public void setShow_sql(String show_sql) {
		this.show_sql = show_sql;
	}
	
	public void display() {
		System.out.println("UserName : "+username);
		System.out.println("Pssword : "+password);
		System.out.println("URL : "+url);
		System.out.println("DriverClassName : "+driverClassName);
		System.out.println("MappingResource : "+mappingResource);
		System.out.println("hbm2ddl : "+hbm2ddl);
		System.out.println("Dialect : "+dialect);
		System.out.println("format_sql : "+format_sql);
		System.out.println("show_sql : "+show_sql);
		
	}

}
