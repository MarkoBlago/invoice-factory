package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class Browser {

	static WebDriver driver;
	
	@BeforeSuite
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public static void tearDown() {
		driver.close();
	}
	
	@AfterTest
	public void clearCoockies() {
		driver.manage().deleteAllCookies();
	}
	
}
