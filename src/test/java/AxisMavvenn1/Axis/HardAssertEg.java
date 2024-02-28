package AxisMavvenn1.Axis;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HardAssertEg {
	
	@SuppressWarnings("deprecation")
	@Test
	
	public void testhardassert() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kambl\\OneDrive\\Desktop\\MavenChrome\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				Thread.sleep(500);
				
				
				
				String actualTitle = driver.getTitle();
				
				String expectedTitle = "Orange";
				
				Assert.assertEquals(actualTitle,expectedTitle);
				
				driver.findElement(By.xpath("//input=[@name = 'username']")).sendKeys("Admin");
				
				driver.close();
	}

}
