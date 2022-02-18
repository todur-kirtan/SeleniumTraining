package smoketests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATagsTest {

	WebDriver driver;
	
	@Test
	public void loginpresenttest() {
		System.out.println("Running Test");
		
		boolean createAccountPresrnt = false;
		List <WebElement> aElements = driver.findElements(By.tagName("a"));
		int numberOfAElements = aElements.size();
		System.out.println("There are "+ numberOfAElements + "a tags on the page");
		for(WebElement aElement : aElements) {
			System.out.println(aElement.getText());
			if(aElement.getText().equalsIgnoreCase("REGISTER")) {
				createAccountPresrnt = true;
			}
		}
		
		Assert.assertTrue(createAccountPresrnt);
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
