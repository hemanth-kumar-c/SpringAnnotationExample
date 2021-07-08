package com.uttara.SpringAnnotations;

import org.springframework.stereotype.Component;

@Component("cc")
public class CreditCardAccount implements Account {

	public CreditCardAccount() {
		// TODO Auto-generated constructor stub
	}

	public void withDraw(double amount) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
		
	}

	public void credit(double amount) {
		// TODO Auto-generated method stub
		
	}

	public double checkBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

}
