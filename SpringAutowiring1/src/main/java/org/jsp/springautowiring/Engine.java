package org.jsp.springautowiring;

import org.springframework.stereotype.Component;

@Component
public class Engine {
 public void start() {
	 System.out.println("Engine started");
 }
}
