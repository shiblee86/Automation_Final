package com.usa.ttech.practicecode;

public class CallingParmeterMethod {

	public static void main(String[] args) {
		ChildClass child =new ChildClass();
		child.getbalance(3000);
		child.getbalance("Sarower", 3000);
		child.getAddMoney(2000);
		child.getAddMoney("Saimon", 1000);
	}

}
