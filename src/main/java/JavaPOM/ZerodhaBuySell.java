package JavaPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ZerodhaBuySell {
@FindBy(xpath="//input[@type='text']") private WebElement search;
@FindBy(xpath ="//span[@class=\"symbol\"])[2]") private WebElement Share;
@FindBy(xpath = "//button[@class='button-blue buy']") private WebElement buy;
@FindBy(xpath="//label[@for='radio-149']") private WebElement bse;
@FindBy(xpath = "//label[@for='radio-150']")private WebElement nse;
@FindBy(xpath = "//div[@id='outer-base']")private WebElement intraday;
@FindBy(xpath="//label[@for='radio-142']") private WebElement radiolongterm;
@FindBy(xpath="//input[@label='Qty.']") private WebElement Quantity;
@FindBy(xpath="//input[@label='price']") private WebElement pricebox;
@FindBy(xpath="//label[@for='radio-186']") private WebElement Radiomarket;
@FindBy(xpath="//label[@for='radio-187']") private WebElement Radiolimit;
@FindBy(xpath="//label[@for='radio-174']") private WebElement Radiostoploss;
@FindBy(xpath="//label[@for='radio-158']") private WebElement stoplossmarket;
@FindBy(xpath="//span[@data-balloon='More options']") private WebElement moreoption;
@FindBy(xpath="//button[@type='submit']") private WebElement submit;
@FindBy(xpath="//button[@class='button-outline cancel']") private WebElement cancel;
@FindBy(xpath="//label[@class='su-switch-control']") private WebElement Switch;
@FindBy(xpath="//button[@class='button-orange sell']") private WebElement sell;
//@FindBy(xpath = "//span[text()='TATAMOTORS']") private WebElement nse;

public ZerodhaBuySell(WebDriver driver) 
 {
	PageFactory.initElements(driver, this);
}
	public void enterShare(String ShareName) {
		search.click();
	search.sendKeys(ShareName);
}
	public void ClickOnBuyButton (WebDriver driver) throws InterruptedException {
	Actions action = new Actions(driver);
	Thread.sleep(2000);
	action.moveToElement(Share).perform();
	Thread.sleep(2000);
	action.moveToElement(buy);
	action.click();
	action.perform();
	}
	public void clickOnbse() throws InterruptedException {
		Thread.sleep(2000);
		bse.click();
	}
	public void clickOnnse() throws InterruptedException {
	Thread.sleep(2000);	
		nse.click();
	}
	public void clickOnintraday() throws InterruptedException {
		Thread.sleep(2000);	
		intraday.click();
		}
	public void clickOnradiolongterm() throws InterruptedException {
		Thread.sleep(2000);	
		radiolongterm.click();
		}
	public void clickOnRadiomarket() throws InterruptedException {
		Thread.sleep(2000);	
		Radiomarket.click();
		}
	public void clickOnsubmit() throws InterruptedException {
		Thread.sleep(2000);	
		submit.click();
		}
	public void clickOnSwitch() throws InterruptedException {
		Thread.sleep(2000);	
		Switch.click();
		}
	
	public void sell() {
		sell.click();}
	
}