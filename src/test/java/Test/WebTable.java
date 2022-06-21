package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	WebElement column = driver.findElement(By.xpath("//table//tbody//tr[14]//td[4]"));
	String columnsize= column.getText();
	System.out.println(columnsize);
	List<WebElement> rows = driver.findElements(By.xpath("//table//tbody//tr"));
	int rowsSize = rows.size();
	
	 List<WebElement> currentPrice =driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
	 for(int i=0; i<currentPrice.size();i++)
	 {WebElement price = currentPrice.get(i);
	 String currentPriceValue = price.getText();
	 System.out.println(currentPriceValue);
	 }
}
}
