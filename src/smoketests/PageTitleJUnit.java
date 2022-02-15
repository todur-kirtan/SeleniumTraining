package smoketests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;



public class PageTitleJUnit {
	// Declare variables and objects at a CLASS level in order to access in multiple methods throughout the program
	WebDriver driver;
	String URL = "https://demo.guru99.com/test/newtours/index.php";
	
	@Test
	public void pageTitleTest() {
		
		System.out.println("Running the test");
	
		driver.get(URL);
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle =  driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@Before
	public void setUp() {
		System.out.println("Initializing the test");
		driver = utilities.DriverFactory.open("chrome"); 
	}
	
	
	@After
	public void tearDown() {
		System.out.println("Closing the test");
		driver.close();
	}

}
