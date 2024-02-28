package AxisMavvenn1.Axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Parameterized {
	

	@Test
	@Parameters("browser")
	public void parameterizedtest(String browser) {
		
		if (browser.equals("chrome")) {
	
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\kambl\\OneDrive\\Desktop\\MavenChrome\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
	}else {

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\kambl\\OneDrive\\Desktop\\MavenEdge\\edgedriver_win64/msedgedriver.exe");
				
				WebDriver driver = new EdgeDriver();
				
				driver.get("https://www.selenium.dev/");
				
		
		
	}
		
	}
}
