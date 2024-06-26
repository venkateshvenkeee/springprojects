package org.jsp.springannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(value={"org.jsp.springannotation"})
@PropertySource(value="app.properties")
public class UserConfig {

}
