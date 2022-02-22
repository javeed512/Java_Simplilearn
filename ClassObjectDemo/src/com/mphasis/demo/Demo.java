package com.mphasis.demo;

import java.lang.*; //default

public class Demo extends Object {

	public Demo() {
		
		System.out.println("Demo object created...");
		
	}
	
	public Demo(int x) {
		
		
	}
	
	
	public static void main(String[] args) {

		
		Demo	demo =	  new  Demo();
				  
			String str =	  new String("javeed");
			
			int  eid = 101;
			
			System.out.println(eid); //101
			
			
			System.out.println(demo); //hashcode

		
			System.out.println(str.toString());
			
	}

}
