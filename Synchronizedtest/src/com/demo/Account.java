package com.demo;

public class Account {
	private int balance = 3000;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {

		balance = balance - amount;
	}

}
