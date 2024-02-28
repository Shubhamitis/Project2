package AxisMavvenn1.Axis;

import org.testng.annotations.Test;

public class Grouping {
	
	
	@Test(groups = {"Sanity" , "Regression"})
	
	public void login() {
		
		System.out.println("User is logged in");
	}
	
	@Test(groups = {"Regression"})
	
	public void Addtocart() {
		
		System.out.println("Product added to cart");
	}
	
	@Test(groups = {"Sanity"})
	
	public void Products() {
		
		System.out.println("Product listed in the cart");
	}

}
