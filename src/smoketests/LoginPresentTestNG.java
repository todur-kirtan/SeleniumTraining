package smoketests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPresentTestNG {
	WebDriver driver;
	
	@Test
	public void loginpresenttest() {
		System.out.println("Running Test");
		
		
		boolean loginEmailBox = driver.findElement(By.name("userName")).isDisplayed();
		boolean passwoedBox = driver.findElement(By.name("password")).isDisplayed();
		
		Assert.assertTrue(loginEmailBox, "Login Box Present");
		Assert.assertTrue(passwoedBox, "Password box not present");
	}
	@BeforeMethod
	public void setUp() {
		System.out.println("Starting test");
		String URL = "https://demo.guru99.com/test/newtours/index.php";
	
		driver = utilities.DriverFactory.open("chrome");
		driver.get(URL);
	}
	@AfterMethod
	public void tearDown() {
		System.out.println("Closing Test");
		driver.close();
	}

}
