package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// 1.Define the WebDriver
		System.setProperty("webdriver.chrome.driver", "C:\\SDETuniversity\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// 2.Open web browser and navigate to the web application
		//https://www.saucedemo.com/
		driver.get("https://www.saucedemo.com/");
		//Find Elements: Locate the element, Determine the action, Pass any parameter
		
		// 3.Enter Email address
		driver.findElement(By.name("user-name")).sendKeys("standard_user");

		// 4.Enter the password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		// 5.Click login
		driver.findElement(By.name("login-button")).click();
		
		// 6.Get Confirmation
		String message = driver.findElement(By.id("item_4_title_link")).getText();
		System.out.println("CONFIRMATION: " + message);
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
	
		
		// 7.Close the browser
		
	
				
		
	}

}
