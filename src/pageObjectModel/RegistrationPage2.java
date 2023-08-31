package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage2 {
	
	WebDriver driver;
	
	@FindBy(how=How.LINK_TEXT, using="REGISTER")
	WebElement Register;
	
	@FindBy(how=How.NAME, using="firstName")
	WebElement firstName;
	
	@FindBy(how=How.NAME, using="lastName")
	WebElement lastName;
	
	
	@FindBy(how=How.NAME, using="phone")
	WebElement phoneNo;
	
	@FindBy(how=How.ID,  using="userName")
	WebElement emailID;
	
	@FindBy(how=How.NAME, using="address1")
	WebElement address;
	
	@FindBy(how=How.NAME, using="city")
	WebElement city;
	
	@FindBy(how=How.NAME  , using="state")
	WebElement state;
	
	@FindBy(how=How.NAME,  using="postalCode")
	WebElement postalCode;
	
	@FindBy(how=How.NAME,   using="country")
	WebElement country;
	
	@FindBy(how=How.NAME,  using="email")
	WebElement userName;
	
	@FindBy(how=How.NAME,  using="password")
	WebElement password;
	
	@FindBy(how=How.NAME,  using="confirmPassword")
	WebElement comfirmPassword;
	
	@FindBy(how=How.NAME,  using="submit")
	WebElement submit;
	
	//Creating the Constructor.
	
	RegistrationPage2(WebDriver d){
		driver=d;
		//For Registration2 Page we have used @FindBy annotations. in the intiElements we will pass d, and this variable.
		
		PageFactory.initElements(d, this);  //Additional Methods
	}
	
	public void regLink() {
		Register.click();
	}
	
	public void enterFirstName(String fname) {
		firstName.sendKeys(fname);
	}
	
	public void enterLastName(String lname) {
		lastName.sendKeys(lname);
	}
	
	public void enterPhoneNo(String phNo) {
		phoneNo.sendKeys(phNo);
	}
	
	public void enterEmailID(String usName) {
		emailID.sendKeys(usName);
	}
	
	public void enterAddress(String eID) {
		address.sendKeys(eID);
	}
	
	public void enterCity(String cty) {
		city.sendKeys(cty);
	}
	
	public void enterState(String stat) {
		state.sendKeys(stat);
	}
	
	public void enterPostalCode(String Pcode) {
		postalCode.sendKeys(Pcode);
	}
	
	public void enterCountry(String countryy) {
		Select S=new Select(country);
		S.selectByVisibleText(countryy);
	}
//	public void enteruserName(String usrNam) {
//		driver.findElement(userName).sendKeys(usrNam);
//	}
	public void enterUserName(String usrNam) {
		userName.sendKeys(usrNam);
	}
	public void enterPassword(String pswd) {
		password.sendKeys(pswd);
	}
	public void enterConfirmPassword(String pswd) {
		comfirmPassword.sendKeys(pswd);
	}
	public void clickSubmit() {
		submit.click();
	}
	
}
