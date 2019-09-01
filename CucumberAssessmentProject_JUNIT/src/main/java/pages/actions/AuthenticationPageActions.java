package pages.actions;

import java.util.Random;

import org.openqa.selenium.support.PageFactory;

//import junit.framework.Assert;
import org.junit.Assert;
import pages.locators.AuthenticationPageLocator;
import utils.SeleniumDriver;

public class AuthenticationPageActions {
	
	
	AuthenticationPageLocator authenticationPageLocator =null;
    String email;
    
	//Constructor to initialise elements on this page
	public AuthenticationPageActions() {
		
		this.authenticationPageLocator = new AuthenticationPageLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), authenticationPageLocator);
	}
	
	public String generateRandomEmailaddress(String type) {
		
	
		String EMAILCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder testemail = new StringBuilder();
        Random rnd = new Random();
        while (testemail.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * EMAILCHARS.length());
            testemail.append(EMAILCHARS.charAt(index));
        }
        String emailStr = testemail.toString();
        if(type.equalsIgnoreCase("valid") )
        email = emailStr+"@gmail.com";
        else if (type.equalsIgnoreCase("invalid"))
        email = emailStr+" "+"@gmail.com";
       
        return email;
		
	}
	
	public void inputEmailAddress(String emailInput) {
		
		authenticationPageLocator.email.sendKeys(emailInput);
		
	}
	
	public void clickCreateAnAccountButton() {
		
		authenticationPageLocator.createAnAccountButton.click();
	}
	
	public void registerationResult(String expectedMessage) {
		
		String actualMessage = authenticationPageLocator.errorMessageInvalidEmail.getText().toLowerCase();
		
		Assert.assertEquals(expectedMessage, actualMessage);
		
//		if(authenticationPageLocator.errorMessageInvalidEmail.isDisplayed()) {
//			String failureMessage = authenticationPageLocator.errorMessageInvalidEmail.getText();
//			System.out.println("Registeration failed and the Error Message : " + failureMessage);
//		}
//		else {
//			System.out.println("Please fill in User Details");
//		}
	}
	
	
}
