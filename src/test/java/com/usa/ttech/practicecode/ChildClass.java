package com.usa.ttech.practicecode;

public class ChildClass extends CreditWithdrawAndAdd{

	@Override
	public void getbalance(int withdraw)  {
		
		int balance= 10000;
		System.out.println("My credit balance::"+balance);
		System.out.println("withdraw ::"+withdraw);
		
		newbalance=balance - withdraw;
		System.out.println("Balance after withdraw::"+newbalance);
		
	}

	@Override
	public void getbalance(String name, int withdraw) {
		
		int balance= 10000;
		newbalance=balance - withdraw;
		System.out.println(name+"::new balance is::"+newbalance);
		
	}
	
	

}
