package com.usa.ttech.practicecode;

import java.util.ArrayList;
import java.util.List;

import com.db.util.connect.DatabaseList;

public class sczcds {

	
	public static void main(String[] args) throws Throwable {
		
		String a="select salary from employees";
		List<String> dbvalue = new ArrayList<>();
		dbvalue=DatabaseList.getDataTableColumn(a, "salary");
		System.out.println(dbvalue.toString());
		
		// value excel or app
		
		
		//validation
		
	}
}
