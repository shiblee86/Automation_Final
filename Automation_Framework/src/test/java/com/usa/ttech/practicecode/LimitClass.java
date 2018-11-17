package com.usa.ttech.practicecode;

public class LimitClass {

    private static LimitClass limitobject;
    public static int objCount=0;

    private LimitClass(){
    	//System.out.println("Singleton(): Private constructor invoked");
        objCount++;
    }

    public static synchronized  LimitClass getLimInstance(){
    	
        if(objCount<1 ){
        	limitobject = new LimitClass();
            
        }
        else {
        	limitobject = null;
        }
        return limitobject;
    }
}