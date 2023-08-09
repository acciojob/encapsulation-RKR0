package com.driver;

public class Main {
  
	public static void main(String[] args) {
		
		RWOnly obj = new RWOnly();
		//obj.name = "RK";
		
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//The field RWOnly.name is not visible
		//at com.driver.Main.main(Main.java:8)
		
		obj.setName("RK");
	}
}