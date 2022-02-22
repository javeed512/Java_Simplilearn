package com.mphasis.abstraction;

public class BankUtil {
	
	
	
	public static IBank getObject() {
		
		
		return  new  BankImp2();
		
	}
	

}
