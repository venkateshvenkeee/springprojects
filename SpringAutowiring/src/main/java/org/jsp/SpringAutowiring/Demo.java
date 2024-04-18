package org.jsp.SpringAutowiring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Demo implements InitializingBean,DisposableBean{
static {
	System.out.println("Demo class is loaded");
}
public Demo() {
	System.out.println("Demo object is created");
}

@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("Initializing the Object");
	
}
@Override
public void destroy() throws Exception {
	System.out.println("Demo object is destroyed");
	
}

}
