package com.usa.ttech.practicecode;

public  class Account {

		
		public void getbalance(int withdraw ,int add) {
			
			int balance = 10000;
			
			int finalbalance= (balance-withdraw) +add;
			System.out.println(finalbalance);
		
			
		}

}
