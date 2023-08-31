package pageObjectModel;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {
	
	@Test
	public void verifyFlightReg() {
		System.setProperty("webdriver.chrome.driver", "C://selenium webdriver//chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//RegistrationPage registration=new RegistrationPage(driver);
		RegistrationPage2 registration=new RegistrationPage2(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
		
		registration.regLink();
		registration.enterFirstName("Sachin");
		registration.enterLastName("Tendulkar");
		registration.enterPhoneNo("121252626");
		registration.enterEmailID("Sachin@gmail.com");
		registration.enterAddress("Ganapati Temple");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		registration.enterCity("Hubli");
		registration.enterState("Karnataka");
		registration.enterPostalCode("582114");
		registration.enterCountry("INDIA");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		registration.enterUserName("Govind");
		registration.enterPassword("Siddharooda");
		registration.enterConfirmPassword("Siddharooda");
		registration.clickSubmit();
		
		
		if (!driver.getTitle().equalsIgnoreCase("Register: Mercury Tours")) {
			System.out.println("Page Title is not matching");
		}
		else {
			System.out.println("Both The title are matching");
		}
	}
}
