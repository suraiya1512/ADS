package commonfunctions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Common 
{
public static WebDriver driver ;

	
	@BeforeSuite
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","ChromeDriver138/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}

