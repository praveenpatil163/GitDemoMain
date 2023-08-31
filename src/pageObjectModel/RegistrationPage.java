package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//Here in the POM . we can orginise the page elements, where as in the normal script we can't organise the script. 
//Here there are two parts in the POM. 1. IDentification 2. Operation/action.


public class RegistrationPage {
	
	//Creating the reference for the webdriver.
	WebDriver driver;

	//Locators
	By Register=By.linkText("REGISTER");
	By firstName=By.name("firstName");
	By lastName=By.name("lastName");
	By phoneNo=By.name("phone");
	By emailID=By.id("userName");
	By address=By.name("address1");
	By city=By.name("city");
	By state=By.name("state");
	By postalCode=By.name("postalCode");
	By country=By.name("country");
	By userName=By.name("email");
	By password=By.name("password");
	By comfirmPassword=By.name("confirmPassword");
	By submit=By.name("submit");
	
	
	//Creating the constructors.
	RegistrationPage(WebDriver d){
		driver=d;
	}
	
	//Methods
	
	public void regLink() {
		driver.findElement(Register).click();
	}
	
	public void enterFirstName(String fname) {
		driver.findElement(firstName).sendKeys(fname);
	}
	
	public void enterLastName(String lname) {
		driver.findElement(lastName).sendKeys(lname);
	}
	
	public void enterPhoneNo(String phNo) {
		driver.findElement(phoneNo).sendKeys(phNo);
	}
	
	public void enterEmailID(String usName) {
		driver.findElement(emailID).sendKeys(usName);
	}
	
	public void enterAddress(String eID) {
		driver.findElement(address).sendKeys(eID);
	}
	
	public void enterCity(String cty) {
		driver.findElement(city).sendKeys(cty);
	}
	
	public void enterState(String stat) {
		driver.findElement(state).sendKeys(stat);
	}
	
	public void enterPostalCode(String Pcode) {
		driver.findElement(postalCode).sendKeys(Pcode);
	}
	
	public void enterCountry(String countryy) {
		Select S=new Select(driver.findElement(country));
		S.selectByVisibleText(countryy);
	}
//	public void enteruserName(String usrNam) {
//		driver.findElement(userName).sendKeys(usrNam);
//	}
	public void enterUserName(String usrNam) {
		driver.findElement(userName).sendKeys(usrNam);
	}
	public void enterPassword(String pswd) {
		driver.findElement(password).sendKeys(pswd);
	}
	public void enterConfirmPassword(String pswd) {
		driver.findElement(comfirmPassword).sendKeys(pswd);
	}
	public void clickSubmit() {
		driver.findElement(submit).click();
	}
	
}
