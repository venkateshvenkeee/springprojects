package org.jsp.springautowiring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ICICI  implements BankAccount{
private double balance;
	@Override
	public double getBalance() {
		return balance;
	}

}
