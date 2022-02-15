package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	public static WebDriver open(String browserType) {
		if(browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SDETuniversity\\Software\\chromedriver.exe");
			 return new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.gecko.driver", "C:\\SDETuniversity\\Software\\geckodriver.exe");
			 return new FirefoxDriver();

		}
	}

}
