package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameter_demo_2 {
	WebDriver driver ;

	
	@BeforeClass
	@Parameters({"browser"})

	void setup(String browserName )

	{  
		if(browserName .equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
		}

		else if (browserName .equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
		}
	}

	@AfterClass
	void tearDown()
	{
		driver.close();

	}

	@Test

	void verifyPageTitle()
	{
		String ExpectedPageTitle ="Google";
		String ActualTitle=driver.getTitle();

		Assert.assertEquals(ActualTitle,ExpectedPageTitle,"Title is not matching" );

	}

	@Test
	void verifyuGoogleImageDisplayed ()
	{

		WebElement image =driver.findElement(By.xpath("//img[@alt=\"Google\"]"));

		Assert.assertFalse(image.isDisplayed(), "Google image is displayed.");
	}

}
