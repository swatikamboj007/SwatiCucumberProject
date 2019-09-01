package pages.actions;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

//import junit.framework.Assert;
import pages.locators.CreateAnAccountPageLocator;
import utils.SeleniumDriver;

public class CreateAnAccountPageActions {

	String firstNameStr;
	String lastNameStr;
	String passwordStr;
	String addressStr;
	String cityStr;
	String zipCodeStr;
	String mPhoneStr;

	CreateAnAccountPageLocator createAnAccountPageLocator = null;

	//constructor

	public CreateAnAccountPageActions() {

		this.createAnAccountPageLocator = new CreateAnAccountPageLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), createAnAccountPageLocator);
	}
	
	public void generateRandomPassword() {
		
		byte[] array = new byte[6]; // length is bounded by 6
	    new Random().nextBytes(array);
	    String generatedString = new String(array, Charset.forName("UTF-8"));		
	    passwordStr = generatedString;
	}

	public void randomData() {

		firstNameStr = new Faker().firstName();
		lastNameStr = new Faker().lastName();
		addressStr = new Faker().secondaryAddress();		
		cityStr = new Faker().streetName();
		zipCodeStr = new Faker().zipCode();
		mPhoneStr = new Faker().phoneNumber().replace("\\(", "").replace("\\)", "").replace("-", "").substring(0, 10);
				

//		System.out.println("Random generated FirstName" + firstNameStr);
//		System.out.println("Random generated LastName" + lastNameStr);
//		System.out.println("Random generated address" + addressStr);
//		System.out.println("Random generated city" + cityStr);
//		System.out.println("Random generated zipcode" + zipCodeStr);
//		System.out.println("Random generated mobileNo" + mPhoneStr);

	}
	
	public void selectTitle() {
		
		createAnAccountPageLocator.titleMrRadio.click();
	}
	
	public void selectRandomState() {
		int index = new Random().nextInt(50)+1;
		Select state = new Select(createAnAccountPageLocator.stateDropdown);
		state.selectByIndex(index);
	}


 public void fillInData() {
	 
	 createAnAccountPageLocator.titleMrRadio.click();
	 createAnAccountPageLocator.firstName.sendKeys(firstNameStr);
	 createAnAccountPageLocator.lastName.sendKeys(lastNameStr);
	 createAnAccountPageLocator.password.sendKeys(passwordStr);
	 createAnAccountPageLocator.address.sendKeys(addressStr);
	 createAnAccountPageLocator.city.sendKeys(cityStr);
	 createAnAccountPageLocator.postCode.sendKeys(zipCodeStr);
	 createAnAccountPageLocator.mobilePhone.sendKeys(mPhoneStr);
 }
 
 public void clickRegisterButton() {
	 
	 createAnAccountPageLocator.registerButton.click();
 }

public void verifyRegistration(String expectedHeading) {
	
	String actualHeading = createAnAccountPageLocator.myAccountPage.getText().toUpperCase();
	Assert.assertEquals(expectedHeading, actualHeading);
	
	
}

}
