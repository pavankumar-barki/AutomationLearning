package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
	
	public HomePage (WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy (xpath="//p[text()='UI Testing Concepts']")
	WebElement txtUiClick;
	
	
	public void clickOnUiText() 
	{
		txtUiClick.click();
	}
	
}
