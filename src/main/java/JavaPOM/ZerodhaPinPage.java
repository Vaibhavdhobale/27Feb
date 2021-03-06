package JavaPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaPinPage {
	
@FindBy(xpath ="//input[@type='password']")private WebElement Pin;
@FindBy(xpath = "//button[@type='submit']") private WebElement Submit;
@FindBy(xpath = "//a[text()='Forgot 2FA?']")private WebElement forgot;
@FindBy(xpath = "//a[text()='Don't have an account? Signup now!']") private WebElement signup;

public ZerodhaPinPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	public void enterpin(String pinNumber) {
	Pin.sendKeys(pinNumber);
	}
	public void clickOnContinue() {
		Submit.click();
	}
	public void clickOnForgot() {
		forgot.click();
	}
	public void clickOnSignUp() {
		signup.click();
	}
}


