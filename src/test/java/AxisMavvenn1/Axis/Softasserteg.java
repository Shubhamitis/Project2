package AxisMavvenn1.Axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softasserteg {
	
	@Test
	
	public void testofassert() throws InterruptedException{
		
		SoftAssert st = new SoftAssert();
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kambl\\OneDrive\\Desktop\\MavenChrome\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				Thread.sleep(500);
				
				
				
				String actualTitle = driver.getTitle();
				
				String expectedTitle = "Orange";
				
				st.assertEquals(actualTitle, expectedTitle);
				
				driver.findElement(By.xpath("//input=[@name = 'username']")).sendKeys("Admin");
				
				driver.close();
				
	}

}
