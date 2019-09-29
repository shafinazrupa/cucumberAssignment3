package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser() {
		//Set Chrome driver properties
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//Create ChromeDriver object and launch chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get(" http://techfios.com/test/101/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Return the driver to the Test class
		return driver;
		
	}
}
