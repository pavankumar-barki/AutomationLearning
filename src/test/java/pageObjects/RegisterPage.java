package pageObjects;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage
{
	Properties p;
	
	public RegisterPage (WebDriver driver, Properties p) 
	{
		super(driver);
		this.p = p;
	}
	
	@FindBy(xpath="//input[@id='name']")
	WebElement txtName;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txtPsw;
	
	@FindBy(xpath="//button[text()='Register']")
	WebElement btnRegister;
	
	@FindBy(xpath = "//*[@id=\"demoUI\"]/div/div/div/div[2]")
	WebElement successMessage;
	
	@FindBy(xpath = "//button[text()='Login']")
	WebElement btnLogin;
	
	public void setName() 
	{
		txtName.sendKeys(p.getProperty("name"));
	}
	
	public void setEmail(String email) 
	{
		txtEmail.sendKeys(email);
	}
	
	public void setPsw(String psw) 
	{
		txtPsw.sendKeys(psw);
	}
	
	public void clickRegister() 
	{
		btnRegister.click();
	}
	
	public String message() throws Exception
	{
		return successMessage.getText();
	}
	
	public boolean isSucMsgDisplayed()
	{
		return successMessage.isDisplayed();
	}
	
	public boolean isLoginPageDisplayed()
	{
		return btnLogin.isDisplayed();
	}
	
	public String curTitle()
	{
		return driver.getTitle();
	}
	
	public String curUrl()
	{
		return driver.getCurrentUrl();
	}
}
