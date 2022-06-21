package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
		public static WebDriver openBrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://kite.zerodha.com/");
			return driver;
		}

}