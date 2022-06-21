package Test;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import JavaPOM.ZerodhaBuySell;
import JavaPOM.ZerodhaLoginPage;
import JavaPOM.ZerodhaPinPage;
import JavaUTILITY.Parametrization;
import POJO.Browser;

public class PinPageandBuySellTEST {
WebDriver driver;
@BeforeMethod
public void LaunchBrowser() {
	driver = Browser.openBrowser();
}
@Test
	public void LogintoZerodhaWithPinTest() throws EncryptedDocumentException, IOException, InterruptedException{
		ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		String UserName=Parametrization.getData(0, 1);
		String Password=Parametrization.getData(1,1);
		zerodhaloginpage.UserID(UserName);
		zerodhaloginpage.enterPassword(Password);
		zerodhaloginpage.clickOnLogin();
		Thread.sleep(3000);
		ZerodhaPinPage zerodhaPinPage = new ZerodhaPinPage(driver);
    	String Pin = Parametrization.getData(2,1);
    	System.out.println(Pin);
		zerodhaPinPage.enterpin(Pin);
		zerodhaPinPage.clickOnContinue();

      ZerodhaBuySell zerodhaBuySell = new ZerodhaBuySell(driver);
      String ShareName = Parametrization.getData(3,1);
      System.out.println(ShareName);
      Thread.sleep(2000);
      zerodhaBuySell.enterShare(ShareName);
      zerodhaBuySell.ClickOnBuyButton(driver);
      Thread.sleep(2000);
      ScreenShot.TakeScreenShot(driver,1);
      ZerodhaBuySell.cl
      
      
}
      
}  
      
      
      
      
      
      
      
      
      
      
      
      
      
      