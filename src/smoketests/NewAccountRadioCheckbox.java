package smoketests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAccountRadioCheckbox {

	public static void main(String[] args) {
		String browserType = "chrome";
		WebDriver driver;
		driver = utilities.DriverFactory.open(browserType);
		driver.get("https://demo.guru99.com/test/radio.html");
		
		String radiobutton = "option1";
		boolean checkbox1 = true;
		boolean checkbox2 = false;
		boolean checkbox3 = false;
		
		
		
		WebElement option2Element = driver.findElement(By.cssSelector("input[name='webform'][value='Option 2'"));
		WebElement option1Element = driver.findElement(By.cssSelector("input[name='webform'][value='Option 1'"));
		WebElement checkbox1Element = driver.findElement(By.id("vfb-6-0"));
		WebElement checkbox2Element = driver.findElement(By.id("vfb-6-2"));
		
				if(radiobutton.equalsIgnoreCase("option2")) {
				option2Element.click();
			}
			else {
				option1Element.click();

			}

		//Check Box algorithm

			if(checkbox1) {
				if(!checkbox1Element.isSelected()) {
					checkbox1Element.click();
				}
			}
			else {
				if(checkbox1Element.isSelected()) {
					checkbox1Element.click();
				}
			}
			checkbox2Element.click();

	}

}
