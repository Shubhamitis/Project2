package AxisMavvenn1.Axis;
import org.testng.annotations.Test; 
public class Priority {

@Test (priority = 0)

public void testcasel () 
{ 
	System.out.println("testcasel excetued sucessfully"); 
	}

@Test (priority = 2) 
public void testcase2 () 
{ 
	System.out.println("testcase2 excetued sucessfully"); 
	} 
@Test (priority = 1) 
public void testcase3 () 
	{ 
		System.out.println("testcase3 excetued sucessfully"); 
		}
	
}