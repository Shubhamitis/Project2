package AxisMavvenn1.Axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTesting {

	@Test
	public void invokechrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kambl\\OneDrive\\Desktop\\MavenChrome\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");

	}

	@Test
	public void invokeedge() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\kambl\\OneDrive\\Desktop\\MavenEdge\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");

	}

}