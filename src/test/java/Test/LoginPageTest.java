package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import JavaPOM.ZerodhaLoginPage;
import JavaUTILITY.Parametrization;
import POJO.Browser;

public class LoginPageTest {
WebDriver driver;
@BeforeMethod
public void LaunchBrowser() {
	driver = Browser.openBrowser();
}
@Test
public void LoginWithCredentialTest() throws EncryptedDocumentException, IOException {
	ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
	String UserName=Parametrization.getData(0, 1);
	String Password=Parametrization.getData(1,1);
	zerodhaloginpage.UserID(UserName);
	zerodhaloginpage.enterPassword(Password);
	zerodhaloginpage.clickOnLogin();
}
@Test	
public void ForgotPasswordLinkTest() {
	ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
	zerodhaLoginPage.clickOnForgot();
}
@Test
public void SignUpLinkTest() {
ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
zerodhaLoginPage.clickOnSignUp();

}
@AfterMethod
 public void close() {
 driver.quit();
}
@Test
public void test() {
	System.out.println("New test added for git purpose");
}
}
