package AxisMavvenn1.Axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvokeChromeBrowser {
	
	@Test

	public void InvokeChrome() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kambl\\OneDrive\\Desktop\\MavenChrome\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				Thread.sleep(500);
		// TODO Auto-generated method stub

	}

}
