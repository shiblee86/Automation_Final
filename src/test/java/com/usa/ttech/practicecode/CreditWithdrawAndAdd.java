package com.usa.ttech.practicecode;

public abstract class CreditWithdrawAndAdd {

	static int newbalance;
	public abstract void getbalance(int withdraw);
	
	public abstract void getbalance(String name,int withdraw); 
	
	
	public void getAddMoney(int addmoney) {
		int realbalance =newbalance;
		System.out.println("Add money::"+addmoney);
		int finalbalance=realbalance + addmoney;
		System.out.println("Final balance::"+finalbalance);
		
	}
	
	public void getAddMoney(String name,int addmoney) {
		int realbalance =newbalance;
		int finalbalance=realbalance + addmoney;
		System.out.println(name+"::"+finalbalance);
		
	}

}
