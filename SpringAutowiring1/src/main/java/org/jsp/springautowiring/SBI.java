package org.jsp.springautowiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
public class SBI implements BankAccount {
	@Value(value="5678")
	private double balance;

	@Override
	public double getBalance() {
		return balance;
	}

}
