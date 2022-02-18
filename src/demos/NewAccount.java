package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewAccount {

	public static void main(String[] args) {
		
		// 2.Open browser to Account Management page >> Click on Create Account
		String browserType = "firefox";
		WebDriver driver;
		driver = utilities.DriverFactory.open(browserType);
		
		
		String firstname = "Mary";
		String lastname = "Smith";
		String username = "MS@Test.com";
		String phonenum = "9923884489";
		String email = "Mary_Smith";
		String address = "United States";
		String City = "Remmington";
		String State = "Wisconson";
		String postalcode = "872898";
		String passwrd = "Mary_Smith";
		String Country = "UNITED STATES";
		
		String radiobutton = "option1";
		boolean checkbox1 = true;
		boolean checkbox2 = false;
		boolean checkbox3 = false;

		
//		driver.get("https://demo.guru99.com/test/radio.html");        //Radio buttons and checkbox
		
		driver.get("https://demo.guru99.com/test/newtours/register_sucess.php");
		driver.findElement(By.linkText("REGISTER")).click();   //linktext is for <a> tag
		
		// Define WebElements
		
		WebElement nameElement = driver.findElement(By.name("firstName"));
		WebElement lastnameElement = driver.findElement(By.name("lastName"));
		WebElement usernameElement = driver.findElement(By.id("userName"));
		WebElement phoneElements = driver.findElement(By.name("phone"));
		WebElement emailElement = driver.findElement(By.cssSelector("input[name='email']"));
		WebElement addressElement = driver.findElement(By.name("address1"));
		WebElement cityElement = driver.findElement(By.name("city"));
		WebElement stateElement = driver.findElement(By.name("state"));
		WebElement postalElement = driver.findElement(By.name("postalCode"));
		WebElement passwordElement = driver.findElement(By.name("password"));
		WebElement confirmpassElement = driver.findElement(By.name("confirmPassword"));
		
//		WebElement option2Element = driver.findElement(By.cssSelector("input[name='webform'][value='Option 2'"));
//		WebElement option1Element = driver.findElement(By.cssSelector("input[name='webform'][value='Option 1'"));
//		WebElement checkbox1Element = driver.findElement(By.id("vfb-6-0"));
//		WebElement checkbox2Element = driver.findElement(By.id("vfb-6-2"));

		
		
		
		// 3.Fill out the form
		  
		nameElement.sendKeys(firstname);
		lastnameElement.sendKeys(lastname);
		usernameElement.sendKeys(username);
		phoneElements.sendKeys("9923884489");
		emailElement.sendKeys(email);
		addressElement.sendKeys(address);
		cityElement.sendKeys(City);
		stateElement.sendKeys(State);
		postalElement.sendKeys(postalcode);
		passwordElement.sendKeys(passwrd);
		confirmpassElement.sendKeys(passwrd);

		     
		//How to interact with other HTML elements

				     new Select(driver.findElement(By.name("country"))).selectByVisibleText(Country);
				     driver.findElement(By.name("submit")).click();
		
	
				     //Radio button algorithm
				     //		if(radiobutton.equalsIgnoreCase("option2")) {
				     //			option2Element.click();
				     //		}
				     //		else {
				     //			option1Element.click();

				     //		}

				     //Check Box algorithm

				     //		if(checkbox1) {
				     //			if(!checkbox1Element.isSelected()) {
				     //				checkbox1Element.click();
				     //			}
				     //		}
				     //		else {
				     //			if(checkbox1Element.isSelected()) {
				     //				checkbox1Element.click();
				     //			}
				     //		}
				     //		
				     //		                
				     //		checkbox2Element.click();                //Checkbox button
		
		
		     
				     // 4.Get confirmation

				     String conf = driver.findElement(By.linkText("SIGN-OFF")).getText();
				     String Expected = "SIGN-OFF";
				     if(conf.contains(Expected)) {
				    	 System.out.println("CONFIRMATION: "+conf );
				     }
				     else {
				    	 System.out.println("TEST FAILED!");
				     }
				     

				     // 5.Close the Browser
				     driver.close();
	

	}

}
