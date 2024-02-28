package AxisMavvenn1.Axis;

import org.testng.annotations.Test;

public class Dependsonmethod {

	@Test(enabled = false)
	
	public void testcase1(){
		
		
		System.out.println("Testcase1 executed successfully");
		
		

	}
	
	@Test(dependsOnMethods = "testcase1")
	public void testcase2(){
		
		
		System.out.println("Testcase2 executed successfully");
		
		

	}
	
	@Test
	public void testcase3(){
		
		
		System.out.println("Testcase3 executed successfully");
		
		

	}



}
