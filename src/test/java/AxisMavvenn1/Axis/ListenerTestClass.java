package AxisMavvenn1.Axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listener.class)

public class ListenerTestClass {
	
@Test	
	public void InvokeChrome() throws InterruptedException{
		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\kambl\\OneDrive\\Desktop\\MavenChrome\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");
//				WebDriver driver = new ChromeDriver();
//				
				
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\kambl\\OneDrive\\Desktop\\MavenEdge\\edgedriver_win64/msedgedriver.exe");
						WebDriver driver = new EdgeDriver();
				driver.get("https://www.Selen.dev/");
				driver.manage().window().maximize();
				Thread.sleep(500);
				
				driver.close();

	}
	
}
