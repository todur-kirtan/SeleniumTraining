package tests;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


@RunWith(value = Parameterized.class)
public class NewAccountDDT {
	String firstName, lastName, phone, email, address, city, state, postalCode, country, userName, password; 
	WebElement nameElement, lastnameElement, usernameElement, phoneElements, emailElement, addressElement, cityElement, stateElement, postalElement, passwordElement, confirmpassElement;
	WebDriver driver;
	
	//This is our test method
	@Test
	public void newAccountTest() {
		System.out.println("NEW RECORD: " + firstName + " " + lastName + " " + phone + " " + email + " " + address + " "
				 + city + " " + state + " " + postalCode + " " + country + " " + userName + " " + password);
	    
		//Define Web Elements
		
		defineWebElements();
	
		
		// 3.Fill out the form
		  
		nameElement.sendKeys(firstName);
		lastnameElement.sendKeys(lastName);
		usernameElement.sendKeys(userName);
		phoneElements.sendKeys("9923884489");
		emailElement.sendKeys(email);
		addressElement.sendKeys(address);
		cityElement.sendKeys(city);
		stateElement.sendKeys(state);
		postalElement.sendKeys(postalCode);
		passwordElement.sendKeys(password);
		confirmpassElement.sendKeys(password);
		
		new Select(driver.findElement(By.name("country"))).selectByVisibleText(country.toUpperCase());
	    
//		driver.findElement(By.name("submit")).click();
		
	}
	
	@Before
	public void setUp() {
		driver = utilities.DriverFactory.open("chrome");
		driver.get("https://demo.guru99.com/test/newtours/register.php");
	}
	
	@After
	public void tearDown() {
		driver.quit();		
	}
	
	//This annotated method is designed to pass parameters into the class via constructor
	@Parameters
	public static List<String[]> getData() {
		return utilities.CSV.get("C:\\SDETuniversity\\Files\\UserAccounts.csv");
		
	}
	
	public void defineWebElements() {
		// Define WebElements
		
		 nameElement = driver.findElement(By.name("firstName"));
		 lastnameElement = driver.findElement(By.name("lastName"));
		 usernameElement = driver.findElement(By.id("userName"));
		 phoneElements = driver.findElement(By.name("phone"));
		 emailElement = driver.findElement(By.cssSelector("input[name='email']"));
		 addressElement = driver.findElement(By.name("address1"));
		 cityElement = driver.findElement(By.name("city"));
		 stateElement = driver.findElement(By.name("state"));
		 postalElement = driver.findElement(By.name("postalCode"));
		 passwordElement = driver.findElement(By.name("password"));
		 confirmpassElement = driver.findElement(By.name("confirmPassword"));
	}
	
	//Constructor that passes parameters to the test method
	public NewAccountDDT(String firstName, String lastName, String phone, String email, String address, String city, String state,
			String postalCode, String country, String userName, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
		this.userName = userName;
		this.password = password;
	}
}
