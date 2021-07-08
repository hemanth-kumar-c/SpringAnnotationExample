package com.uttara.SpringAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ba")
public class BankAccount implements Account {

	@Value("100000")
	private double balance;
	private String accnum;

	public void withDraw(double amount) {
		// dummy implementation
		balance = balance - amount;
	}

	public void credit(double amount) {
		// TODO Auto-generated method stub
		balance = balance + amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccnum() {
		return accnum;
	}

	public void setAccnum(String accnum) {
		this.accnum = accnum;
	}

	public double checkBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accnum == null) ? 0 : accnum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accnum == null) {
			if (other.accnum != null)
				return false;
		} else if (!accnum.equals(other.accnum))
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + ", accnum=" + accnum + "]";
	}

}
