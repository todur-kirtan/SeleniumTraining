package demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// 1.Create WebDriver
		System.setProperty("webdriver.gecko.driver", "C:\\SDETuniversity\\Software\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		
		// 2.Open browser to Account Management page >> Click on Create Account
		
		driver.get("https://demo.guru99.com/test/newtours/register_sucess.php");
		driver.findElement(By.linkText("REGISTER")).click();   //linktext is for <a> tag
		
		
		// 3.Fill out the form
		     
		     // How to find elements
		     driver.findElement(By.name("firstName")).sendKeys("Mary");
		     driver.findElement(By.name("lastName")).sendKeys("Smith");
		     driver.findElement(By.id("userName")).sendKeys("MS@Test.com");
		     driver.findElement(By.name("phone")).sendKeys("9923884489");
		     driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Mary_Smith");
		     driver.findElement(By.name("address1")).sendKeys("United States");
		     driver.findElement(By.name("city")).sendKeys("Remmington");
		     driver.findElement(By.name("state")).sendKeys("Wisconson");
		     driver.findElement(By.name("postalCode")).sendKeys("872898");
		     driver.findElement(By.name("password")).sendKeys("Mary_Smith");
		     driver.findElement(By.name("confirmPassword")).sendKeys("Mary_Smith");

		     
		     //How to interact with other HTML elements
		     
		     new Select(driver.findElement(By.name("country"))).selectByVisibleText("UNITED STATES");
		     driver.findElement(By.name("submit")).click();

		     
//		     driver.get("https://demo.guru99.com/test/radio.html");        //Radio buttons and checkbox
//		     driver.findElement(By.cssSelector("input[name='webform'][value='Option 1'")).click();
//		     driver.findElement(By.id("vfb-6-0")).click();                //Checkbox button
//		     driver.findElement(By.id("vfb-6-2")).click();                //Checkbox button
		
		
		     
		     // 4.Get confirmation
		     
		     String conf = driver.findElement(By.linkText("SIGN-OFF")).getText();
		     System.out.println("CONFIRMATION: "+conf );
		
		// 5.Close the Browser
		     driver.close();
		
		
	}

}
