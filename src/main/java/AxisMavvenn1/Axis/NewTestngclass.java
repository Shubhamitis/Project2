package AxisMavvenn1.Axis;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



public class NewTestngclass {
	WebDriver driver;
	
//	@BeforeTest

	
	@Test
	public void configLogin()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kambl\\OneDrive\\Desktop\\MavenChrome\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("k799.karunakara@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		
	}

	
	@Test
	public void configLogin1()
	{
		Assert.assertTrue(driver.findElement(By.linkText("Change your password")).isDisplayed());
		
		System.out.println("hxhh");
	}
	
    @AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}