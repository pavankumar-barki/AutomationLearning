package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC001_RegisterTest extends BaseClass
{
	
	@Test
    public void testRegisterButton() throws Exception 
	{
        HomePage hp = new HomePage(driver);
        hp.clickOnUiText();
        Thread.sleep(3000);
        
        RegisterPage rp = new RegisterPage(driver);
		rp.setName(p.getProperty("name"));
		 Thread.sleep(3000);
		rp.setEmail(p.getProperty("email"));
		 Thread.sleep(3000);
		rp.setPsw(p.getProperty("password"));
		 Thread.sleep(3000);
		rp.clickRegister();
		 Thread.sleep(1000);
		 
		 Assert.assertTrue(rp.isSucMsgDisplayed());
		 
		 String successMsg = rp.message();
		 Assert.assertEquals(successMsg, "Registered successfully");
		 
		 String title= rp.curTitle();
		 Assert.assertEquals(title, "DemoApps | Qspiders | Text Box");
		 
		 String url= rp.curUrl();
		 Assert.assertEquals(url, "https://demoapps.qspiders.com/ui/login");
		 
		 
	}
}