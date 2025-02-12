package testBase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass 
{
	public WebDriver driver;
	public Properties p;
	
	@BeforeClass
	public void setUp() throws IOException
	{
		FileReader file = new FileReader("./src/test/resources/config.properties");  //this method is for config.prop load
		p = new Properties();
		p.load(file);
		
		WebDriverManager.chromedriver().driverVersion("132.0.6834.160").setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL"));
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
