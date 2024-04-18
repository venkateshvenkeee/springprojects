package org.jsp.springautowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private Engine e;

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

}
