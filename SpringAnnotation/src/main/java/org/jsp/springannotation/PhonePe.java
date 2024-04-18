package org.jsp.springannotation;

import org.springframework.stereotype.Component;

@Component(value="myPhonePe")
public class PhonePe {
	public void open() {
		System.out.println("Welcome to PhonePe");
	}
}
